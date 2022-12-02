package com.example.app.base;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class BasePageObject {
    public AndroidDriver<AndroidElement> getDriver(){
        return driver;
    }

    public WebDriverWait onWait(){
        return new WebDriverWait(getDriver(), 60, 2000);
    }
    public AndroidElement find(By locator){
        return (AndroidElement) onWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void click(By locator){
        AndroidElement elm = find(locator);
        elm.click();
    }

    public void isDisplayed(By locator){
        AndroidElement elm = find(locator);
        elm.isDisplayed();
    }

    public void fill(By locator, String input){
        AndroidElement elm = find(locator);
        elm.sendKeys(input);
    }

    public void clear(By locator){
        AndroidElement elm = find(locator);
        elm.clear();
    }

    public void scrollAndClickBytext(String visibleText) {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0))");
    }

    public void scrollUp(){
        TouchAction action = new TouchAction(driver);
        Dimension devices = driver.manage().window().getSize();
        try {
            action.press(PointOption.point((int) (0.5 * devices.getWidth()), (int) (0.9 * devices.getHeight())))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                    .moveTo(PointOption.point((int) (0.5 * devices.getWidth()), (int) (0.2 * devices.getHeight())))
                    .release()
                    .perform();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}