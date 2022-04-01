package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoProject1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("patro.asish8@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'pass']")).sendKeys("Askp@0741");
		driver.findElement(By.xpath("//button[@name = 'login']")).click();
		
		List <WebElement> linkList = driver.findElements(By.tagName("a"));
		
		System.out.println(linkList.size());
		
		for (int i = 0; i<linkList.size(); i++) {
		String linkText = linkList.get(i).getText();
		System.out.println(linkText);
		}
		
	}

}
