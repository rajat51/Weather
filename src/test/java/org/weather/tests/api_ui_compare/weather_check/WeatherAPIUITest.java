package org.weather.tests.api_ui_compare.weather_check;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.weather.pages.HomePage;
import org.weather.pages.WeatherPage;
import org.weather.pojo.weather.MovieSearchByNameResponseSuccess;
import org.weather.tests.BaseClasses.BaseAPIUITests;
import org.testng.annotations.Test;

import java.util.List;

public class WeatherAPIUITest extends BaseAPIUITests
{

    @Test
    public void testHomePageList()
    {
        HomePage homePage=getHomePage();
        homePage.clickMoreOptions();
        homePage.clickWeatherOption();
        WeatherPage weatherPage = getWeatherPage();
        weatherPage.enterCity("Pune");
        weatherPage.clickCity();
        List<WebElement> allElements = weatherPage.getElements().findAllElements();
        if (allElements.size() == 1) {
            String temperature = allElements.get(0).getText();
            Float webTemperature = Float.parseFloat(temperature.substring(0, temperature.length() - 1));
            RequestSpecification request = RestAssured.given().queryParam("id", 1259229).queryParam("apikey", properties.getProperty("apiKey"));
            MovieSearchByNameResponseSuccess searchByNameResponseSuccess = request.request(Method.GET).body().as(MovieSearchByNameResponseSuccess.class);
            float apiTemperature = searchByNameResponseSuccess.main.temp - 273.15F;

            Assert.assertTrue(webTemperature - apiTemperature < 2, "Temperature does not match");
        } else {
            System.out.println("Something Went wrong");
        }


    }



}
