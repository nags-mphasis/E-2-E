import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

@SuppressWarnings("unchecked")
public class Tests_PUT {
	
	@Test
	public void test_1_put() {
		
		JSONObject request = new JSONObject();
		
		request.put("name", "Raghav");
		request.put("job", "Teacher");
		
		given()
			.header("Content-Type", "application/json")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(request.toJSONString())
		.when()
			.put("https://reqres.in/api/users/2")
		.then()
			.statusCode(200)
			.log()
			.all();
	}

}
