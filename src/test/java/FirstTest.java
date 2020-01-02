import helpers.CountriesHelper;
import helpers.ProductsHelper;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Base64;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FirstTest {

    @Test
    void should_always_succeed(){
        assertTrue(true);
    }

    @Test
    void should_encrypt_decrypt_succesfully(){
        String originalInput = "Hello World!";
        String encodedInput = Base64.getEncoder().encodeToString(originalInput.getBytes());
        System.out.println(encodedInput);
        String decodedInput = new String(Base64.getDecoder().decode(encodedInput));
        Assertions.assertEquals(originalInput, decodedInput);
    }

    @Test
    void should_return_country_list(){
        Response response = new CountriesHelper().getCountries();
        Assertions.assertEquals(200, response.statusCode(), "Expected valid response.");
    }

    @Test
    void should_return_country(){
        Response response = new CountriesHelper().getCountry(1);
        Assertions.assertEquals(200, response.statusCode(), "Expected valid response.");
    }

    @Test
    void should_return_product_list(){
        Response response = new ProductsHelper().getProducts();
        Assertions.assertEquals(200, response.statusCode());
    }

    @Test
    void should_return_product(){
        Response response = new ProductsHelper().getProduct(2);
        Assertions.assertEquals(200, response.statusCode());
    }

    ///added failing test to check reports in pipeline.
    @Test
    void should_not_return_product(){
        Response response = new ProductsHelper().getProduct(4);
        Assertions.assertEquals(404, response.statusCode());
    }
}
