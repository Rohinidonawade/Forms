package com.demoAutomationWidges;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;

import generic.BaseTest;

public class DatePicker extends BaseTest{
	
	public void selectTheDate() {
		getDriver().findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).sendKeys("o2/05/2000");	
		
	}
	
	public void getDateAndTimeFormat() {
		
		String date = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss").format(Calendar.getInstance().getTime());		
		System.out.println(date); 

   }
}
