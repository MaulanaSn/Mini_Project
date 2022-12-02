package starter.Users;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class Login {
    private static String url, userName, password;
    public static void setUrlAuth() {
        url = "https://alta-shop.herokuapp.com/api/auth/login";
    }
    public static void validEmailAndPassword(){
        userName = "bayuseptyan43@gmail.com";
        password = "mobil-mobilan ";
    }
    public static void invalidEmailAndPassword(){
        userName = "bayuseptyan43@gmail.co";
        password = "mobil-mobilan";
    }
    public static void validEmailAndInvalidPassword(){
        userName = "bayuseptyan43@gmail.com";
        password = "mobil-mobilan";
    }
    public static void InvalidEmailAndValidPassword(){
        userName = "bayuseptyan43@gmail.co";
        password = "mobil-mobilan ";
    }
    public static void requestPost(){
        given().header("accept", "*/*")
                .header("Content-Type","application/json")
                .body(bodyLogin().toJSONString());
        when().post(url);
    }
    private static JSONObject bodyLogin(){
        JSONObject bodyValid = new JSONObject();
        bodyValid.put("email", "bayuseptyan43@gmail.com");
        bodyValid.put("password", "mobil-mobilan ");
        return bodyValid;
    }
    public static void requestPostIv(){
        given().header("accept", "*/*")
                .header("Content-Type","application/json")
                .body(bodyPostIv().toJSONString());
        when().post(url);
    }
    private static JSONObject bodyPostIv(){
        JSONObject bodyIv = new JSONObject();
        bodyIv.put("email", "bayuseptyan43@gmail.co");
        bodyIv.put("password", "mobil-mobilan ");
        return bodyIv;
    }
    public static void requestPostVi(){
        given().header("accept", "*/*")
                .header("Content-Type","application/json")
                .body(bodyPostVi().toJSONString());
        when().post(url);
    }
    private static JSONObject bodyPostVi(){
        JSONObject bodyVi = new JSONObject();
        bodyVi.put("email", "bayuseptyan43@gmail.com");
        bodyVi.put("password", "mobil-mobilan");
        return bodyVi;
    }
    public static void requestPostIi(){
        given().header("accept", "*/*")
                .header("Content-Type","application/json")
                .body(bodyPostIi().toJSONString());
        when().post(url);
    }
    private static JSONObject bodyPostIi(){
        JSONObject bodyIi = new JSONObject();
        bodyIi.put("email", "bayuseptyan43@gmail.com");
        bodyIi.put("password", "mobil-mobilan");
        return bodyIi;
    }
    public static void validationMessage200(){
        then().body("data",equalTo("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkJheXUiLCJFbWFpbCI6ImJheXVzZXB0eWFuNDNAZ21haWwuY29tIn0.a0gMWUgpOlTv-_7pu9PThdDrZVoKhT14Q4sYkcuH95w"));
    }
    public static void validateStatus400() {
        then().statusCode(400);
    }
    public static void validationOfNotFound(){
        then().body("error", equalTo("record not found"));
    }
    public static void validationOfFailed(){
        then().body("error", equalTo("email or password is invalid"));
    }
    public static void validateStatus404() {
        then().statusCode(404);
    }
}
