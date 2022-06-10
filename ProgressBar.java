package com.demoAutomationWidges;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.BaseTest;

public class ProgressBar extends BaseTest {
	
	public void checkProgessBar() {
		getDriver().findElement(By.xpath("//button[@id='startStopButton']")).click();
		
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(50));
		
		getDriver().findElement(By.xpath("//button[@id='startStopButton']")).click();

		
		

	}

}
