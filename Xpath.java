package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdrver.chrome.driver", "c://chromedriver//chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/svg/g/path")).sendKeys("Selenium Webdriver");
		//driver.findElement(By.xpath("")).click();
		
		
	

	}

}
