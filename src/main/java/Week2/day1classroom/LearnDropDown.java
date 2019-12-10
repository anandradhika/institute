package Week2.day1classroom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	//To open a Chrome Browser
	ChromeDriver driver = new ChromeDriver();
	//Loading a url
	driver.get("http://www.leafground.com/pages/Dropdown.html");
	//maximize window
	driver.manage().window().maximize();
	WebElement dropDown =driver.findElementById("dropdown1");
	//To interact with DropDowns
	Select dd = new Select(driver.findElementByXPath("//select[@multiple]"));
	dd.selectByValue("3");
    List<WebElement> options =dd.getOptions();
    int size = options.size();
   //To read all the options from the drop down
      for (int i = 0; i < size; i++) {
	System.out.println(options.get(i).getText());
	
}

	}

}
