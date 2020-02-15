package stepDefinations;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.CartPage;

public class CartPageSteps {
	
	TestContext testContext;
	CartPage cartPage;
	
	public CartPageSteps(TestContext Context)
	{
		testContext = Context;
		cartPage = testContext.getPageObjectManager().getCartPage();
	}

	 @When("^moves to checkout from mini cart$")
	 public void moves_to_checkout_from_mini_cart(){
		 //cartPage = new CartPage(driver);
		//cartPage = pageObjectManager.getCartPage();
		 cartPage.clickOn_Cart();
		 cartPage.clickOn_ContinueToCheckout(); 
		 }
}
