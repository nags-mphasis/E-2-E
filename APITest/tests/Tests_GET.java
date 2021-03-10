import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Tests_GET {
	
	@Test
	public void test_1() {
		given()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.body("data.id[2]", equalTo(9))
			.body("data.first_name", hasItems("Michael","Lindsay","Tobias"))
			.log()
			.all();
	}

}
