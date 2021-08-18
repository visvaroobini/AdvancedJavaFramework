package com.advancedFW.test.pages;

import com.advanceFW.framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WeedPage extends BasePage{

    public WeedPage() {
    }

    @FindBy(how = How.CSS, using = "div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(1) > div")
    public WebElement WeedKillerProducts;

    public BasePage GoToProductInstructions() {
        WeedKillerProducts.click();
        return GetInstance(ProductDetailsPage.class);
    }
}
