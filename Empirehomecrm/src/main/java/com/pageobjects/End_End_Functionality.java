package com.pageobjects;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Basetest;
import com.utils.utils;

public class End_End_Functionality extends Basetest {

	@FindBy(xpath = "//input[@placeholder='example@gmail.com']")
	WebElement username;

	@FindBy(xpath = "//input[@id='pword']")
	WebElement pword;

	@FindBy(xpath = "//button[@class='btn green_btn']")
	WebElement button;

	@FindBy(xpath = "//a[@class='dropdown-toggle join']")
	WebElement dropdown;

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement Logout;

	@FindBy(xpath = "//a[contains(@class,'btn-success')]")
	WebElement SelectCustomer;

	@FindBy(xpath = "//input[@placeholder='Full Name']")
	WebElement FullName;

	@FindBy(xpath = "//input[@placeholder='Mobile Number']")
	WebElement MobileNumber;

	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement Email;

	@FindBy(xpath = "//input[@placeholder='Whatsapp Number']")
	WebElement WhatsappNumber;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement Save;

	@FindBy(xpath = "//input[@placeholder='Search Name or Number or Mail']")
	WebElement Search;

	@FindBy(xpath = "//button[normalize-space()='Search']")
	WebElement Searchbutton;

	@FindBy(xpath = "// tbody//tr//td//a[contains(text(),'Lakidi Anil')]")
	WebElement clickname;

	@FindBy(xpath = "//a[@href='/Sales/RegisterCustomer']")
	WebElement Registerbutton;

	@FindBy(xpath = "//span[normalize-space()='All Categories']")
	WebElement AllCategories;

	@FindBy(xpath = ".//ul[@class='list']//li")
	List<WebElement> allCategories;

	@FindBy(xpath = "//i[@class='bx bx-search']")
	WebElement search;

	@FindBy(xpath = ".//div[@id='prods']/div")
	List<WebElement> prods;

	@FindBy(xpath = "//a[@class='common-btn']")
	WebElement AddToCart;

	@FindBy(xpath = "	//button[@class='swal-button swal-button--yes']")
	WebElement yesclick;

	@FindBy(xpath = "//i[@class='bx bxs-cart']")
	WebElement cart;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement Quote;

	@FindBy(xpath = ".//button[@type='button']")
	WebElement clickbutton;

	@FindBy(css = "body > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > input:nth-child(1)")
	WebElement deliverycharges;

	@FindBy(css = "body > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > input:nth-child(3)")
	WebElement value;

	@FindBy(xpath = "//div[@class='nice-select form-control open']//li[@class='option'][normalize-space()='1']")
	WebElement WQty;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/button[1]")
	WebElement createsalesorder;

	@FindBy(xpath = "	//a[@class='btn btn-outline-primary']")
	WebElement submit;

	@FindBy(xpath = "//a[@class='dropdown-toggle join']")
	WebElement clickdrop;

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement clickLogout;

	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement clickkeypad;

	@FindBy(xpath = "	//span[normalize-space()='Sales']")
	WebElement clickSales;

	@FindBy(xpath = "//a[@href='/AdminSales/OpenOrders']")
	WebElement clickOpenOrders;

	@FindBy(xpath = "//a[@href='/AdminSales/OpenOrders?pageNumber=4&pageSize=10']")
	WebElement page;

	@FindBy(xpath = ".//div[@class='card-header']")
	List<WebElement> open;

	@FindBy(xpath = ".//input[@placeholder='Remarks']")
	List<WebElement> Remarks;

	@FindBy(xpath = ".//button[@type='submit'][normalize-space()='Create DC']")
	List<WebElement> CreateDC1;

	@FindBy(xpath = "//span[normalize-space()='Dispatch']")
	WebElement Dispatch;

	@FindBy(xpath = "//a[normalize-space()='Ready to Dispatch']")
	WebElement ReadytoDispatch;

	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	WebElement search1;

	@FindBy(xpath = "//a[@class='btn btn-success']")
	WebElement Dispatch1;

	@FindBy(xpath = "//input[@value='true']")
	WebElement checkbox;

	@FindBy(xpath = "//input[@id='EwayBillDetails']")
	WebElement EwayBillDetails;

	@FindBy(xpath = "//input[@id='CustGstNumber']")
	WebElement CustGstNumber;

	@FindBy(xpath = "//input[@id='DespatchedOn']")
	WebElement DespatchedOn;

	@FindBy(xpath = "//button[normalize-space()='Update']")
	WebElement Update;

	@FindBy(xpath = "//a[normalize-space()='Dispatched']")
	WebElement Dispatched;

	@FindBy(xpath = ".//a[@class='btn btn-success']")
	WebElement PrintInvoice;

	public End_End_Functionality() {

		PageFactory.initElements(driver, this);
	}

	public void salesexecutivelogin_Actions() {
		username.sendKeys(prop.getProperty("username2"));
		pword.sendKeys(prop.getProperty("password2"));
		button.click();

	}

