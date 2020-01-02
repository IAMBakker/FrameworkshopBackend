import helpers.CountriesHelper;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Base64;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FirstTest {

    private String uri = "webshop.mobiletestautomation.nl/api/";

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
        System.out.println(response.getBody().asString());
    }
}
