package org.weather.pages;

import org.weather.BaseClasses.BasePage;
import org.weather.customWebElem.ExWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage extends BasePage {

    By moreOptions=By.cssSelector("#h_sub_menu");
    By weatherOption=By.partialLinkText("WEATHER");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickMoreOptions(){
        new ExWebElement(driver,moreOptions).click();
        return this;
    }

    public HomePage clickWeatherOption() {
        new ExWebElement(driver,weatherOption).click();
        return this;
    }

}
