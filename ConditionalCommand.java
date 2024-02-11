package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c://chromedriver//chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		
		
		WebElement firstName=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input"));
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"u_0_d_lG\"]"));
		
		if(firstName.isDisplayed()&& firstName.isEnabled())
		{
			firstName.sendKeys("MarkZukesrburg@gmail.com");
		}
		if(pass.isDisplayed() && pass.isEnabled())
		{
			pass.sendKeys("123456789");
		}

	}

}
