/*package stepDefinations;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import dataProvider.ConfigFileReader;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.ProductListingPage;

public class Steps {
     
	 WebDriver driver;
	 HomePage homePage;
	 ProductListingPage productListingPage;
	 CartPage cartPage;
	 CheckoutPage checkoutPage;
	 PageObjectManager pageObjectManager;
	 //ConfigFileReader configFileReader;
	 WebDriverManager webDriverManager;

	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page(){
		//configFileReader= new ConfigFileReader();
		 webDriverManager = new WebDriverManager();
		//System.setProperty("webdriver.chrome.driver",FileReaderManager.getInstance().getConfigReader().getDriverPath());
		//driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver = webDriverManager.getDriver();
		pageObjectManager = new PageObjectManager(driver);
		homePage = pageObjectManager.getHomePage();
		homePage.navigateTo_HomePage();
	}

	@When("^he search for \"([^\"]*)\"$")
	 public void he_search_for(String product)  {
		 //home = new HomePage(driver);
		 homePage.perform_Search(product);
		 }

	@When("^choose to buy the first item$")
	 public void choose_to_buy_the_first_item() {
	//	productListingPage = new ProductListingPage(driver);
		 productListingPage = pageObjectManager.getProductListingPage();
		 productListingPage.select_Product(0);
		 productListingPage.select_color();
		 productListingPage.size();
		 productListingPage.clickOn_AddToCart(); 
		 }

	@When("^moves to checkout from mini cart$")
	 public void moves_to_checkout_from_mini_cart(){
		 //cartPage = new CartPage(driver);
		 cartPage = pageObjectManager.getCartPage();
		 cartPage.clickOn_Cart();
		 cartPage.clickOn_ContinueToCheckout(); 
		 }
	
	@When("^enter personal details on checkout page$")
	 public void enter_personal_details_on_checkout_page() throws InterruptedException {
		 //checkoutPage = new CheckoutPage(driver);
		 checkoutPage = pageObjectManager.getCheckoutPage();
		 checkoutPage.fill_PersonalDetails(); 
		 }

	@When("^place the order$")
	public void place_the_order() throws InterruptedException {
		 //checkoutPage = new CheckoutPage(driver);
		 checkoutPage.check_TermsAndCondition(true);
		 checkoutPage.clickOn_PlaceOrder();
		 
		 //driver.quit();
		 
		webDriverManager.closeDriver();
	}
}	*/