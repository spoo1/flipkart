package com.testscripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genric.base;
import com.genric.eventlist;
import com.objectrepositry.home;

import junit.framework.Assert;
@Listeners(eventlist.class)
public class addtocart extends base
{
	@Test
	public void addtocart() 
	{
		test=report.createTest("Add to cart");
		home hp=PageFactory.initElements(driver, home.class);
		cu.handlestaleElementException(hp.getWomencraves());
		hp.getAddtocart().click();
		hp.getCart().click();
		Assert.assertTrue(hp.getWomencart().isDisplayed());
	}
}
