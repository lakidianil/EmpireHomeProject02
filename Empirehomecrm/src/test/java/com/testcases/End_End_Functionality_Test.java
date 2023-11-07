package com.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.End_End_Functionality;
import com.pageobjects.LoginPage;

public class End_End_Functionality_Test extends Basetest {
	End_End_Functionality End_End;
	LoginPage login;

	public End_End_Functionality_Test() {

		super();

	}

	@BeforeTest
	public void setup() {

		initialization();

		End_End = new End_End_Functionality();
		login = new LoginPage();

	}

	@Test(priority = 1)
	public void End_End_Functionality_verifyLogin() throws Throwable {

		End_End.salesexecutivelogin_Actions();
		
	}

	@Test(priority = 2)
	public void End_End_Functionality_verifySelectCustomer() throws Throwable {
		End_End.SelectCustomer_Actions();

	}

	@Test(priority = 3)
	public void End_End_Functionality_verifyRegister() throws Throwable {
		End_End.Register_Actions();
	}

	@Test(priority = 4)

	public void End_End_Functionality_verifySearch() throws Throwable {

		End_End.Search_Actions();
	}

	@Test(priority = 5)
	public void End_End_Functionality_verifyclickname() throws Throwable {
		End_End.clickname_Actions();

	}

	@Test(priority = 6)
	public void End_End_Functionality_verifyAll_Categoriesbutton() throws Throwable {

		End_End.All_Categoriesbutton(8);

	}

	@Test(priority = 7)
	public void End_End_Functionality_verifyproductslect() throws Throwable {
		End_End.productslect_Actions(0);

	}

	@Test(priority = 8)
	public void End_End_Functionality_verifyAddToCart() throws Throwable {
		End_End.AddToCart_Actions();

	}

	@Test(priority = 9)
	public void End_End_Functionality_verifyCreateQuote() throws Throwable {
		End_End.CreateQuote_Actions();

	}

	@Test(priority = 10)
	public void End_End_Functionality_verifySubmitPayment() throws Throwable {
		End_End.submitPayment_Actions();

	}

	@Test(priority = 11)
	public void End_End_Functionality_verifyLogout() throws Throwable {
		End_End.Logout_Actions();

	}

	@Test(priority = 12)
	public void End_End_Functionality_verifyAdminpanelLogin() throws Throwable {
		login.LoginPage();
		End_End.opentosalesorder_Actions(6, 1, 1);
		End_End.ReadytoDispatch_Actions();
		End_End.Dispatch_Actions();

	}

	@AfterTest
	public void teardown() {

	}

}
