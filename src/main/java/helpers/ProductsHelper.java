package helpers;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static utility.Configuration.getProperty;

public class ProductsHelper extends HelperBase {
    public ProductsHelper() {
        super(getProperty("config.properties", "baseURI"), getProperty("keys.properties", "products"));
    }

    public Response getProducts(){
        response = given()
                .headers(standardXmlHeaders)
                .relaxedHTTPSValidation()
                .when()
                .log().all()
                .get("/products");

        response.prettyPrint();
        return response;
    }

    public Response getProduct(int productId) {
        response = given()
                .headers(standardXmlHeaders)
                .relaxedHTTPSValidation()
                .when()
                .log().all()
                .get("/products/" + productId);

        response.prettyPrint();
        return response;
    }
}
