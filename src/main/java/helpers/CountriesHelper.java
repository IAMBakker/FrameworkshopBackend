package helpers;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static utility.Configuration.getProperty;

public class CountriesHelper extends HelperBase {
    private static String baseUri = "webshop.mobiletestautomation.nl/api/";

    public CountriesHelper() {
        super(getProperty("Config.properties", "baseURI"), getProperty("Keys.properties", "etymology"));
    }

    public Response getCountries(){
        response = given()
                .headers(standardJsonHeaders)
                .relaxedHTTPSValidation()
                .when()
                .log().all()
                .get("/customers");

        response.prettyPrint();
        return response;
    }
}
