package com.demoAutomationBookStoreApplication;

import org.openqa.selenium.By;

import generic.BaseTest;

public class Login extends BaseTest{
	
	public void getLoginDetails() {
			
	getDriver().findElement(By.xpath("//button[@id='newUser']")).click();
	
    getDriver().findElement(By.xpath("//input[@id='firstname']")).sendKeys("Kalpana");
	
	getDriver().findElement(By.xpath("//input[@id='lastname']")).sendKeys("Chaula");
	
	getDriver().findElement(By.xpath("//input[@id='userName']")).sendKeys("Kalpana Chaula");
	
	getDriver().findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@123");
	
	getDriver().findElement(By.xpath("//button[@id='register']")).click();

	}
}
