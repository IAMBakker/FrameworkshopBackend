package helpers;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static utility.Configuration.getProperty;

public class CountriesHelper extends HelperBase {
    private static String baseUri = "webshop.mobiletestautomation.nl/api/";

    public CountriesHelper() {
        super(getProperty("config.properties", "baseURI"), getProperty("keys.properties", "etymology"));
    }

    public Response getCountries(){
        response = given()
                .headers(standardXmlHeaders)
                .relaxedHTTPSValidation()
                .when()
                .log().all()
                .get("/countries");

        response.prettyPrint();
        return response;
    }

    public Response getCountry(int countryId){
        response = given()
                .headers(standardXmlHeaders)
                .relaxedHTTPSValidation()
                .when()
                .log().all()
                .get("/countries/" + countryId);

        response.prettyPrint();
        return response;
    }
}
