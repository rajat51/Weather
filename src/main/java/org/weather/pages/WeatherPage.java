package org.weather.pages;

import org.openqa.selenium.WebElement;
import org.weather.BaseClasses.BasePage;
import org.weather.customWebElem.ExWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WeatherPage extends BasePage {

    By searchBox =By.cssSelector("#searchBox");
    By searchedCity=By.cssSelector("#Pune");
    By cityTemperature=By.cssSelector("[title='Pune'] .temperatureContainer .tempRedText");

    public WeatherPage(WebDriver driver) {
        super(driver);
    }


    public void enterCity(String city) {
        new ExWebElement(driver, searchBox).sendKeys(city);
    }

    public void clickCity() {
        new ExWebElement(driver, searchedCity).click();
    }

    public ExWebElement getElements() {
        return new ExWebElement(driver, cityTemperature);
    }
}
