package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LogoutPage extends PageObject {
    private By personIcon(){
        return By.xpath("//div/button[2]/span/i");
    }
    private By logoutIcon(){
        return By.xpath("//div/div[2]/div/div[2]/div[1]/i");
    }
    public void clickPersonIcon(){
        $(personIcon()).click();
    }
    public void clickLogoutIcon(){
        $(logoutIcon()).click();
    }
}
