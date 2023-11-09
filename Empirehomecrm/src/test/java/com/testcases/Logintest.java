package com.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.LoginPage;
import com.utils.utils;

public class Logintest extends Basetest {

	LoginPage lf;

	public Logintest() {
		super();   //invokes the parent class constructor
	}

	@BeforeMethod
	public void setup() {

		initialization();

		lf = new LoginPage();

	}

	@Test

	public void loginvalidation() {
		lf.verifylogin();
		String Title = driver.getCurrentUrl();
		AssertJUnit.assertEquals(Title, "http://empirehome.myprojectsonline.co.in/");
		
	}

	@AfterMethod
	public void teardown() {
		  
	}

}