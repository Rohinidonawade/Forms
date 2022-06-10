package com.demoAutomationInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import generic.BaseTest;

public class Droppable extends BaseTest{

	public void checkDroppableForSimple() {
		getDriver().findElement(By.xpath("//a[@id='droppableExample-tab-simple']")).click();
		
	WebElement drag =getDriver().findElement(By.xpath("//div[@id='draggable']"));
	WebElement drop=	getDriver().findElement(By.xpath("//div[@id='droppable']"));
	Actions actions = new Actions(getDriver());
	actions.dragAndDrop(drag, drop).build().perform();

} 
	
	public void checkDroppableForAccept() {
		getDriver().findElement(By.xpath("//a[@id='droppableExample-tab-accept']")).click();
		
	WebElement acceptable = getDriver().findElement(By.xpath("//div[@class='drag-box mt-4 ui-draggable ui-draggable-handle']/following::div[@id='acceptable']"));
	WebElement notAcceptable= getDriver().findElement(By.xpath("//div[@id='notAcceptable']"));
	WebElement dropAcceptable= getDriver().findElement(By.xpath("//div[@id='acceptable']/following::div[@id='droppable']"));
	Actions actions = new Actions(getDriver());
	actions.dragAndDrop(acceptable, dropAcceptable).build().perform();

} 
	public void checkInnerDroppableForPreventPropegation() {
		getDriver().findElement(By.xpath("//a[@id='droppableExample-tab-preventPropogation']")).click();
		
	WebElement drag =getDriver().findElement(By.xpath("//div[@id='dragBox']"));
	WebElement innerDrop=	getDriver().findElement(By.xpath("//div[@id='notGreedyInnerDropBox']"));
	Actions actions = new Actions(getDriver());
	actions.dragAndDrop(drag, innerDrop).build().perform();
	}
	
	public void checkOuterDroppableForPreventPropegation() {
	WebElement innerdragging=getDriver().findElement(By.xpath("//div[@id='dragBox']"));
	WebElement outterDrop =	getDriver().findElement(By.xpath("//div[@id='greedyDropBox']"));
	Actions actions = new Actions(getDriver());
	actions.clickAndHold(innerdragging).moveToElement(innerdragging).release(innerdragging).perform();
	actions.dragAndDrop(innerdragging, outterDrop).build().perform();
} 
	
	public void checkDroppableForRevertDragable() {
		getDriver().findElement(By.xpath("//a[@id='droppableExample-tab-revertable']")).click();
		
	WebElement dragWillReverse =getDriver().findElement(By.xpath("//div[@id='revertable']"));
	WebElement dropOver=getDriver().findElement(By.xpath("//div[@id='notRevertable']/following::div[@id='droppable']"));
	Actions actions = new Actions(getDriver());
	actions.dragAndDrop(dragWillReverse, dropOver).build().perform();
} 
	
	public void checkDroppableWillNotRevertDragable() {
		
	WebElement dragWillNotReverse =getDriver().findElement(By.xpath("//div[@class='drag-box mt-4 ui-draggable ui-draggable-handle']/following::div[@id='notRevertable']"));
	WebElement dropOverHere=getDriver().findElement(By.xpath("//div[@id='notRevertable']/following::div[@id='droppable']"));
	Actions actions = new Actions(getDriver());
	actions.dragAndDrop(dragWillNotReverse, dropOverHere).build().perform();
} 
}
