package cucumber_demo1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;

public class CaseStudy4 
{
	WebDriver driver;
	@Given("User opens IE browser and launches the application")
	public void user_opens_IE_browser_and_launches_the_application() 
	{
		 System.setProperty("webdriver.ie.driver","C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		   driver=new InternetExplorerDriver();
		   driver.manage().window().maximize();
		   driver.get("http://localhost:8083/TestMeApp");
	}

	@Given("User clicks on signin button")
	public void user_clicks_on_signin_button() 
	{
		driver.findElement(By.linkText("SignIn")).click();
		 Assert.assertTrue(driver.getTitle().contains("Login"));    
	}

	@Given("User enters the username as {string} in username field")
	public void user_enters_the_username_as_in_username_field(String uname) 
	{
		System.out.println("UserName");
		driver.findElement(By.name("userName")).sendKeys(uname);
	}

	@Given("User enters the Password as {string} in password field")
	public void user_enters_the_Password_as_in_password_field(String pwd) 
	{
		System.out.println("Password");
		   driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@Given("user clicks on Login button")
	public void user_clicks_on_Login_button() 
	{
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Given("verify the homepage")
	public void verify_the_homepage() 
	{
		 Assert.assertTrue(driver.getTitle().contains("Home"));
	}

	@Given("Vser clicks on All Categories and Electronics and Head Phone")
	public void vser_clicks_on_All_Categories_and_Electronics_and_Head_Phone() 
	{
		driver.findElement(By.linkText("All Categories")).click();
		   driver.findElement(By.linkText("Electronics")).click();
		   driver.findElement(By.linkText("Head Phone")).click();
	}

	@Given("User enters as {string} on search bar")
	public void user_enters_as_on_search_bar(String search) 
	{
		driver.findElement(By.id("pname")).sendKeys(search);
	}

	@Given("User clicks on search button")
	public void user_clicks_on_search_button() 
	{
		driver.findElement(By.id("pname")).sendKeys(Keys.ENTER);
	}

	@Given("Verify if the product is added to the cart")
	public void verify_if_the_product_is_added_to_the_cart() 
	{
	   Assert.assertTrue(driver.equals("Cart"));
	}
}
