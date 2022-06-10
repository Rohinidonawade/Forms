package com.demoAutomationWidges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import generic.BaseTest;

public class Slider extends BaseTest{
	
	public void checkSliderBar() {
		
	WebElement slider = getDriver().findElement(By.xpath("//input[@class='range-slider range-slider--primary']"));	
        Actions actions = new Actions(getDriver());
        actions.dragAndDropBy(slider, 20, 0);
	}
}
