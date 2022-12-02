package com.example.app.pages;

import com.example.app.base.BasePageObject;
import com.example.app.utils.GenerateString;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class AddProductToCartPage extends BasePageObject {
    private By cartNum1 = By.xpath("//android.widget.Button[@content-desc='1']");
    private By cartNum2 = By.xpath("//android.widget.Button[@content-desc='2']");
    private By cartNum3 = By.xpath("//android.widget.Button[@content-desc='3']");
    private By cartNum4 = By.xpath("//android.widget.Button[@content-desc='4']");
    private By cartNum5 = By.xpath("//android.widget.Button[@content-desc='5']");
    private By sonyPS5 = By.xpath("(//android.widget.Button[@content-desc='Beli'])[1]");
    private By sonyPS2 = By.xpath("(//android.widget.Button[@content-desc='Beli'])[1]");
    private By a = By.xpath("(//android.widget.Button[@content-desc='Beli'])[4]");
    private By samsungPS5 = By.xpath("(//android.widget.Button[@content-desc='Beli'])[4]");
    private By sonyPS1 = By.xpath("(//android.widget.Button[@content-desc='Beli'])[1]");

    public void buyProduct(String product){
        if(product.equals("1")){
            click(sonyPS5);
        }else if (product.equals("2")){
            click(sonyPS5);
            scrollUp();
            click(a);
        } else if (product.equals("3")){
            click(sonyPS5);
            scrollUp();
            click(a);
            click(sonyPS2);
        } else if (product.equals("4")){
            click(sonyPS5);
            scrollUp();
            click(a);
            click(sonyPS2);
            scrollUp();
            click(samsungPS5);
        } else if (product.equals("5")){
            click(sonyPS5);
            scrollUp();
            click(a);
            click(sonyPS2);
            scrollUp();
            click(samsungPS5);
            click(sonyPS1);
        }
    }

    public void numberCart(String product){
        if(product.equals("1")){
            isDisplayed(cartNum1);
        }else if (product.equals("2")){
            isDisplayed(cartNum2);
        } else if (product.equals("3")){
            isDisplayed(cartNum3);
        } else if (product.equals("4")){
            isDisplayed(cartNum4);
        }else if (product.equals("5")){
            isDisplayed(cartNum5);
        }
    }
}
