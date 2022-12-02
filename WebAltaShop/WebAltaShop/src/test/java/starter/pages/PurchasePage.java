package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PurchasePage extends PageObject {
    private By purchaseIcon(){
        return By.xpath("//div[2]/button/span[contains(text(), 'Bayar')]");
    }
    private By historyTransaction(){
        return By.xpath("//tbody");
    }


    public void clickPurchaseIcon(){
        $(purchaseIcon()).click();
    }
    public void seeHistoryTransaction(){
        $(historyTransaction()).isDisplayed();
    }
}
