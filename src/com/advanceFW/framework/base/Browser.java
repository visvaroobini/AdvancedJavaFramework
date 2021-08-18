package com.advanceFW.framework.base;

import org.openqa.selenium.WebDriver;

public class Browser {
    public Browser(WebDriver driver) {
        Driver = driver;
    }

    private WebDriver Driver;
    public  BrowserType Type;

public  void GoToUrl(String url)
{
Driver.get(url);
}

public void Maximize(){
    Driver.manage().window().maximize();
}
}
