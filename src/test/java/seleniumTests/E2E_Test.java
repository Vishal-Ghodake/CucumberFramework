package seleniumTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class E2E_Test 
{
	 
	private static WebDriver driver;
	 public static void main(String[] args) throws InterruptedException 
	 {
	 
	 System.setProperty("webdriver.chrome.driver","E:\\Automation_softwares\\Chrome_Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("http://www.shop.demoqa.com");
	 
	 driver.navigate().to("http://shop.demoqa.com/?s=" + "dress" + "&post_type=product");
	 
	 
	 List <WebElement> items = driver.findElements(By.cssSelector(".noo-product-inner"));
	 items.get(0).click();
	 	 	 	
     WebElement color = driver.findElement(By.xpath("//*[@id=\"pa_color\"]/option[2]"));
     color.click();
     
     WebElement size = driver.findElement(By.xpath("//*[@id=\"pa_size\"]/option[2]"));
     size.click();
     
	 
	 WebElement addToCart = driver.findElement(By.cssSelector("button.single_add_to_cart_button"));
	 addToCart.click(); 
	 
	 
	 WebElement cart = driver.findElement(By.cssSelector(".cart-button"));
	 cart.click();
	 
	 WebElement continueToCheckout = driver.findElement(By.cssSelector(".checkout-button.alt"));
	 continueToCheckout.click(); 
	 
	 Thread.sleep(5000);
	 WebElement firstName = driver.findElement(By.cssSelector("#billing_first_name"));
	 firstName.sendKeys("Lakshay");
	 
	 WebElement lastName = driver.findElement(By.cssSelector("#billing_last_name"));
	 lastName.sendKeys("Sharma");
	 
	 WebElement emailAddress = driver.findElement(By.cssSelector("#billing_email"));
	 emailAddress.sendKeys("test@gmail.com");
	 
	 WebElement phone = driver.findElement(By.cssSelector("#billing_phone"));
	 phone.sendKeys("07438862327");
	 
	 WebElement countryDropDown = driver.findElement(By.xpath("//*[@id=\"billing_country_field\"]/span/span/span[1]/span/span[2]"));
	 countryDropDown.click();
	 Thread.sleep(2000);
	 
	 List<WebElement> countryList = driver.findElements(By.cssSelector("#billing_country"));
	 for(WebElement country : countryList){
	 if(country.getText().equals("India")) {
	 country.click(); 
	 Thread.sleep(3000);
	 break;
	 } 
	 }
	 
	 WebElement city = driver.findElement(By.cssSelector("#billing_city"));
	 city.sendKeys("Delhi");
	 
	 WebElement address = driver.findElement(By.cssSelector("#billing_address_1"));
	 address.sendKeys("Shalimar Bagh");
	 
	 WebElement postcode = driver.findElement(By.cssSelector("#billing_postcode"));
	 postcode.sendKeys("110088"); 
	 
	 WebElement shipToDifferetAddress = driver.findElement(By.cssSelector("#ship-to-different-address-checkbox"));
	 shipToDifferetAddress.click();
	 Thread.sleep(3000);
	 
	 List<WebElement> paymentMethod = driver.findElements(By.cssSelector("ul.wc_payment_methods li"));
	 paymentMethod.get(0).click();
	 
	 WebElement acceptTC = driver.findElement(By.cssSelector("#terms.input-checkbox"));
	 acceptTC.click();
	 
	 WebElement placeOrder = driver.findElement(By.cssSelector("#place_order"));
	 placeOrder.submit();
	 
	 driver.quit();
	 
	 }
	 
	}