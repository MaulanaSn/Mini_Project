package starter.Users;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.when;

public class GetAOrder {
    private static String url,content, validToken, invalidToken, nullToken;

    public void setUrlOrderIdAndValidToken() {
        url = "https://alta-shop.herokuapp.com/api/orders/17";
        validToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkJheXUiLCJFbWFpbCI6ImJheXVzZXB0eWFuNDNAZ21haWwuY29tIn0.a0gMWUgpOlTv-_7pu9PThdDrZVoKhT14Q4sYkcuH95w";
    }
    public void setUrlOrderIdAndInvalidToken() {
        url = "https://alta-shop.herokuapp.com/api/orders/17";
        invalidToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9";
    }
    public void setUrlOrderIdAndNullToken() {
        url = "https://alta-shop.herokuapp.com/api/orders/17";
        nullToken = "";
    }
    public static void requestOrderIdValidToken(){
        given().header("accept", "*/*")
                .header("Content-Type","application/json")
                .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkJheXUiLCJFbWFpbCI6ImJheXVzZXB0eWFuNDNAZ21haWwuY29tIn0.a0gMWUgpOlTv-_7pu9PThdDrZVoKhT14Q4sYkcuH95w");
        when().get(url);
    }
    public static void requestOrderIdInvalidToken(){
        given().header("accept", "application/json")
                .header("Content-Type","application/json")
                .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9");
        when().get(url);
    }
    public static void requestOrderIdNullToken(){
        given().header("accept", "application/json")
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer ");
        when().get(url);
    }
}
