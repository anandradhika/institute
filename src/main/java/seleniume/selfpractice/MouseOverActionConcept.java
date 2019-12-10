package seleniume.selfpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActionConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
      ChromeDriver driver = new ChromeDriver();
      driver.get("http://mrbool.com/");
      driver.manage().window().maximize();
      Actions action = new Actions(driver);
      action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
      driver.findElementByLinkText("Articles").click();
     
      
	} 

}
