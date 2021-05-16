package jsonhandle;

import java.util.HashMap;

import org.json.simple.JSONObject;

public class JsonWriting {

	public static void main(String[] args) {
	JSONObject hm = new JSONObject();
	
	hm.put("email", "j@sqa.ink.com");
	hm.put("", "");
	hm.put("", "");
	
	HashMap<String, String> h= new HashMap<String,String>();
	h.put("address", "161 tail feather");
	
	hm.put("address", h);
	
	System.out.println(hm);
	
	}
}
