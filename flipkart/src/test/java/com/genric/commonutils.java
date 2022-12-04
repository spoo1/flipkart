package com.genric;

import org.openqa.selenium.Alert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class commonutils {
public void acceptAlert(WebDriver driver) {
	Alert alt=driver.switchTo().alert();
	alt.accept();
}
public void acceptDismiss(WebDriver driver) {
	Alert alt=driver.switchTo().alert();
	alt.dismiss();
}
public void handlestaleElementException(WebElement e)
{
	for(int i=0; i<3; i++)
	{
	try {
		e.click();
	}
	catch (StaleElementReferenceException e1) {
	}
	}
}
}
