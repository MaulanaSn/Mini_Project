package com.example.app.pages;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class LogoutPage extends BasePageObject {
    private By logoutButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    public void clickLogoutBtn(){
        click(logoutButton);
    }
}
