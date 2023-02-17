package com.test.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.drivers.DriverFactory;

import net.bytebuddy.asm.Advice.Enter;

public class TestOraganehrm {
	public static void main(String[]args) {
	String userName ="Admin";
	String password ="admin123";
	WebDriver driver;
	String browserType ="chrome";
	
	driver=DriverFactory.open(browserType);
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(userName);
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password,Keys.ENTER);
	
	
	}
}
