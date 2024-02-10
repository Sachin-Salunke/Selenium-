package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test002 {

	public static void main(String[] args) {
		//Headless browser
		System.setProperty("webdriver.chrome.driver", "c:\\\\chromedriver\\\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
		
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com");
		
		//driver.findElement(By.xpath("")).sendKeys("Algorithm");
		
		System.out.println("Title the page: "+driver.getTitle());
		
		driver.close(); 

	}

}
