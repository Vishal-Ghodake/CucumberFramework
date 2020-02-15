package stepDefinations;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.HomePage;

public class HomePageSteps {
	
	 TestContext testContext;
	 HomePage homePage;
		 
	 public HomePageSteps(TestContext context)
	 {
		 testContext = context;
		 homePage = testContext.getPageObjectManager().getHomePage();
	 }
	 
		@Given("^user is on Home Page$")
		public void user_is_on_Home_Page(){
			/*//configFileReader= new ConfigFileReader();
			 webDriverManager = new WebDriverManager();
			//System.setProperty("webdriver.chrome.driver",FileReaderManager.getInstance().getConfigReader().getDriverPath());
			//driver = new ChromeDriver();
			//driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver = webDriverManager.getDriver();
			pageObjectManager = new PageObjectManager(driver);
			homePage = pageObjectManager.getHomePage();*/
			homePage.navigateTo_HomePage();
		}
		
		@When("^he search for \"([^\"]*)\"$")
		 public void he_search_for(String product)  {
			 //home = new HomePage(driver);
			 homePage.perform_Search(product);
		}


}
