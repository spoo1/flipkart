package com.objectrepositry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class home 
{
	@FindBy(xpath = "(//a[@class='d_block relative pp_wrap'])[4]")
	private WebElement womencraves;
	@FindBy(id="edit-submit")
	private WebElement addtocart;
	@FindBy(xpath = "(//a[@role='button'])[2]")
	private WebElement cart;
	@FindBy(xpath="//span[.='Quick View']")
	private WebElement womencart;
	
	public WebElement getWomencraves() {
		return womencraves;
	}
	public WebElement getAddtocart() {
		return addtocart;
	}
	public WebElement getCart() {
		return cart;
	}
	public WebElement getWomencart() {
		return womencart;
	}
}
