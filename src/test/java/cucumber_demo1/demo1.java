package cucumber_demo1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demo1 
{
	WebDriver driver;
	@Given("User open the application newtours.demout.com")
	public void user_open_the_application_newtours_demout_com() 
	{
	    System.out.println("Launch the site");
	    System.setProperty("webdriver.ie.driver","C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
	    driver=new InternetExplorerDriver();
	    driver.manage().window().maximize();
	    driver.get("http://newtours.demoaut.com");
	}

	@When("User clicks on Registration")
	public void user_clicks_on_Registration() 
	{
		System.out.println("Click on register button");
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
	}

	@Then("user validates registration page")
	public void user_validates_registration_page() 
	{
		Assert.assertTrue(driver.getTitle().contains("Register"));
	}

	@When("user enters first name")
	public void user_enters_first_name()
	{
		System.out.println("firstName");
		driver.findElement(By.name("firstName")).sendKeys("shraddha");
	}

	@When("user enters password")
	public void user_enters_password() {
		System.out.println("Password");
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys("mercury");
	}

	@When("user confirms the password")
	public void user_confirms_the_password() {
		System.out.println("Confirm Pasword");
		WebElement cpwd=driver.findElement(By.name("confirmPassword"));
		cpwd.sendKeys("mercury");
	}

	@When("user clicks on the register button")
	public void user_clicks_on_the_register_button() {
		System.out.println("Click on register button");
	}

	@Then("registration successful")
	public void registration_successful() {
		System.out.println("registration successful");
	}
}
