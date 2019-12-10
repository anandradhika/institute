package day3.classroom;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/trains-between-stations/new-delhi-NDLS/mumbai-central-BCT");
		//WebElement eleSource = driver.findElement(by);
		
WebElement table =driver.findElementById("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']");
//List<WebElement>tableRows=table.findElements(By.tagName(tagName(tr));


	}

}
