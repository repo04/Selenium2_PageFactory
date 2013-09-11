/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.twou.test.integrationtests;

import com.twou.test.page.SelTestCase;
import com.twou.test.page.page.GoogleHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 *
 * @author somesh.bansal
 */
public class GoogleSearchTest extends SelTestCase {

    @Test
    public void testGoogleSearch() {
        //GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        GoogleHomePage googleHomePage = PageFactory.initElements(driver, GoogleHomePage.class);
        googleHomePage.searchGoogle("Selenium HQ");
        assert driver.getPageSource().contains("seleniumhq") : "Selenium headquarter search failed";
    }
}
