package cucumber_demo1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class demo2 
{
	WebDriver driver;
	@Given("user opens IE browser and launches the application newtours.demoaut.com")
	public void user_opens_IE_browser_and_launches_the_application_newtours_demoaut_com() 
	{
		System.setProperty("webdriver.ie.driver","C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
	    driver=new InternetExplorerDriver();
	    driver.manage().window().maximize();
	    driver.get("http://newtours.demoaut.com");  
	}

	@When("user enters username as {string} in username field")
	public void user_enters_username_as_in_username_field(String uName) 
	{
	    driver.findElement(By.name("userName")).sendKeys(uName);
	}

	@When("user enters password as {string} in password field")
	public void user_enters_password_as_in_password_field(String pwd) 
	{
		 driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@When("user clicks on sign in")
	public void user_clicks_on_sign_in() 
	{
		driver.findElement(By.name("login")).click();
	}
	@Then("login is successful")
	public void login_is_successful() 
	{
	   Assert.assertTrue(driver.getTitle().contains("Find a Flight"));
       
    }
}
