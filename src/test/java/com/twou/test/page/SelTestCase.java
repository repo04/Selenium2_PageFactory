/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.twou.test.page;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

/**
 *
 * @author somesh.bansal
 */
public class SelTestCase {

    protected WebDriver driver;

    /**
     *
     * @param appURL
     */
    @BeforeMethod
    @Parameters("appURL")
    public void startDriver(String appURL) {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(appURL);

    }

    @AfterMethod
    public void closeDriver() {
        driver.quit();
    }
}
