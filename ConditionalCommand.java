package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c://chromedriver//chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\"u_6_b_Vy\"]"));
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"u_6_d_hU\"]"));
		
		if(email.isDisplayed()&& email.isEnabled())
		{
			email.sendKeys("MarkZukesrburg@gmail.com");
		}
		if(pass.isDisplayed() && pass.isEnabled())
		{
			pass.sendKeys("123456789");
			
		}

	}

}
