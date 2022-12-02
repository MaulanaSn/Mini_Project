package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class MyTaskPage extends BasePageObject {
    //header
    private By calculatorHeader = MobileBy.AccessibilityId("Calculator");
    private By historyHeader = MobileBy.AccessibilityId("History");


    //numbers & emblem
    private By number1 = By.xpath("//android.view.View[@content-desc='1']");
    private By number2 = By.xpath("//android.view.View[@content-desc='2']");
    private By number3 = By.xpath("//android.view.View[@content-desc='3']");
    private By number4 = By.xpath("//android.view.View[@content-desc='4']");
    private By number5 = By.xpath("//android.view.View[@content-desc='5']");
    private By number6 = By.xpath("//android.view.View[@content-desc='6']");
    private By number7 = By.xpath("//android.view.View[@content-desc='7']");
    private By number8 = By.xpath("//android.view.View[@content-desc='8']");
    private By number9 = By.xpath("//android.view.View[@content-desc='9']");
    private By number0 = By.xpath("//android.view.View[@content-desc='0']");
    private By number00 = By.xpath("//android.view.View[@content-desc='1']");
    private By number000 = By.xpath("//android.view.View[@content-desc='1']");
    private By equalButton = By.xpath("//android.view.View[@content-desc='=']");
//    private By plusButton = By.xpath("//android.view.View[@content-desc='+']");
    private By plusButton = MobileBy.AccessibilityId(" + ");
    private By minButton = MobileBy.AccessibilityId(" - ");
    private By divButton = MobileBy.AccessibilityId(" ÷ ");
    private By timeButton = MobileBy.AccessibilityId(" x ");
    private By comaButton = MobileBy.AccessibilityId(" . ");
    private By acButton = MobileBy.AccessibilityId(" AC ");
    private By delButton = MobileBy.AccessibilityId(" ⌫ ");
    private By historyIcon = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    private By clearAllButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");

    // result
    private By resultAdd = By.xpath("(//android.view.View[@content-desc='3'])[1]");
    private By resultMin = By.xpath("(//android.view.View[@content-desc='-1'])[1]");
    private By resultDiv = By.xpath("(//android.view.View[@content-desc='0.5'])[1]");
    private By resultTime = By.xpath("(//android.view.View[@content-desc='2'])[1]");


    public void calculatorHeaderDisplayed(){
        isDisplayed(calculatorHeader);
    }
    public void historyHeaderDisplayed(){
        isDisplayed(historyHeader);
    }

    public void clickHistoryIcon(){
        click(historyIcon);
    }
    public void clickClearAllButton(){
        click(clearAllButton);
    }
    public void clickNumber1(){
        click(number1);
    }
    public void clickNumber2(){
        click(number2);
    }
    public void clickNumber3(){
        click(number3);
    }
    public void clickNumber4(){
        click(number4);
    }
    public void clickNumber5(){
        click(number5);
    }
    public void clickNumber6(){
        click(number6);
    }
    public void clickNumber7(){
        click(number7);
    }
    public void clickNumber8(){
        click(number8);
    }
    public void clickNumber9(){
        click(number9);
    }
    public void clickNumber0(){
        click(number0);
    }
    public void clickNumber00(){
        click(number00);
    }
    public void clickNumber000(){
        click(number000);
    }
    public void clickEqualButton(){
        click(equalButton);
    }
    public void clickAddButton(){
        click(plusButton);
    }
    public void clickMinButton(){
        click(minButton);
    }
    public void clickTimeButton(){
        click(timeButton);
    }
    public void clickComaButton(){
        click(comaButton);
    }
    public void clickDivButton(){
        click(divButton);
    }
    public void clickAcButton(){
        click(acButton);
    }
    public void clickDelButton(){
        click(delButton);
    }


    public void theResultAdd(){
        isDisplayed(resultAdd);
    }
    public void theResultMin(){
        isDisplayed(resultMin);
    }
    public void theResultDiv(){
        isDisplayed(resultDiv);
    }
    public void theResultTime(){
        isDisplayed(resultTime);
    }
}