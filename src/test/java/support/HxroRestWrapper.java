package support;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class HxroRestWrapper {

    private String baseUrl = "https://staging-identity.hxro.io";
    private static String loginToken;

    private static Map<String, Object> userCreatedInfo;

    public static final String CONTENT_TYPE = "Content-Type";
    public static final String JSON = "application/json";
    public static final String AUTH = "Authorization";
    private static JsonPath metadata;

    public static  Map<String, Object> getUserCreatedInfo() {
        return userCreatedInfo;
    }

    public Map<String, Object> registerUser(Map<String, String> newUser) {

        // prepare
        RequestSpecification requestSpecification = RestAssured
                .given()
                .log().all()
                .header(CONTENT_TYPE, JSON)
                .body(newUser);

        // execute
        Response response = requestSpecification
                .post(baseUrl + "/api/Registration/register-user");

        // verify and extract
        Map<String, Object> result = response
                .then()
                .log().all()
                .statusCode(201)
                .extract()
                .jsonPath()
                .getMap("");

        return userCreatedInfo = result;
    }




















}