	public void SelectCustomer_Actions() throws Throwable {

		SelectCustomer.click();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollTo(0, 800);");

	}

	public void Register_Actions() throws Throwable {
		Thread.sleep(2000);
		Registerbutton.click();
		FullName.sendKeys(prop.getProperty("FullName"));
		MobileNumber.sendKeys(prop.getProperty("MobileNumber"));
		Email.sendKeys(prop.getProperty("Email"));
		WhatsappNumber.sendKeys(prop.getProperty("WhatsappNumber"));
		Thread.sleep(2000);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollTo(0, 800);");

		Thread.sleep(2000);
		Save.click();
	}

	public void Search_Actions() throws Throwable {
		Thread.sleep(2000);
		Search.sendKeys(prop.getProperty("FullName"));
		Searchbutton.click();
	}

	public void clickname_Actions() throws Throwable {
		Thread.sleep(2000);
		clickname.click();
	}

	public void All_Categoriesbutton(int categoryIndex) throws Throwable {
		Thread.sleep(2000);
		AllCategories.click();
		if (categoryIndex >= 0 && categoryIndex < allCategories.size()) {
			allCategories.get(categoryIndex).click();

		}
		search.click();
	}

	public void productslect_Actions(int prodsIndex) throws Throwable {
		if (prodsIndex >= 0 && prodsIndex < prods.size()) {
			prods.get(prodsIndex).click();
		}

	}

	public void AddToCart_Actions() throws Throwable {

		String parentWindowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			if (!windowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollTo(0, 800);");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement addToCartButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='common-btn']")));
		addToCartButton.click();
		yesclick.click();

	}

	public void CreateQuote_Actions() throws Throwable {

		Thread.sleep(2000);
		cart.click();
		Thread.sleep(2000);
		Quote.click();
		Thread.sleep(2000);
		clickbutton.click();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollTo(0, 800);");
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
				"body > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(3) > div:nth-child(2)")));
		element.click();
		Thread.sleep(3000);
		WQty.click();
		Thread.sleep(3000);
		deliverycharges.sendKeys(prop.getProperty("charges"));
		value.sendKeys(prop.getProperty("VC"));
		Thread.sleep(2000);
		createsalesorder.click();
	}

	public void submitPayment_Actions() throws Throwable {
		clickbutton.click();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollTo(0, 300);");
		Thread.sleep(2000);
		submit.click();
	}

	public void Logout_Actions() throws Throwable {
		clickdrop.click();
		Thread.sleep(2000);
		clickLogout.click();

	}

	public void opentosalesorder_Actions(int open123, int Remark, int CreateDC) throws Throwable {
		Thread.sleep(2000);
		clickkeypad.click();
		Thread.sleep(2000);
		clickSales.click();
		Thread.sleep(2000);
		clickOpenOrders.click();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollTo(0, 500)");
		Thread.sleep(2000);
		page.click();
		Thread.sleep(2000);
		jsExecutor.executeScript("window.scrollTo(0, 800)");
		if (open123 >= 0 && open123 < open.size()) {
			open.get(open123).click();
			jsExecutor.executeScript("window.scrollTo(0, 700)");

			Thread.sleep(3000);
			if (Remark >= 0 && Remark < Remarks.size()) {
				Remarks.get(Remark).sendKeys(prop.getProperty("Remarks1"));

				Thread.sleep(2000);
				if (CreateDC >= 0 && CreateDC < CreateDC1.size()) {
					CreateDC1.get(CreateDC).click();
				}
			}
		}

	}

	public void ReadytoDispatch_Actions() throws Throwable {

		Thread.sleep(2000);
		clickkeypad.click();
		Thread.sleep(2000);
		Dispatch.click();
		Thread.sleep(2000);
		ReadytoDispatch.click();
		Thread.sleep(2000);
		search1.sendKeys(prop.getProperty("search1"));
		Thread.sleep(2000);
		Dispatch1.click();
		Thread.sleep(2000);
		checkbox.click();
		Thread.sleep(2000);
		EwayBillDetails.sendKeys(prop.getProperty("EwayBillDetails"));
		Thread.sleep(2000);
		CustGstNumber.sendKeys(prop.getProperty("CustGstNumber"));
		Thread.sleep(2000);
		DespatchedOn.sendKeys(prop.getProperty("DespatchedOn"));
		utils.Robot();
		Thread.sleep(2000);
		Update.click();
	}

	public void Dispatch_Actions() throws Throwable {
		Thread.sleep(2000);
		clickkeypad.click();
		Thread.sleep(2000);
		Dispatch.click();
		Thread.sleep(2000);
		Dispatched.click();
		search1.sendKeys(prop.getProperty("search1"));
		Thread.sleep(2000);
		PrintInvoice.click();
		Thread.sleep(2000);
		utils.captureAndSaveScreenshot(driver,
				"C:\\Users\\DELL\\git\\EmpireHome_Crm_05\\Empirehomecrm\\Screenshots.png");
	}

}
