package day1.classroom;

public class Mobile {
	
	public void toCallSome(int num)
	{
		System.out.println("to call the person");
	}
	
	public String getSms()
	{
		System.out.println("answer the call"); 
		return "call";
	}
	public boolean shutDown()
	{
		System.out.println("shutdown");
		return true;
	}

	public static void main(String[] args) {
		Mobile c = new Mobile();
		c.toCallSome(2345678);
		c.getSms();
		c.shutDown();
		
	
	}

}
