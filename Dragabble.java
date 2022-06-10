package com.demoAutomationInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import generic.BaseTest;

public class Dragabble extends BaseTest{

	public void checkSelectableForSimple() {
		
		getDriver().findElement(By.xpath("//a[@id=['draggableExample-tab-simple']")).click();
		
		Actions actions = new Actions(getDriver());
		WebElement from = getDriver().findElement(By.xpath("//div[@id='dragBox']"));
		WebElement to = getDriver().findElement(By.xpath("//div[@id='dragBox']"));
		actions.dragAndDrop(from, to).perform();
   }
    public void checkSelectableForXAxisRestricted() {
		
		getDriver().findElement(By.xpath("//a[@id=['draggableExample-tab-axisRestriction']")).click();
		
		Actions actions = new Actions(getDriver());
		WebElement xfrom = getDriver().findElement(By.xpath("//div[@id='restrictedX']"));
		WebElement xto = getDriver().findElement(By.xpath("//div[@id='restrictedX']"));
		actions.dragAndDrop(xfrom, xto).perform();
    }
    
    public void checkSelectableForYAxisRestricted() {
			
		Actions actions = new Actions(getDriver());
		WebElement yfrom = getDriver().findElement(By.xpath("//div[@id='restrictedY']"));
		WebElement yto = getDriver().findElement(By.xpath("//div[@id='restrictedY']"));
		actions.dragAndDrop(yfrom, yto).perform();
    }
    
    public void checkSelectableForContainerRestricted() {
    	
		getDriver().findElement(By.xpath("//a[@id=['draggableExample-tab-containerRestriction]")).click();
		
		Actions actions = new Actions(getDriver());
		WebElement containerFrom = getDriver().findElement(By.xpath("//div[@id='draggable ui-widget-content ui-draggable ui-draggable-handle']"));
		WebElement containerTo = getDriver().findElement(By.xpath("//div[@id='draggable ui-widget-content ui-draggable ui-draggable-handle']"));
		actions.dragAndDrop(containerFrom, containerTo).perform();
    }  
}
