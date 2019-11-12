package cucumber_demo1;

import cucumber.api.java.en.Given;

public class demo3_specificScenario 
{

	@Given("user enters the credentials")
	public void user_enters_the_credentials() 
	{
	    System.out.println("Login");
	}

	@Given("user enters the product name on serach bar which is to be searched")
	public void user_enters_the_product_name_on_serach_bar_which_is_to_be_searched() 
	{
		 System.out.println("SearchProduct");
	}

	@Given("user adds the product to the cart")
	public void user_adds_the_product_to_the_cart() 
	{
		 System.out.println("AddToCart");
	}

	@Given("user makes the payment")
	public void user_makes_the_payment() 
	{
		 System.out.println("Payment");
	}

	@Given("user logs out successfully")
	public void user_logs_out_successfully() 
	{
		 System.out.println("LogOut");
	}
}
