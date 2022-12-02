package starter.Users;

import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.*;

public class GetAccount {

    private static String url, validToken, invalidToken, nullToken, content;
//    private static String content = {\"data"+":"+"{" +
//            "\"ID\":\"109\"," +
//            "\"Fullname\":\"Bayu\"," +
//            "\"Email\":\"bayuseptyan43@gmail.com\"," +
//            "\"Password\":\"mobil-mobilan \"\","+"}}";

//    public void getID() {
//        Response response = SerenityRest.lastResponse();
//        Integer id = response.body().path("[0].data");
//        try (FileWriter file = new FileWriter("src//test//resources//filejson//infoAccount.json")) {
//            file.write(id);
//            file.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    public void setUrlAndValidToken() {
        url = "https://alta-shop.herokuapp.com/api/auth/info";
        validToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkJheXUiLCJFbWFpbCI6ImJheXVzZXB0eWFuNDNAZ21haWwuY29tIn0.a0gMWUgpOlTv-_7pu9PThdDrZVoKhT14Q4sYkcuH95w";
    }
    public void setUrlAndInvalidToken() {
        url = "https://alta-shop.herokuapp.com/api/auth/info";
        invalidToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9";
    }
    public void setUrlAndNullToken() {
        url = "https://alta-shop.herokuapp.com/api/auth/info";
        nullToken = "";
    }

    public void requestGetAccount() {
        given().header("accept", "*/*")
                .header("Content-Type","application/json")
                .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkJheXUiLCJFbWFpbCI6ImJheXVzZXB0eWFuNDNAZ21haWwuY29tIn0.a0gMWUgpOlTv-_7pu9PThdDrZVoKhT14Q4sYkcuH95w");
        when().get(url);
        }
    public static void requestWithInvalidToken(){
        given().header("accept", "application/json")
                .header("Content-Type","application/json")
                .header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9");
        when().get(url);
    }
    public static void requestWithNullToken(){
        given().header("accept", "application/json")
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer ");
        when().get(url);
    }
    public static void validationOfToken(){
        SerenityRest.then().body(containsString("data"));
    }
    public static void validationOfInvalid(){
        then().body("error", equalTo("token contains an invalid number of segments"));
    }
    public static void validationOfUnauthor(){
        then().body("error", equalTo("invalid token"));
    }
}
