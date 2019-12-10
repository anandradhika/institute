package day1.practice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int caliculate=0,remainder,n=125; int orginal= 0;
		orginal =n;
		while(n>0)
		{
			remainder = n%10;
			n= n/10;
			caliculate = caliculate+(remainder*remainder);
			
		}
		if(caliculate==orginal)
		{
			System.out.println(orginal +"is ArmstrongNumber");
		}
	
		else
		{
			System.out.println(orginal+"is not am");
		}
		
	}

}
