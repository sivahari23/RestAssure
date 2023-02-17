package com.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {
	public static WebDriver open(String browserType) {
		if(browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver,chrome.driver", "C:/Users/sivahm/Downloads/chromedriver_win32");
			return new ChromeDriver();
		}
		else if(browserType.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:/Users/sivahm/Downloads/edgedriver_win64.exe");
		  return new EdgeDriver();
		}
		System.setProperty("webdriver.edge.driver", "C:/Users/sivahm/Downloads/edgedriver_win64.exe");
		  return new EdgeDriver();
	}

}
