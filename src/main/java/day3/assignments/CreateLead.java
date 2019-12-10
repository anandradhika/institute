package day3.assignments;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import day1.classroom.Chrome;

public class CreateLead {
	public static void main(String[] args) {
		//	Launch the browser
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
   WebElement username	= driver.findElementById("username");
     username.sendKeys("DemoSalesManager");
     driver .findElementById("password").sendKeys("crmsfa");;
     driver.findElementByClassName("decorativeSubmit").click();
     driver.findElementByLinkText("CRM/SFA").click();
     driver.findElementByLinkText("Create Lead").click();
     driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
     driver.findElementById("createLeadForm_firstName").sendKeys("Radhika");
     driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Radhika");
     driver.findElementById("createLeadForm_lastNameLocal").sendKeys("paka");
     driver.findElementById("createLeadForm_personalTitle").sendKeys("hello");
   WebElement dropDown =  driver.findElementById("createLeadForm_dataSourceId");
    Select dd = new Select(dropDown);
    //dd.selectByVisibleText("Conference");
    dd.selectByValue("LEAD_DIRECTMAIL");
    driver.findElementById("createLeadForm_generalProfTitle").sendKeys("TestLeaf");
    driver.findElementById("createLeadForm_annualRevenue").sendKeys("Profit");
    driver.findElementById("createLeadForm_generalProfTitle");
 WebElement  dropDown1 = driver.findElementById("createLeadForm_industryEnumId");
 Select dd1 = new Select(dropDown1);
 dd1.selectByValue("IND_SOFTWARE");
 WebElement  dropDown2 =  driver.findElementById("createLeadForm_ownershipEnumId");
 Select dd2 = new Select(dropDown2);
 dd2.selectByValue("OWN_PARTNERSHIP");
 driver.findElementById("createLeadForm_sicCode").sendKeys("8742");
 driver.findElementById("createLeadForm_description").sendKeys("Good Company");
 driver.findElementById("createLeadForm_importantNote").sendKeys("TestLeaf 9th Anniversary Celebration ");
	driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("+91");
	
	driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("60061");
	driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("images");
	driver.findElementById("createLeadForm_departmentName").sendKeys("Software");
	driver.findElementById("createLeadForm_currencyUomId").sendKeys("Indian Rupee");
	driver.findElementById("createLeadForm_numberEmployees").sendKeys("101");
	driver.findElementById("createLeadForm_tickerSymbol").sendKeys(" collection");
	driver.findElementById("createLeadForm_primaryEmail").sendKeys("pakaradhika87@gmail.com ");
	driver.findElementById("createLeadForm_generalToName").sendKeys(" Radhika");
	driver.findElementById("createLeadForm_generalAddress1").sendKeys("medawakam ");
	driver.findElementById("createLeadForm_generalCity").sendKeys(" chennai");
	driver.findElementById("createLeadForm_generalPostalCode").sendKeys("60061");
	driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("600001");
	driver.findElementByClassName("createLeadForm_primaryPhoneNumber").sendKeys("122");
	driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("company details");
	driver.findElementById("createLeadForm_generalAttnName").sendKeys("radhika paka");
	driver.findElementById("createLeadForm_generalAddress2").sendKeys("medawakkam ,chennai");
	WebElement dropDown3 =	driver.findElementById("createLeadForm_generalStateProvinceGeoId");
	Select dd3= new Select(dropDown3);
	dd3.selectByValue("IN");
		
	
      WebElement dropDown4 =	driver.findElementById("createLeadForm_generalCountryGeoId");
   Select dd4= new Select(dropDown4);
   dd3.selectByValue("IND");
   driver.findElementByClassName("submitButton").click();
	
	}
		  
	
		
}
