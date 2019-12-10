package day3.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadWithSelect {

	public static void main(String[] args) {
		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// Initiate the ChromeBroswer
      ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maximize the browser
		driver.manage().window().maximize();
		// Enter the UserName
		 WebElement username  = driver.findElementById("username");
		  username.sendKeys("DemoSalesManager");
		// Enter the Password
		  driver.findElementById("password").sendKeys("crmsfa");
		// Click on Login Button
		  driver.findElementByClassName("decorativeSubmit").click();
		// Click on crm/sfa button
		  driver.findElementByLinkText("CRM/SFA").click();
		// Click on Leads
		  driver.findElementByLinkText("Create Lead").click();
		  driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		  driver.findElementById("createLeadForm_firstName").sendKeys("radhika");
		  
     WebElement dropDown = driver.findElementById("createLeadForm_dataSourceId");
     
         Select dd = new Select(dropDown);
      
         
         dd.selectByVisibleText("Cold Call");
         dd.selectByVisibleText("Computer Software");
         
         //dd.selectByValue("");

		
	
		

		

		

		

		

		
		// Click on Create Lead button

		// Enter Company Name

		// Enter First Name

		// Enter Last Name

		// Select 'Source' as 'Other' (Handling DropDown)

		// Select 'Preferred Currency' as 'INR'

		// Click on Create Lead (Submit) button

		// Verify the Lead is created by checking the Company or First Name

	}

}
