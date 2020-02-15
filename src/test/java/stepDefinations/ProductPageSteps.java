package stepDefinations;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.ProductListingPage;

public class ProductPageSteps {
	
	TestContext testContext;
	ProductListingPage productListingPage;
	
	public ProductPageSteps(TestContext Context)
	{
		testContext = Context;
		productListingPage = testContext.getPageObjectManager().getProductListingPage();
	}
	
	@When("^choose to buy the first item$")
	 public void choose_to_buy_the_first_item() {
	//	productListingPage = new ProductListingPage(driver);
		// productListingPage = pageObjectManager.getProductListingPage();
		 productListingPage.select_Product(0);
		 productListingPage.select_color();
		 productListingPage.size();
		 productListingPage.clickOn_AddToCart(); 
		 }
}
