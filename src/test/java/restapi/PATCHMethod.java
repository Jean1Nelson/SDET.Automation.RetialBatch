package restapi;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PATCHMethod {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		String baseUri = "http://localhost:3000/users/8";
		
		
		RestAssured.baseURI=baseUri;
		
		RequestSpecification httpReq = RestAssured.given();
		
		JSONObject hm = new JSONObject();
		hm.put("firstname", "UserFirstNameChange10");
		
		httpReq.header("Content Type", "application/json");
		
		httpReq.body(hm);
		
		Response resp = httpReq.patch();
		
		System.out.println("Response Cose:" + resp.getStatusCode());

		System.out.println("Body:");
		System.out.println(resp.getBody().asString());

	}

}
