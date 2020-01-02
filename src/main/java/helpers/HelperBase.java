package helpers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Base64;
import java.util.HashMap;

public class HelperBase {

    protected Response response;
    protected HashMap standardXmlHeaders = new HashMap<String, String>(){
        {
            put("Accept", ContentType.XML.toString());
        }
    };
    protected HashMap standardJsonHeaders = new HashMap<String, String>(){
        {
            put("Output-Format", "JSON");
        }
    };

    public HelperBase(String uri, String encodedKey){
        String key = new String(Base64.getDecoder().decode(encodedKey));
        RestAssured.baseURI = "Https://"+key+"@"+uri;
    }

    protected void printResponse(){
        System.out.println("-------Response:{"+response.statusCode()+"}-------");
        response.prettyPrint();
    }
}
