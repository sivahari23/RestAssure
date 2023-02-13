package com.trg.tetsing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Flipkart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//sivahm//Downloads//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		

	   
	}

}
