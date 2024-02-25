package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		
		driver.manage().window().maximize();
		
		String status=driver.findElement(By.xpath("//div[normalize-space()='kierra@example.com']")).getText();
		
		System.out.println(status);
		
		driver.quit();
		
	}

}
