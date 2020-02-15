package stepDefinations;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import managers.FileReaderManager;
import pageObjects.CheckoutPage;
import testDataTypes.Customer;

public class CheckoutPageSteps {

	TestContext testContext;
	CheckoutPage checkoutPage;
	
	public CheckoutPageSteps(TestContext testContext)
	{
		testContext = testContext;
		checkoutPage = testContext.getPageObjectManager().getCheckoutPage();
	}
	
	@When("^enter \\\"(.*)\\\" personal details on checkout page$")
	 public void enter_personal_details_on_checkout_page(String customerName) throws InterruptedException {
		 //checkoutPage = new CheckoutPage(driver);
		 //checkoutPage = pageObjectManager.getCheckoutPage();
		Customer customer = FileReaderManager.getInstance().getJsonReader().getCustomerByName(customerName);
		checkoutPage.fill_PersonalDetails(customer);
		
		 }

	@When("^place the order$")
	public void place_the_order() throws InterruptedException {
		 //checkoutPage = new CheckoutPage(driver);
		 checkoutPage.check_TermsAndCondition(true);
		 checkoutPage.clickOn_PlaceOrder();
		 //testContext.getWebDriverManager().getDriver().close();
	}
	

}
