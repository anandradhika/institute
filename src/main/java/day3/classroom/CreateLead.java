package day3.classroom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Set the property for ChromeDriver
		  WebElement username  = driver.findElementById("username");
		  username.sendKeys("DemoSalesManager");
		  driver.findElementById("password").sendKeys("crmsfa");
		  driver.findElementByClassName("decorativeSubmit").click();
		  driver.findElementByLinkText("CRM/SFA").click();
		  
		  

		// Initiate the ChromeBroswer

		// Maximize the browser

		// Enter the UserName

		// Enter the Password

		// Click on Login Button

		// Click on crm/sfa button

		// Click on Leads

		// Click on Create Lead button

		// Enter Company Name

		// Enter First Name

		// Enter Last Name

		// Click on Create Lead (Submit) button

		// Verify the Lead is created by checking the Company or First Name

	}

}
