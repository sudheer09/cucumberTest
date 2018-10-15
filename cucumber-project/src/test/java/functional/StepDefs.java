package functional;

import com.jayway.restassured.response.Response;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import support.DetailFinder;

public class StepDefs {

	String request=null;
	Response response=null;
	
	@Given("I am user and sending personal details to the API$")  
	public void i_am_user_and_sending_personal_details_to_the_api()
	{
		System.out.println("Hello world");
	}
	
	@Given("I am providing the request to send details")
	public void i_am_providing_the_request_to_send_details()
	{
		 request="{\"userName\":\"sud\",\"password\":\"aaaa\",\"gender\":\"male\",\"telephoneNumber\":\"123456\"}";
	}
	
	@Given("I am providing invalid request to api")
	public void i_am_providing_invalid_request_to_api()
	{
		 request="{\"userName\":\"sud\",\"password\":\"aaaa\",\"gender\":\"male\"}";
	}
	
	@When("I submit request details")
	public void i_submit_request_details()
	{
		response= DetailFinder.detailFinder(request);
	}
	@Then("I recieve response as accepted")
	public void i_recieve_response_as_accepted()
	{
		System.out.println("Response   "+response.asString());
		
		if(response.statusCode() != 200)
		{
			throw new NullPointerException();
		}
	}
	
	@Then("I recieve error response")
	public void i_recieve_error_response()
	{
		System.out.println("Response   "+response.asString());
		
		if(response.statusCode() != 500)
		{
			throw new NullPointerException();
		}
	}
}
