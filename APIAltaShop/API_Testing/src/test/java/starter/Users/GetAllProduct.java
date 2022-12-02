package starter.Users;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.containsString;

public class GetAllProduct {
    private static String url;

    public static void setUrlProduct(){
        url = "https://alta-shop.herokuapp.com/api/products";
    }

    public static void requestGetAllOfProduct(){
        given().header("Content-Type", "application/json");
        when().get(url);
    }
    public static void validateAllOfTheInfromationOfTheProduct(){
        then().body(containsString("data"));
    }
    public static void validateStatus200(){
        then().statusCode(200);
    }

}