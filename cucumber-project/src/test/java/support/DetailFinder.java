package support;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.when;

import com.jayway.restassured.response.Response;

public class DetailFinder {
	
	private static Response  response;

public static Response detailFinder(String request)
{
	response=    given().
		    when().header("Content-type","application/json").header("Accept","application/json").
	        body(request).post("http://localhost:8185/capture/data/validate");
	return response;
	    
	        
	        

}
}
