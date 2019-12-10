package seleniume.selfpractice;
import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementconceptTagNmae {

	public static void main(String[] args) {

		//	Launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		java.util.List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println(linkList.size());
		for(int i =0;i<linkList.size();i++)
		{
		String linklist	=linkList.get(i).getText();
		System.out.println(linklist);
		}
	}

}
