package com.bella.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.StepDefinitions.TestBase;

public class CartPage {
	String quant;

	public CartPage() {

		PageFactory.initElements(TestBase.getDriver(), this);
	}
	
	@FindBy(css = "#post-6 > div > div > form > table > tbody hhjhjuucuiop09> tr.woocommerce-cart-form__cart-item.cart_item > td.product-name > a")
	WebElement title;

	public String getProductTitle() {
		String ProductTitle = title.getText();
		return ProductTitle;
	}

	@FindBy(css = "div.quantity input")
	WebElement quantity;

	public String getQuantity() {
		String quant = quantity.getText();
		//System.out.println("Quantity is: "+quant);
		return quant;
	}

	@FindBy(css = "#post-6 > div > div > form > table > tbody > tr.woocommerce-cart-form__cart-item.cart_item > td.product-price > span > bdi")
	WebElement price;

	public String getPrice() {
		String totalPrice = price.getText();
		return totalPrice;
	}

	@FindBy(css = "#post-6 > div > div > div.cart-collaterals > div > div > a")
	WebElement proceed;

	public void clickOnProceed() {
		proceed.click();
	}

}
