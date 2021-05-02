package org.weather.BaseClasses;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }


}

