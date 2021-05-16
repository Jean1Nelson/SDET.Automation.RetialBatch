package jsonhandle;

import java.io.FileReader;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonRead {

	public static void main(String[] args) {
		try {

			FileReader fr = new FileReader("src/main/resources/json.txt");

			JsonParser jsonParser = new JsonParser();

			JsonObject obj = jsonParser.parse(fr).getAsJsonObject();

			if (obj.get("family").isJsonArray()) {
				System.out.println("Json Array Type");

				JsonArray arr = obj.get("family").getAsJsonArray();

				for (int i = 0; i < arr.size(); i++) {
					JsonObject obj1 = arr.get(i).getAsJsonObject();

					System.out.println(obj1.get("name"));
				}

			} else if (obj.get("family").isJsonObject()) {
				System.out.println("Json object Type");
			} else if (obj.get("family").isJsonNull()) {
				System.out.println("Null");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
