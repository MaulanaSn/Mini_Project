package starter.Users;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.when;

public class GetAllOrder {
    private static String url,content, validToken, invalidToken, nullToken;

    public void setUrlOrderAndValidToken() {
        url = "https://alta-shop.herokuapp.com/api/orders";
        validToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkJheXUiLCJFbWFpbCI6ImJheXVzZXB0eWFuNDNAZ21haWwuY29tIn0.a0gMWUgpOlTv-_7pu9PThdDrZVoKhT14Q4sYkcuH95w";
    }
    public void setUrlOrderAndInvalidToken() {
        url = "https://alta-shop.herokuapp.com/api/orders";
        invalidToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9";
    }
    public void setUrlOrderAndNullToken() {
        url = "https://alta-shop.herokuapp.com/api/orders";
        nullToken = "";
    }
    public static void requestOrderValidToken(){
        given().header("accept", "*/*")
                .header("Content-Type","application/json")
                .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkJheXUiLCJFbWFpbCI6ImJheXVzZXB0eWFuNDNAZ21haWwuY29tIn0.a0gMWUgpOlTv-_7pu9PThdDrZVoKhT14Q4sYkcuH95w");
        when().get(url);
    }
    public static void requestOrderInvalidToken(){
        given().header("accept", "application/json")
                .header("Content-Type","application/json")
                .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9");
        when().get(url);
    }
    public static void requestOrderNullToken(){
        given().header("accept", "application/json")
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer ");
        when().get(url);
    }

}
