package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CartPage extends PageObject {
    private By sonyPs5(){
        return  By.xpath("//div[@id='15']//button[span[contains(text(),'Beli')]]");
    }
    private By sonyPs2(){
        return  By.xpath("//div[@id='24']//button[span[contains(text(),'Beli')]]");
    }
    private By a(){
        return  By.xpath("//div[@id='29']//button[span[contains(text(),'Beli')]]");
    }
    private By samsungPS5(){
        return  By.xpath("//div[@id='42']//button[span[contains(text(),'Beli')]]");
    }
    private By sonyPs1(){
        return  By.xpath("//div[@id='207']//button[span[contains(text(),'Beli')]]");
    }

    private By cart(){
        return By.xpath("//i[@class='v-icon notranslate fas fa-shopping-cart theme--dark']");
    }
    private By seeInfo(){
        return By.xpath("//div[@id='order-15']");
    }
    private By seeTwoInfo(){
        return By.xpath("//div[@id='order-24']");
    }
    private By seeThreeInfo(){
        return By.xpath("//div[@id='order-29']");
    }
    private By seeFourInfo(){
        return By.xpath("//div[@id='order-42']");
    }
    private By seeFiveInfo(){
        return By.xpath("//div[@id='order-207']");
    }


    public void altaStoreUrl(){
        openAt("/");
    }
    public void scrollDown(){
        $("//div[@class='row align-stretch']").sendKeys(Keys.END);
    }
    public void clickBuyButton1(){
        $(sonyPs5()).click();
    }
    public void clickBuyButton2(){
        $(sonyPs2()).click();
    }
    public void clickBuyButton3(){
        $(a()).click();
    }
    public void clickBuyButton4(){
        $(samsungPS5()).click();
    }
    public void clickBuyButton5(){
        $(sonyPs1()).click();
    }

    public void clickCartIcon(){
        $(cart()).click();
    }
    public void displayInfo(){
        $(seeInfo()).isDisplayed();
    }
    public void displayTwoInfo(){
        $(seeTwoInfo()).isDisplayed();
    }
    public void displayThreeInfo(){
        $(seeThreeInfo()).isDisplayed();
    }
    public void displayFourInfo(){
        $(seeFourInfo()).isDisplayed();
    }
    public void displayFiveInfo(){
        $(seeFiveInfo()).isDisplayed();
    }

}
