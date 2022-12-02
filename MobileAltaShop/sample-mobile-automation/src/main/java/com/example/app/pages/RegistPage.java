package com.example.app.pages;

import com.example.app.base.BasePageObject;
import com.example.app.utils.GenerateString;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class RegistPage extends BasePageObject {
    //header and icon and text
    private By productTitle = By.xpath("//android.view.View[@content-desc='Products']");
    private By loginIcon = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    private By loginTitle = By.xpath("//android.view.View[@content-desc='Login']");
    private By backIcon = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    private By registText = By.xpath("//android.widget.Button[@content-desc='Register']");
    private By registTitle = By.xpath("//android.view.View[@content-desc='Register']");
    private By errorName = MobileBy.AccessibilityId("fullname can not empty");
    private By errorEmail = MobileBy.AccessibilityId("email can not empty");
    private By errorPassword = MobileBy.AccessibilityId("password can not empty");
    private By errorGagalRegist = MobileBy.AccessibilityId("Gagal :(");

    //button and fill (except product)
    private By fillNameRegist = By.xpath("//android.widget.EditText[1]");
    private By fillEmailRegist = By.xpath("//android.widget.EditText[2]");
    private By fillPasswordRegist = By.xpath("//android.widget.EditText[3]");
    private By registButton = By.xpath("//android.widget.Button[@content-desc='Register']");
    private By errorGagalLogin = MobileBy.AccessibilityId("Email atau password tidak valid.");
    public void clickLoginIcon(){
        click(loginIcon);
    }
    public void clickRegistText(){
        click(registText);
    }
//    public void clearFillColumn(){
//        clear(fillNameRegist());
//        clear(fillEmailRegist());
//        clear(fillPasswordRegist());
//    }
    public void inputNameRegist(String name){
        if(name.equals("random")){
            GenerateString generateString = new GenerateString();
            name = generateString.randomName();
        } else if (name.equals("valid")){
            name = "bayu";
        } else if (name.equals("null")){
            name ="";
        }
        click(fillNameRegist);
        fill(fillNameRegist, name);
    }
    public void inputEmailRegist(String email){
        if(email.equals("random")){
            GenerateString generateString = new GenerateString();
            email = generateString.randomEmail();
        } else if (email.equals("valid")){
            email = "bayuseptyan43@gmail.com";
        } else if (email.equals("null")){
            email ="";
        }
        click(fillEmailRegist);
        fill(fillEmailRegist,email);
    }
    public void inputPasswordRegist(String password){
        if(password.equals("random")){
            GenerateString generateString = new GenerateString();
            password = generateString.randomPassword();
        } else if (password.equals("valid")){
            password = "mobil-mobilan ";
        } else if (password.equals("null")){
            password ="";
        }
        click(fillPasswordRegist);
        fill(fillPasswordRegist, password);
    }

    public void clickRegistBtn(){
        click(registButton);
    }
    public void errMsgNameDisplayed(){
        isDisplayed(errorName);
    }
    public void errMsgEmailDisplayed(){
        isDisplayed(errorEmail);
    }
    public void errMsgPwdDisplayed(){
        isDisplayed(errorPassword);
    }
    public void errMsgAllRegistDisplayed(){
        isDisplayed(errorGagalRegist);
    }
    public void success(){
        isDisplayed(productTitle);
    }
    public void errMsgAllLoginDisplayed(){
        isDisplayed(errorGagalLogin);
    }

}
