package com.ui.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegisterTest extends BaseClass {

	
	
	@Test
	public void Register() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("ul li a.ico-register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("ramesh");
		driver.findElement(By.id("LastName")).sendKeys("kudikala");
		driver.findElement(By.id("Email")).sendKeys("rkudikala"+randomNum()+"@yahoo.com");
		driver.findElement(By.id("Password")).sendKeys("testing");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("testing");
		
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(4000);
		driver.findElement(By.className("ico-logout")).click();
		
	}
	
	
}
