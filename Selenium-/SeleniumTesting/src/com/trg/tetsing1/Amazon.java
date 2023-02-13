package com.trg.tetsing1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//sivahm//Downloads//chromedriver_win32//chromedriver.exe");
		
		
		
	     WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//loading amazon
	   driver.get("https://www.amazon.in/");
		//enter the data in search engine
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 12");
		//click search
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/span[1]/input[1]")).click();
		
		//selecting white iphone 12
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/a[1]/div[1]/img[1]")).click();
		
		//change internal memory
		//driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[3]/div[12]/div[37]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/span[1]/span[1]/span[1]/input[1]")).click();
		//Thread.sleep(600);
		driver.manage().window().maximize();
		System.out.println("timing");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("done");
		driver.manage().window().minimize();
		//Thread.sleep(600);
		//driver.findElement(By.xpath("/html[1]/body[1]/div[3]/header[1]/div[1]/div[1]/div[3]/div[1]/a[2]/span[1]")).click();
		driver.findElement(By.partialLinkText("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2FNew-Apple-iPhone-12-128GB%2Fdp%2FB08L5S1NT7%2Fref%3Dnav_signin%3Fcrid%3D28QRUPG")).click();
		//add to cart 
		//driver.findElement(By.id("buy-now-button")).click();
		
	/*	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[3]/div[9]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[31]/div[1]/span[1]/span[1]/span[1]/input[1]")).click();
		
		//driver.navigate().back();
		//add to cart 
				//driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[3]/div[9]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[32]/div[1]/span[1]/span[1]/span[1]/input[1]")).click();
				
				//click cart view
				driver.findElement(By.xpath("/html[1]/body[1]/div[10]/div[3]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/form[1]/span[1]/span[1]/input[1]")).click();
				
				//proccess
				driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
				//number
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("6374056404");
				
		        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]/input[1]")).click();
		        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();
		        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/span[1]/input[1]")).click();
		*/
		

	}

}
