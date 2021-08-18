package com.advancedFW.test.seleniumTest;

import com.advanceFW.framework.base.BrowserType;
import com.advanceFW.framework.base.DriverContext;
import com.advanceFW.framework.base.FrameworkInitialise;
import com.advanceFW.framework.utilities.DatabaseUtil;
import com.advancedFW.test.pages.HomePage;
import com.advancedFW.test.pages.WeedPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.sql.Connection;

public class OpenBrowser extends FrameworkInitialise {

    @Before
    public void Intialise() {
//           String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=master;user=sa;password=your_password";
//            Connection connection  =  DatabaseUtil.OpenDataBaseConnection(connectionUrl);
//            DatabaseUtil.ExecuteQuery("", connection );

            IntialiseBrowser(BrowserType.Chrome);
            DriverContext.Browser.GoToUrl("https://www.amazon.co.uk/");
               }

    @Test
    public void Search() throws InterruptedException {
        CurrentPage = GetInstance(HomePage.class);
        Thread.sleep(3000);

        CurrentPage = CurrentPage.As(HomePage.class).SearchItem();
        Thread.sleep(3000);

        CurrentPage =  CurrentPage.As(WeedPage.class).GoToProductInstructions();
        Thread.sleep(3000);
    }

    @After
    public  void Close(){
        DriverContext.Driver.close();
    }
}
