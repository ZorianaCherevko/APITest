import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class Tests {


    @Test
    void getData4() {
        given()
                .when()
                .get("https://swapi.dev/api/starships/9/")
                .then()
                .body("name", equalTo("Death Star"))
                .log().body();

    }



}






