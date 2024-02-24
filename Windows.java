package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		String log=driver.getTitle();
		System.out.println(log);
		
		
		/*iver.navigate().back();
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		String net=driver.getTitle();
		System.out.println(net);
		
		driver.navigate().back();
		driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();
		String map=driver.getTitle();
		System.out.println(map);*/
		driver.quit();  
		
		

	}
}
