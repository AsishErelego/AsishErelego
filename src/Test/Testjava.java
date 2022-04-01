package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testjava {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://35.154.17.76/ams.deekshaheritage.in/");
		driver.findElement(By.id("uname")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@deeksha");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(2000);
		
		List <WebElement> linkList = driver.findElements(By.tagName("button"));
		
		System.out.println(linkList.size());
		
		for (int i = 0; i<linkList.size(); i++) {
		String linkText = linkList.get(i).getText();
		System.out.println(linkText);
		} 
		} 
	}
