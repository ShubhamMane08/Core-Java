class Hockey
{
	public static void main(String[] args) {
		String num = "011011111110001110";
		int cnt1=0,cnt0=0;
		for(int i = 0;i<num.length();i++)
		{
			char ch = num.charAt(i);
			if(ch=='1')
				cnt1++;
			else if(ch=='0')
				cnt0++;
			else{
				cnt1=0;
				cnt0=0;
			}
			if(cnt1==7||cnt0==7)
			{
				System.out.println("Yes");
				System.exit(0);
			}
		}
		System.out.println("No");

		//System.out.println((num.contains("1111111")||num.contains("0000000"))?("YES"):("NO"));
						
	}
}
