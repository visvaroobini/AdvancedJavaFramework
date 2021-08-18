package com.advancedFW.test.pages;

import com.advanceFW.framework.base.Base;
import com.advanceFW.framework.base.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

    public HomePage() {

    }

    @FindBy(how = How.ID, using = "sp-cc-accept")
    public WebElement AcceptAlert;

    @FindBy(how = How.ID, using = "twotabsearchtextbox")
    public WebElement SearchBox;

    @FindBy(how = How.ID, using = "nav-search-submit-button")
    public WebElement SearchButton;

    public BasePage SearchItem() throws InterruptedException {

        AcceptAlert.click();
        Thread.sleep(3000);
        SearchBox.sendKeys("Weed Killer");
        SearchButton.submit();
        return GetInstance(WeedPage.class);
    }
}
