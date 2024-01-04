package com.StepDefinitions;

import com.bella.Pages.CheckoutPage;

import io.cucumber.java.en.Given;

public class CheckOutStepDefTest {

	CheckoutPage chk=new CheckoutPage();
	
	@Given("Fill new user details")
	public void fill_new_user_details() {
		chk.setFirstName("reshma");
		chk.setLastName("chavan");
		chk.enterCompanyName("Allstate");
		chk.selectCountyFromDropDown();
		chk.streetAddress("pune");
		chk.streetAddress2("2");
		chk.pincode("413104");
		chk.entertownName("pune");
		chk.getStateName("Maharashtra");
		chk.enterphoneNumber("235645124");
		chk.enteremaildAddrss("reshma@gmail.com");
		chk.clickOnAccountCreationCheckBox();
		chk.clickOnPlaceOrder();
		
	}
}
