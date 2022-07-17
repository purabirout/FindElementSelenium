package com.bridgelabz.FindElementSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.util.List;
public class SelectList {
	 @Test
	    public void fbsignup_SelectType() throws InterruptedException {
	        WebDriverManager.edgedriver().setup();
	        EdgeDriver driver = new EdgeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://www.facebook.com/");
	        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Purabi");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rout");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("routpurabi@96.com");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("routpurabi@96.com");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("test@1234");
	        Thread.sleep(1000);

	        WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	        Select select = new Select(day);
	        List<WebElement> options = select.getOptions();
	        int size = options.size();
	        select.selectByIndex(29);
	        System.out.println("Number of elements present inside the listBox is : " + size);
	        for (WebElement webElement : options) {
	            String text = webElement.getText();
	            System.out.println(text);
	        }
	        Thread.sleep(1000);

	        WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	        Select select1 = new Select(month);
	        List<WebElement> option = select1.getOptions();
	        select1.selectByVisibleText("Jan");
	        select1.isMultiple();
	        int size_month = option.size();
	        System.out.println("Number of elements present inside the Month_List is : " + size_month);
	        Thread.sleep(1000);

	        WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	        Select select2 = new Select(year);
	        select2.selectByValue("1996");
	        Thread.sleep(1000);

	        driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
	        //driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	        Thread.sleep(2000);
	        driver.close();
	    }
}
