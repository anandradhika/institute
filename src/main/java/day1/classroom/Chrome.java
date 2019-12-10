package day1.classroom;

import cucumber.api.cli.Main;

public class Chrome {
	
public String get(String url)
	{
		System.out.println("https //google chrome");
		return "https //google chrome";
	}
	public String getTtile()
	{
		System.out.println("gogle");
		return "gogle";
	}
	public String findElement()
	{
		System.out.println("ch");
		return "ch";
	}
	public boolean close()
	{
		return true;
	}
		public static void main(String[] args) {
			Chrome browser = new Chrome() ;  
			browser.get("https //google chrome");
			String title =browser.getTtile();
			browser.getTtile();
			browser.close();
			
	}
	


		
		

}

