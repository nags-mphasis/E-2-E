import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

@SuppressWarnings("unchecked")
public class Tests_POSTS {
	
	@Test
	public void test_1a_post() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", "Raghav");
		map.put("job", "Teacher");
		
		System.out.println(map);
	}
	
	@Test
	public void test_1b_post() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", "Raghav");
		map.put("job", "Teacher");
		
		JSONObject request = new JSONObject(map);
		System.out.println(request);
		System.out.println(request.toJSONString(map));
	}
	
	@Test
	public void test_1c_post() {
		
		JSONObject request = new JSONObject();
		
		request.put("name", "Raghav");
		request.put("job", "Teacher");
		
		System.out.println(request.toJSONString(request));
	}
	
	@Test
	public void test_1d_post() {
		
		JSONObject request = new JSONObject();
		
		request.put("name", "Raghav");
		request.put("job", "Teacher");
		
		given()
			.body(request.toJSONString())
		.when()
			.post("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(201);		
	}
	@Test
	public void test_1e_post() {
		
		JSONObject request = new JSONObject();
		
		request.put("name", "Raghav");
		request.put("job", "Teacher");
		
		given()
			.header("Content-Type", "application/json")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(request.toJSONString())
		.when()
			.post("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(201);		
	}
}
