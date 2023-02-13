package com.trg.Shopping;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipkart {

	public static void main(String[] args) {
		WebDriver driver1 =new EdgeDriver();
		 driver1.get("https://www.flipkart.com/");
		 driver1.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Buck Bunny wireless mouse",Keys.ENTER);

	}

}
