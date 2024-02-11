package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		
		driver.findElement(By.xpath("//a[normalize-space()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		//driver.findElement(By.xpath("//a[normalize-space()='Windows']")).click();
		String message=driver.getTitle();
		System.out.println(message);
		//driver.findElement(By.xpath("//a[normalize-space()='Open New Seperate Windows']")).click();
		//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		//driver.close();
		driver.quit();
		
		

	}

}
