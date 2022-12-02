package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class LoginPage extends PageObject {
    private By fieldEmail(){
        return By.xpath("//div[label[text() = 'Email']]/input");
    }
    private By fieldPassword(){
        return By.xpath("//div[label[text() = 'Password']]/input");
    }
    private By loginButton(){
        return By.xpath("//button/span[text() = 'Login']");
    }
    private By recordNotFoundMessage(){
        return By.xpath("//div[contains(text(),' record not found ')]");
    }
    private By invalidMessage(){
        return By.xpath("//div[contains(text(),' email or password is invalid ')]");
    }
    private By AltaStore(){
        return By.xpath("//div[label[contains(text(),'Select category ...')]]");
    }

    public void headerDisplayed(){
        $(AltaStore()).isDisplayed();
    }
    public void loginUrl(){
        openAt("/auth/login");
    }
    public void inputEmail(String email){
        $(fieldEmail()).type(email);
    }
    public void inputPassword(String password){
        $(fieldPassword()).type(password);
    }
    public void clickLoginBtn(){
        $(loginButton()).click();
    }
    public void recordNotFoundMessageDisplayed(){
        $(recordNotFoundMessage()).isDisplayed();
    }
    public void invalidMessageDisplayed(){
        $(invalidMessage()).isDisplayed();
    }
    public void scrollDown(){
        $("//body").sendKeys(Keys.END);
    }
}
