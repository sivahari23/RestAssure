package com.trg.tetsing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonWithEdge {

	public static void main(String[] args) {
		
		//setup the driver for edge and path for automation path edge 64 
		System.setProperty("webdriver.edge.driver", "C://Users//sivahm//Downloads//edgedriver_win64//msedgedriver.exe");
         //setup the driver for chrome and path 
		System.setProperty("webdriver.chrome.driver", "C://Users//sivahm//Downloads//chromedriver_win32//chromedriver.exe");
		//set up  chrome driver 
		//WebDriver driver =new ChromeDriver();
		
		//setup edge driver
		WebDriver driver1=new EdgeDriver();
		
		// opening in edge 
		driver1.get("https://www.amazon.in/");
		System.out.println("edge operation 1 is done");
		//opening in chrome 
	 // driver.get("https://www.amazon.in/");
		System.out.println("chrome operation 2 is done");
		
		
		//driver.manage().window().maximize();
		System.out.println("chrome operation 3 is done");
		// driver.manage().window().maximize();
		 
		driver1.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 12");
		System.out.println("edge operation  4 is done");
		
	//	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 12");
		System.out.println("chrome operation 5 is done");
		
		driver1.findElement(By.id("nav-search-submit-button")).click();
		System.out.println("edge operation 6 is done");
		
	//   driver.findElement(By.id("nav-search-submit-button")).click();
		System.out.println("chrome operation 7 is done");
		
		driver1.findElement(By.linkText("Apple iPhone 12 (128GB) - White")).click();
		
	//	driver1.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]")).click();
		
		//driver1.findElement(By.id("buy-now-button")).click();
		driver1.findElement(By.xpath(" //input[@id='buy-now-button']")).click();
		
		driver1.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("8610829257");
		driver1.findElement(By.xpath("//input[@id='continue']")).click();
		driver1.findElement(By.linkText("Forgot Password")).click();
		driver1.findElement(By.xpath("//input[@id='continue']")).click();
		//driver1.quit();	
		
	}

}
