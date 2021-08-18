package com.advanceFW.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FrameworkInitialise extends  Base{

    public void IntialiseBrowser(BrowserType browserType) {
        WebDriver driver = null;
        switch(browserType){
            case Chrome:{
                System.setProperty("webdriver.chrome.driver", "C:\\FrameworkDrivers\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            }
            case Firefox:{
                driver =  new FirefoxDriver();
                break;
            }
            case Edge:{
                driver = new EdgeDriver();
                break;
            }
            case Safari:{
                driver = new SafariDriver();
                break;
            }
        }
        DriverContext.setDriver(driver);
        DriverContext.Browser = new Browser(driver);
    }
}
