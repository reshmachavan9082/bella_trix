package com.bella.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.StepDefinitions.TestBase;

public class HomePage {
	com.bella.keyword.keyword keyword = new com.bella.keyword.keyword();

	public HomePage() {
		PageFactory.initElements(TestBase.getDriver(), this);
	}

	@FindBy(css = "input#woocommerce-product-search-field-0")
	WebElement searchComponentFalcon;

	public void enterTextIntoSearchComponents(String textToTypeIntoSearchBox) {

		searchComponentFalcon.sendKeys(textToTypeIntoSearchBox, Keys.ENTER);
	}

	@FindBy(css = "#woocommerce-product-search-field-0")
	WebElement searchComponentProton;

	public void enterTextProton(String textToTypeIntoSearchBox) {

		searchComponentProton.sendKeys(textToTypeIntoSearchBox, Keys.ENTER);
	}

	@FindBy(css = "input#woocommerce-product-search-field-0")
	WebElement searchComponentSaturn;

	public void enterTextIntoSearchBarSaturn(String textToTypeIntoSearchBox) {

		searchComponentSaturn.sendKeys(textToTypeIntoSearchBox, Keys.ENTER);
	}

	@FindBy(css = "#main > ul > li.product.type-product.post-26.status-publish.first.instock.product_cat-big-rockets.has-post-thumbnail.sale.downloadable.shipping-taxable.purchasable.product-type-simple > a.woocommerce-LoopProduct-link.woocommerce-loop-product__link > h2")
	WebElement saturnProductTitle;

	public String getSaturnTitle() {
		return saturnProductTitle.getText();

	}

	@FindBy(css = "#main > ul > li.product.type-product.post-31.status-publish.first.instock.product_cat-huge-rockets.has-post-thumbnail.sale.virtual.sold-individually.taxable.purchasable.product-type-simple > a.woocommerce-LoopProduct-link.woocommerce-loop-product__link > h2")
	WebElement falconProductTitle;

	public String getTitle() {
		return falconProductTitle.getText();
	}

	@FindBy(css = "#main > ul > li.product.type-product.post-14.status-publish.first.outofstock.product_cat-small-rockets.has-post-thumbnail.downloadable.purchasable.product-type-simple > a.woocommerce-LoopProduct-link.woocommerce-loop-product__link > h2")
	WebElement protonProductTitle;

	public String getProtonTitle() {
		return protonProductTitle.getText();
	}

	@FindBy(css = "h2.woocommerce-loop-product__title")
	List<WebElement> falconProductList;

	public List<String> getFalconTitles() {
//		List<String> productTitles = new ArrayList<>();
//		for (WebElement string : falconProductList) {
//			productTitles.add(string.getText());
//		}
//		return productTitles;
	//	getTexts(falconProductList);

		return keyword.getTexts(falconProductList);

	}

//	public List<String> getTexts(List<WebElement> element) {
//		List<String> productTitles = new ArrayList<>();
//		for (WebElement string : element) {
//			productTitles.add(string.getText());
//		}
//		return productTitles;
//
//	}

	@FindBy(css = "#site-navigation > div:nth-child(2) > ul > li.current_page_item > a")
	WebElement homeTab;

	public void clickOnHomeTab() {
		homeTab.click();
	}

	@FindBy(css = "#main > ul > li.product.type-product.post-28.status-publish.first.onbackorder.product_cat-big-rockets.has-post-thumbnail.sale.downloadable.taxable.shipping-taxable.purchasable.product-type-simple > a.woocommerce-LoopProduct-link.woocommerce-loop-product__link > img")
	WebElement productClick;

	public void clickToproduct()
	{
		productClick.click();
	}

	@FindBy(css = "#product-28 > div.summary.entry-summary > form > button")
	WebElement clickOnAddToCartBtn;

	public void clickOnAddToCart() {
		clickOnAddToCartBtn.click();
	}

	@FindBy(css = "#content > div > div.woocommerce > div > a")
	WebElement viewCartBtn;

	public void clickOnViewCart() {
		viewCartBtn.click();
	}

}
