package day1.practice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int cal=0,a,temp,n=153;
		while(n>0)
		{
			a=n/10;
			cal = cal+(a*a*a);
		}
		System.out.println();
	}

}
