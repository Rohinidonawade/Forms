package com.demoAutomationBookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import generic.BaseTest;

public class Profile extends BaseTest{
	
	public void checkTheDragElememnt() {
    WebElement element =getDriver().findElement(By.xpath("//a[@class='nav-item nav-link active']"));
  element.click();
   Actions actions = new Actions(getDriver());
   actions.dragAndDropBy(element, 10, 100).build().perform();
	}
	
	
}
