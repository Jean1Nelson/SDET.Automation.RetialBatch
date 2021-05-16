package restapi;

import org.json.simple.JSONObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class POSTMethod {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		String baseUri = "http://localhost:3000/users";
		
		
		RestAssured.baseURI=baseUri;
		
		RequestSpecification httpReq = RestAssured.given();
		
		JSONObject hm = new JSONObject();
		hm.put("firstname", "UserFirstName10");
		hm.put("lastname", "UserLastName10");
		hm.put("courseid", 2);
		
		httpReq.header("Content Type", "application/json");
		
		httpReq.body(hm);
		
		Response resp = httpReq.post();
		
		System.out.println("Response Cose:" + resp.getStatusCode());

		System.out.println("Body:");
		System.out.println(resp.getBody().asString());

	}

}
