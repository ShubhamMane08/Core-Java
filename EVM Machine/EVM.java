import java.util.Scanner;
class EVM
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int bjp=0, cng=0, ss=0, aap=0, mns=0, nota=0;
		System.out.println();
		System.out.println("       WELCOME   ");
		System.out.println();
		System.out.print("Enter the Population:");
		int population = sc.nextInt();

		for(int i=1;i<=population;i++)
		{
			System.out.println();
			System.out.println("-----------------------------------------");
			System.out.println("Choose the Party :");
			System.out.println("1. BJP");
			System.out.println("2. CONGRESS");
			System.out.println("3. SHIV SENA");
			System.out.println("4. AAP");
			System.out.println("5. MNS");
			System.out.println("6. NOTA");
			System.out.println();
			System.out.print("Enter the option :");
			


			int opt =sc.nextInt();
			if(opt>=1 && opt<=6)
			{
				if(opt==1)
				{
					bjp++;
					System.out.println("ACHE DIN AYENGE");
				}
				if(opt==2)
				{
					cng++;
					System.out.println("BHARAT TODO");
				}
				if(opt==3)
				{
					ss++;
					System.out.println("HUM HAI ASLE SENA");
				}
				if(opt==4)
				{
					aap++;
					System.out.println("MUJE AZAD KARO");
				}
				if(opt==5)
				{
					mns++;
					System.out.println("JAI MAHARASHTRA");
				}
				if(opt==6)
				{
					System.out.println("YOU ARE AN EDUCATED PERSON");
				}
				if(!(opt>=1 && opt<=6))
				{
					i--;
					System.out.println("INVALID OPTION");
				}
			}
		}
			if(bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota)
			{
				System.out.println("BJP HAS WON THE ELECTION BY "+bjp+" votes");
				return;
					
			}
			if(cng>=bjp && cng>=ss && cng>=aap && cng>=mns && cng>=nota)
			{
				System.out.println("CONGRESS HAS WON THE ELECTION BY "+cng+" votes");
				return;
				
				
			}
			if(ss>=bjp && ss>=cng && ss>=aap && ss>=mns && ss>=nota)
			{
				System.out.println("SHIV SENA HAS WON THE ELECTION BY "+ss+" votes");
				return;
				
				
			}
			if(aap>=bjp && aap>=cng && aap>=ss && aap>=mns && aap>=nota)
			{
				System.out.println("AAM ADNI PARTY HAS WON THE ELECTION BY  "+aap+" vote");
				return;
				
			}
			if(mns>=bjp && mns>=cng && mns>=aap && mns>=nota && mns>=ss)
			{
				System.out.println("MANSE HAS WON THE ELECTION BY "+mns+" votes");
				return;
				
			}	
			if(nota>=bjp && nota>=cng && nota>=aap && nota>=nota && nota>=ss)
			{
				System.out.println("NO ONE HAS WON THE ELECTION "+nota+" votes");
				return;
				
			}

		

	}
	
}