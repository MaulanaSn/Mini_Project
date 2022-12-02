package com.example.app.pages;

import com.example.app.base.BasePageObject;
import com.example.app.utils.GenerateString;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class LoginPage extends BasePageObject {
    private By fillEmailLogin = By.xpath("//android.widget.EditText[1]");
    private By fillPasswordLogin = By.xpath("//android.widget.EditText[2]");
    private By loginButton = By.xpath("//android.widget.Button[@content-desc='Login']");

    public void clickLoginBtn(){click(loginButton);}
    public void inputEmailLogin(String email){
        if(email.equals("random")){
            GenerateString generateString = new GenerateString();
            email = generateString.randomName();
        } else if (email.equals("valid")){
            email = "bayuseptyan43@gmail.com";
        } else if (email.equals("null")){
            email ="";
        }
        click(fillEmailLogin);
        fill(fillEmailLogin,email);
    }
    public void inputPasswordLogin(String password){
        if(password.equals("random")){
            GenerateString generateString = new GenerateString();
            password = generateString.randomName();
        } else if (password.equals("valid")){
            password = "mobil-mobilan ";
        } else if (password.equals("null")){
            password ="";
        }
        click(fillPasswordLogin);
        fill(fillPasswordLogin, password);
    }
}
