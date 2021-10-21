import org.testng.annotations.Test;
import com.jayway.jsonpath.JsonPath;
import static io.restassured.RestAssured.given;

public class Tests {

    @Test
    void getData() {
        String endpoint = "https:/api/";
        String json = given().when().get(endpoint).asString();
        String selectBasedOnName = JsonPath.read(json, "$[?(@.name== \"Death Star\")]").toString();
        System.out.println(selectBasedOnName);
    }


}






