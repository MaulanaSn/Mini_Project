package starter.Users;

import static net.serenitybdd.rest.SerenityRest.*;

public class GetAllCategories {
    private static String url;

    public static void setUrlCategories(){
        url = "https://alta-shop.herokuapp.com/api/categories";
    }

    public static void requestGetCategories(){
        given().header("accept", "*/*")
                .header("Content-Type", "application/json");
        when().get(url);
    }
    public static void validateStatusCode(){
        then().statusCode(401);
    }

}
