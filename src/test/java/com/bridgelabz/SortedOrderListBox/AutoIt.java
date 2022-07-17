package com.bridgelabz.SortedOrderListBox;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIt {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\avije\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freepdfconvert.com/pdf-to-word");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='btn-wrapper upload-btn']")).click();
		Runtime.getRuntime().exec("C:\\Users\\avije\\OneDrive\\Documents\\CancelOnPrintWindowPopUp.exe");
		//close the browser 
		//driver.close();
		}
}
