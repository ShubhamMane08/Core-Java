import java.util.Scanner;
class Bank
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String username1 = null;
		String password1= null;
		String address = null;
		long contact = 0;
		double balance=0.0;	

		
		for (; ; )
		{
			System.out.println();
			System.out.println("          WELCOME     ");
		    System.out.println("      STATE BANK OF INDIA     ");
		    System.out.println();
		    System.out.println("1.EXISTING USER ");
		    System.out.println("2.CREATE ACCOUNT");
		    System.out.print("Enter an option :");
			int opt = sc.nextInt();
			if(opt==1)
			{
					if(username1==null)
					{
						System.out.println("CREATE YOUR ACCOUNT FIRST..!!");
						continue;
				
					}
					System.out.println(" LOGIN ");
					System.out.println();

					for(int i=3;i>=1;i--)
					{
						System.out.println();
						System.out.print("Enter Username : ");
						String username=sc.next();
						System.out.print("Enter Password : ");
						String password = sc.next();
						if(username.equals(username1) && password.equals(password1))
						{
							home:
							for (; ; ) 
							{
								System.out.println();
								System.out.println("  HOME PAGE  ");
								System.out.println();
								System.out.println("1. DEPOSIT");
								System.out.println("2. WITHDRAW");
								System.out.println("3. CHECK BALANCE");
								System.out.println("4. MINI STATEMENT");
								System.out.println("5. LOGOUT");
								System.out.println();
								System.out.print("Enter an option :");
								int opt1= sc.nextInt();
								System.out.println();

								switch(opt1)
								{
								 case 1:
								 	{
								 		System.out.println("   DEPOSIT  ");
								 		System.out.println();
								 		System.out.print("Enter the amount : ");
								 		double depositAmt=sc.nextDouble();
								 		balance+=depositAmt;
								 		System.out.println("AMOUNT DEPOSITED SUCCESSFULLY.!!");
								 		System.out.println();
								 		break;
								 	}
								 case 2:
								 	{
								 		System.out.println("    WITHDRAW   ");
								 		System.out.println();
								 		System.out.print("Enter the amount :");
								 		double withdrawAmt=sc.nextDouble();
								 		System.out.print("Enter the PIN : ");
								 		String password2= sc.next();
								 			if(password2.equals(password1))
								 			{


									 			if(balance>=withdrawAmt)
									 			{
									 				balance-=withdrawAmt;
									 				System.out.println("AMOUNT WITHDRAWED SUCCESSFULLY..!!");
									 			}
									 			else 
									 			{
									 				System.out.println("INSIFFICENT FUNDS");
									 			}
									 		
									 		}
									 		else 
									 		{
									 			System.out.println("WRONG PIN");
									 		}
									 		break;	
									 	}
								 	
								 case 3 :
								 	{
								 		
								 		System.out.println();

								 		System.out.println("   CHECK BALANCE   ");
								 		for(int j=3; j>=1;j--)
								 		{
								 			System.out.println();
								 			System.out.print("Enter the PIN : ");
								 			String password3=sc.next();
								 			if(password3.equals(password1))
								 			{
								 				System.out.println(" ACCOUNT BALANCE : "+balance+"rs");
								 				continue home;
								 			}
								 			else
								 			{
								 				System.out.println("WRONG PIN");
								 				System.out.println("Attempt Left : "+(j-1));

								 			}
								 		}
								 		System.out.println("YOUR ACCOUNT HAS BEEN BLOCKED FOR 24 HOURS..!!");


								 	}
								 case 4 :
								 	{
								 		System.out.println("MINI STATEMENT");
								 	}
								 case 5:
								 	{
								 		System.out.println("THANK YOU FOR USING OUR APP");
								 		System.out.println("VISIT AGAIN");
								 		System.exit(0);
								 	}
								}

								
							}


						}
						else 
						{
							System.out.println("INVALID CRED");
							System.out.println("Attempt Left "+(i-1));
						}

					}
					System.out.println("THANK YOU & NEVER VISIT AGAIN");
					System.exit(0);

			}
				else if(opt==2)
				{
					System.out.println();
					System.out.print("Enter Your Name : ");
				    username1=sc.next();
					System.out.print("Enter a Password : ");
					password1 = sc.next();
					sc.nextLine();
					System.out.print("Enter your Address : ");
					address = sc.nextLine();
					System.out.print("Enter Contact Number :  ");
				    contact = sc.nextLong();
					System.out.print("Enter AMOUNT : ");
					balance =sc.nextDouble();

				}
				else 
				{
					System.out.println("INVALID INPUT..!!");


				}	
		}	


		
	}
}