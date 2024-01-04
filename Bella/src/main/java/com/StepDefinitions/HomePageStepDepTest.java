package com.StepDefinitions;

import java.util.Iterator;
import java.util.List;

import org.testng.Assert;

import com.bella.Pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageStepDepTest {

	HomePage home = new HomePage();

	@Given("Type falcon into search component and hit enter key")
	public void type_falcon_into_search_component_and_hit_enter_key() {
		home.enterTextIntoSearchComponents("Falcon");

	}

	@Then("Get product title")
	public void get_product_title_of_particular_product() {
		String title = home.getTitle();
		System.out.println("======================");
		System.out.println("Product title is: " + title);
		Assert.assertTrue(title.contains("Falcon9"));// falcon.contains falcon9=fales

	}

	@Given("Type proton in search bar")
	public void type_proton_in_search_bar() {
		home.enterTextProton("Proton");

	}

	@Then("Get proton product title")
	public void get_product_title_of_proton() {
		String title = home.getProtonTitle();
		System.out.println("======================");
		System.out.println("Product title is: " + title);
		Assert.assertTrue(title.contains("Proton"));
	}

	@Given("Type staurn in search bar")
	public void type_staurn_in_search_bar() {
		home.enterTextIntoSearchBarSaturn("Saturn");
	}

	@Then("Get saturn product title")
	public void get_product_title_of_saturn() {
		String title = home.getSaturnTitle();
		System.out.println("======================");
		System.out.println("Product title is: " + title);
		Assert.assertTrue(title.contains("Saturn"));
	}

	@Given("Enter falcon and get titles of product")
	public void getFalconTitles() {

		home.enterTextIntoSearchComponents("Falcon");
		List<String> titles = home.getFalconTitles();
		for (String string : titles) {
			System.out.println("Falcon titles are:" + string);
		}
	}

}
