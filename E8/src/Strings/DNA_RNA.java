package Strings;

import java.util.Scanner;
public class DNA_RNA {
	 public static void main(String[] args) {
	        addition("1+   2");	        
	    }
	    public static void addition(String add) {
	    	add = add.replace(" ", "");
	        String[] parts = add.split(""); // spliting String for cases where there is no space  
	        int a = Integer.parseInt(parts[0]);
	        int b = Integer.parseInt(parts[2]);
	        System.out.println("ans: " + (a + b));
	    }
	    

}
