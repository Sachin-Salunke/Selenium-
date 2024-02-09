package com.sample;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdeiver.chrome.driver", "c:\\\\chromedriver\\\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		String Exmessage="Login: Mercury Tours";
		String message= driver.getTitle();
		
		//System.out.println(Exmessage);
		
		if(Exmessage.equals(message)==true)
		{
			System.out.println("Test Case is passed");
			
		}
		else
		{
			System.out.println("Test Case Is failed");
		}
		driver.close();
		}

	}


