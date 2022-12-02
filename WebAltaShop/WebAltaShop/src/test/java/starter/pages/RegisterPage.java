package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import starter.utils.GenerateString;

public class RegisterPage extends PageObject {
    private By fieldName(){
        return By.xpath("//div[label[text() = 'Nama Lengkap']]/input");
    }
    private By fieldEmail(){
        return By.xpath("//div[label[text() = 'Email']]/input");
    }
    private By fieldPassword(){
        return By.xpath("//div[label[text() = 'Password']]/input");
    }
    private By registButton(){
        return By.xpath("//button[span[text() = 'Register']]");
    }
    private By errorMessage(){
        return By.xpath("//i[@class = 'v-icon notranslate v-alert__icon fas fa-exclamation-triangle theme--light error--text']");
    }
    private By validMessage(){
        return By.xpath("//div[contains(text(),'Login')]");
    }


    public void openUrl(){
        openAt("/auth/register");
    }
    public void inputName(String name){
        if(name.equals("random")){
            GenerateString generateString = new GenerateString();
            name = generateString.randomName();
        } else if (name.equals("valid")){
            name = "Maulana Sigit";
        } else if (name.equals("null")){
            name ="";
        }
        $(fieldName()).type(name);
    }
    public void inputEmail(String email){
        if(email.equals("random")){
            GenerateString generateString = new GenerateString();
            email = generateString.randomEmail();
        } else if (email.equals("valid")){
            email = "zighit7@gmail.com";
        } else if (email.equals("null")){
            email ="";
        }
        $(fieldEmail()).type(email);
    }
    public void inputPassword(String password){
        if(password.equals("random")){
            GenerateString generateString = new GenerateString();
            password = generateString.randomPassword();
        } else if (password.equals("valid")){
            password = "Maulana ";
        } else if (password.equals("null")){
            password ="";
        }
        $(fieldPassword()).type(password);

    }
    public void clickRegistBtn(){
        $(registButton()).click();
    }
    public void errorMessageDisplayed(){
        $(errorMessage()).isDisplayed();
    }
    public void validMessageDisplayed(){
        $(validMessage()).isDisplayed();
    }

}
