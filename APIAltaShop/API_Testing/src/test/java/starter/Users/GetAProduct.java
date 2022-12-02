package starter.Users;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class GetAProduct {

    private String url, content;

    public void setUrlAndInvalidToken(){
        url = "https://alta-shop.herokuapp.com/api/products/6";
    }

    public void setUrlAndValidToken(){
        url = "https://alta-shop.herokuapp.com/api/products/16";
    }

    public void requestGetAProduct(){
        given().header("Content-Type", "application/json")
                .header("Accept","*/*");
        when().get(url);
    }
    public void validateSuccessMessage(){
        then().body(containsString("data"));
    }
    public void validateNotFoundMessage(){
        then().body("error", equalTo("record not found"));
    }
}