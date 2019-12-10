package day3.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		//Establishing runtime connection for Chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "E:\\TestLeaf Workspace\\myProject\\drivers\\chromedriver.exe");
		//To open a Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		//Loading a url
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement username =driver.findElementById("username");
		username.sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		



	}

}
