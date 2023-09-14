package com.ui.test;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	@BeforeSuite
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	}
	
	public static int randomNum() {
		   Random rand = new Random();
	          int max=100,min=50;
	          return rand.nextInt(max - min + 1) + min;
	   
	}
	@AfterSuite
	public void tearDown() {
		driver.close();
	}
	


}
