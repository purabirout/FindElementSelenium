package com.brodgelabz.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	public String baseUrl = "https://www.facebook.com/";
	String driverPath = "C:\\Users\\avije\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe";
	public WebDriver driver;
	
	@Test(priority = 0)
	public void lauchBrowser() {
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Create New')]")); 
		element.click();
	}
	
	@Test(dataProvider = "dp",priority = 1)
	
	public void firstName_lastName(String firstName,String lastName) throws InterruptedException {
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys(firstName);
		System.out.println("fname Executed");
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		System.out.println("lname Executed");
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
	}
	
	@DataProvider
	public Object[][] dp(){
		Object[][] data = new Object[3][2];
		data[0][0] = "Purabi";
		data[0][1] = "Rout";
		data[1][0] = "priya";
		data[1][1] = "patra";
		data[2][0] = "Monalisa";
		data[2][1] = "Das";
		
		return data;
		
	};
	
}
