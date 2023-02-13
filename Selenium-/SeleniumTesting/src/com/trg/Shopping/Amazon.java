package com.trg.Shopping;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//sivahm//Downloads//chromedriver_win32//chromedriver.exe");
		
		
	
		
	     WebDriver driver= new ChromeDriver();
	     
	     driver.get("https://www.amazon.in/");
	   
	     
	   
	     
	     driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Buck Bunny wireless mouse",Keys.ENTER);
	     
	     List<WebElement> listBunny=driver.findElements(By.partialLinkText("hp wireless"));
             
	     System.out.println(listBunny.size());
	     
	     for(WebElement l : listBunny) {
	    	 System.out.println(l.getText()+"  "+l.getAttribute("src"));
	     }
	     driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
	     
	     driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("deady bear wireless mouse",Keys.ENTER);
	     List<WebElement> listDeadyBear=driver.findElements(By.partialLinkText("bear"));
	     System.out.println(listDeadyBear.size());
	     listDeadyBear.remove(0);
	     for(WebElement l : listDeadyBear) {
	    	 System.out.println(l.getText()+"  "+l.getAttribute("href"));
	     }
	}

}
