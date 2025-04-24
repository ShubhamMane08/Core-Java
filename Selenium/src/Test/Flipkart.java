package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
	       // Close login popup
        try {
            WebElement closePopup = driver.findElement(By.xpath("//span[text()='✕']"));
            closePopup.click();
        } catch (Exception e) {
            System.out.println("Login popup not displayed");
            
        }
        
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Realme Phones");
		searchBox.submit();
		
		   List<WebElement> productNames = driver.findElements(By.className("KzDlHZ"));
	        List<WebElement> productPrices = driver.findElements(By.className("Nx9bqj"));
	        List<WebElement> productRatings = driver.findElements(By.className("XQDdHH"));

	        System.out.println("Comparing Top 5 Products:");
	        double highestRating = 0.0;
	        int bestProductIndex = -1;
	        int lowestPrice = Integer.MAX_VALUE;
	       

	        for (int i = 0; i < 5 && i < productNames.size(); i++) {
	            String name = productNames.get(i).getText();
	            String priceText = (i < productPrices.size()) ? productPrices.get(i).getText() : "₹0";
	            String ratingText = (i < productRatings.size()) ? productRatings.get(i).getText() : "0";

	            int price = Integer.parseInt(priceText.replace("₹", "").replace(",", "").trim());
	            double rating = Double.parseDouble(ratingText.trim());

	            System.out.println((i + 1) + ". " + name + " | Price: ₹" + price + " | Rating: " + rating);

	            if (rating > highestRating || (rating == highestRating && price < lowestPrice)) {
	                highestRating = rating;
	                lowestPrice = price;
	                bestProductIndex = i;
	            }
	        }

	        if (bestProductIndex != -1) {
	            System.out.println("Best Product Selected: " + productNames.get(bestProductIndex).getText());
	            productNames.get(bestProductIndex).click();
	        } else {
	            System.out.println("No suitable product found to click");
	            driver.quit();
	            return;
	        }

	        // Switch to new tab
	        for (String handle : driver.getWindowHandles()) {
	            driver.switchTo().window(handle);
	        }

	        Thread.sleep(3000); // Wait for product page to load

	        try {
	            WebElement addToCartButton = driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]"));
	            addToCartButton.click();
	            System.out.println("Product successfully added to cart!");
	        } catch (Exception e) {
	            System.out.println("Add to Cart button not found or product may be out of stock.");
	            driver.quit();
	            return;
	        }

	        Thread.sleep(3000); // Wait after adding to cart

	        // Go to cart
	        driver.get("https://www.flipkart.com/viewcart?otracker=Cart_Icon_Click");

	        Thread.sleep(3000); // Wait for cart page to load

	        // Fetch product name and price from cart
	        try {
	            WebElement cartProductName = driver.findElement(By.cssSelector("a._2Kn22P.gBNbID"));
	            WebElement cartProductPrice = driver.findElement(By.cssSelector("div._1dqRvU"));

	            System.out.println("----------");
	            System.out.println("Cart Product Details:");
	            System.out.println("Product Name: " + cartProductName.getText());
	            System.out.println("Product Price: " + cartProductPrice.getText());
	            System.out.println("----------");

	        } catch (Exception e) {
	            System.out.println("Unable to fetch product details from cart.");
	        }


	        
	     // ✅ Now remove the item from cart (safe if "Remove" and "Save for later" share the same class)

	        
	     // ✅ Remove item from cart and confirm removal
	        try {
	            boolean itemStillPresent = true;

	            while (itemStillPresent) {
	                List<WebElement> actionButtons = driver.findElements(By.className("sBxzFz"));
	                itemStillPresent = false;

	                for (WebElement button : actionButtons) {
	                    if (button.getText().trim().equalsIgnoreCase("Remove")) {
	                        try {
	                            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);
	                            System.out.println("🗑️ Clicked on Remove button using JavaScript");
	                            Thread.sleep(2000); // Wait for confirmation popup

	                            // Confirm removal if popup appears
	                            try {
	                                WebElement confirmRemove = driver.findElement(By.xpath("//div[text()='Remove Item']"));
	                                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", confirmRemove);
	                                System.out.println("✅ Confirmed removal of item using JavaScript");
	                            } catch (Exception e) {
	                                System.out.println("⚠️ No confirmation popup appeared");
	                            }

	                            Thread.sleep(3000); // Wait for item to be removed from cart
	                            itemStillPresent = true; // Continue loop if at least one item was removed
	                            break; // DOM has changed — break to refresh button list
	                        } catch (Exception jsEx) {
	                            System.out.println("❌ JS click failed: " + jsEx.getMessage());
	                        }
	                    }
	                }
	            }

	            // Refresh cart to verify if it's empty
	            driver.get("https://www.flipkart.com/viewcart?otracker=Cart_Icon_Click");
	            Thread.sleep(3000);

	            try {
	                WebElement emptyCartMessage = driver.findElement(By.xpath("//div[contains(text(),'Your cart is empty!')]"));
	                if (emptyCartMessage.isDisplayed()) {
	                    System.out.println("✅ Cart is successfully empty now!");
	                }
	            } catch (Exception e) {
	                System.out.println("❌ Cart is not empty. Some items might still be present.");
	                List<WebElement> remainingItems = driver.findElements(By.cssSelector("a._2Kn22P.gBNbID"));
	                for (WebElement item : remainingItems) {
	                    System.out.println("Remaining item: " + item.getText());
	                }
	            }

	        } catch (Exception e) {
	            System.out.println("❌ Error while removing item from cart: " + e.getMessage());
	        }
////	         ✅ Now check if cart is empty
//	        try {
//	            WebElement emptyCartMessage = driver.findElement(By.xpath("//div[contains(text(),'Your cart is empty!')]"));
//	            if (emptyCartMessage.isDisplayed()) {
//	                System.out.println("✅ Cart is successfully empty now!");
//	            }
//	        } catch (Exception e) {
//	            System.out.println("Cart is not empty. Something went wrong.");
//	        }
		driver.quit();
	        
	        
	}

}