package org.weather.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DriverController {

    ThreadLocal<WebDriver> driverManager=new ThreadLocal<>();

    public WebDriver createDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver=new ChromeDriver(options);
        driverManager.set(driver);
        return driverManager.get();
    }

    public WebDriver getDriver(){
        return driverManager.get();
    }

    public void removeDriver(){
        driverManager.remove();
    }

}
