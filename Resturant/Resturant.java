import java.util.*;
class Resturant
{
	static String name;//null
	static Long contact;//null
	static String address;//null
	static ArrayList<String> basket = new ArrayList<>();
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		for( ; ;)
		{
			System.out.println();
			System.out.println("        JAVA KA DHABA");
			System.out.println();
			System.out.println("1. Create Account");
			System.out.println("2. Existing User");
			System.out.println();
			System.out.print("Enter an option : ");
			int opt=sc.nextInt();
			System.out.println();

			switch(opt)
			{
			case 1: createAccount(sc);break;
			case 2: login(sc);break;
			default:System.out.println("INVALD INPUT");
			}
		}


		
	}
	public static void createAccount(Scanner sc)
	{
		System.out.println("       REGISTRATION ");
		System.out.println();
		System.out.print("Name : ");
		name=sc.next();
		System.out.print("Phone : ");
		contact=sc.nextLong();
		System.out.print("Address : ");
		sc.nextLine();
		address=sc.nextLine();
		System.out.println();
		System.out.println("ACCOUNT CREATED SUCCESSFULLY");

	}

	public static void login(Scanner sc)
	{
		if(name==null)
		{
			System.out.println("CREATE YOUR ACCOUNT FIRST");
			return;// calling method(main)
		}
	
		System.out.println("        LOGIN");
		System.out.println();

		for(int attempt=3;attempt>=1;attempt--)
		{
			System.out.print("Username : ");
			String username = sc.next();
			System.out.print("Password : ");
			Long phone=sc.nextLong();
			System.out.println();
			if(name.equals(username) && contact==phone)
			{
				homePage(sc);
			}
			else 
			{
				System.out.println("INVALID CRED");
				System.out.println("ATTEMPT LEFT : "+(attempt-1));
				System.out.println();

			}
		}
		System.out.println("THANK U & VISIT AGAIN");
		System.exit(0);
	}
	public static void homePage(Scanner sc)
	{
		System.out.println("       HOME PAGE");
		System.out.println();
		System.out.println("1. Menu");
		System.out.println("2. Order");
		System.out.println("3. Table Booking");
		System.out.println("4. Logout");
		System.out.println();
		System.out.print("Enter an option : ");
		int opt =sc.nextInt();

		switch(opt)
		{
		  case 1 : menu(sc);break;
		  case 2: order(sc);break;
		  case 3: tableBooking();break;
		  case 4: System.out.println(" THANK U & VISIT AGAIN"); 
		  		  System.exit(0);break;
		  default: System.out.println("Invalid Input ");break;

		}
	}

	public static void menu(Scanner sc )
	{	
		
		for (; ; ) 
		{
			System.out.println();
			System.out.println("      MENU  ");
			System.out.println("101 : Butter Chicken = 450/-");
			System.out.println("102 : Chicken Biryani = 400/-");
			System.out.println("103 : Shahi Paneer = 380/-");
			System.out.println("104 : Mix Veg = 420/-");
			System.out.println("105 : Roti = 35/-");
			System.out.println("106 : Exit Menu");
			System.out.println();
			System.out.print("Enter an food id : ");
			int id = sc.nextInt();
			switch(id)
			{
			  case 101:
			  	{
			  		basket.add("101 : Butter_Chicken = 450");
			  		System.out.println("Butter Chicken Added inside the Basket ");
			  		break;
			  	}
			  	case 102:
			  	{
			  		basket.add("102 : Chicken_Biryani = 400");
			  		System.out.println("Chicken Biryani Added inside the Basket ");
			  		break;
			  	}
			  	case 103:
			  	{
			  		basket.add("103 : Shahi Paneer = 380");
			  		System.out.println("Shahi Paneer Added inside the Basket ");
			  		break;
			  	}
			  	case 104:
			  	{
			  		basket.add("104 : Mix_Veg = 420");
			  		System.out.println("Mix Veg Added inside the Basket ");
			  		break;
			  	}
			  	case 105:
			  	{
			  		basket.add("105 : Roti = 35");
			  		System.out.println("Roti Added inside the Basket ");
			  		break;
			  	}
			  	case 106:return;
			  	
			  default:{System.out.println("Invalid food Id");break;}
			}


			
		}

	}
	public static void order(Scanner sc)
	{
		System.out.println();
		System.out.println("       ORDERS ");
		System.out.println();
		if(basket.size()==0)
		{
			System.out.println("BASKET IS EMPTY ADD FOOD ITEMS.");
		}
		for(String foodItem : basket)
		{
			System.out.println(foodItem);
		}
		  System.out.println();
		  System.out.println("1. Cancel Order");
		  System.out.println("2. Remove Food Item.");
		  System.out.println("3. Proceed to Payment.");
		  System.out.println();
		  System.out.print("Enter the option : ");
		  int opt = sc.nextInt();
		  System.out.println();
		  switch(opt)
		  {
		  	case 1:
		  		{
		  			System.out.println("Order Cancelled ");
		  			basket.clear();
		  		}
		  	case 2: 
		  		{
		  			System.out.print("Enter foodId : ");
		  			int foodId = sc.nextInt();
		  			removeFoodId(foodId);
		  			break;
		  		}
		  	case 3: 
		  		{
		  			billGenerate();
		  			break;
		  		}
		  }
	}
	public static void removeFoodId(int foodId)
	{
		ArrayList<String> dupBasket = new ArrayList<>(basket);
		int index=0;
		boolean flag= false;
		for(String foodItem : dupBasket)
		{
			String []arr= foodItem.split(" ");
			if(arr[0].equals(foodId+""))
			{
				dupBasket.remove(index);
				flag=true;
				System.out.println("FOOD ITEM REMOVED ");
			}
			index++;
		}
		if(!flag)
		{
			System.out.println("FOOD ITEM DOESN'T EXSIST IN BASKET");
		}
		basket=dupBasket;

	}
	public static void tableBooking()
	{
		System.out.println();
		System.out.println("     Table Booking ");
		System.out.println();
	}
	public static void billGenerate()
	{
		double totalBill=0;
		for(String foodItem : basket)
		{
			String []arr= foodItem.split(" ");
			totalBill += Double.parseDouble(arr[4]);
		}
		System.out.println("Total Bill : "+totalBill+" rs");
	}


}