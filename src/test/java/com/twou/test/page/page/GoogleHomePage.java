/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.twou.test.page.page;

import com.twou.test.page.ActionDriver;
import com.twou.test.page.pageelements.GoogleHomePageElements;
import com.twou.test.page.pageelements.GoogleSearchResultPageElements;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author somesh.bansal
 */
public class GoogleHomePage extends ActionDriver {
    
    public GoogleHomePage(WebDriver driver) {
        super(driver);

        /*if (!isElementPresent((GoogleHomePageElements.getSearchBox()))) {
            throw new IllegalStateException(
                    "This is not Google Search page. Page is: "
                    + driver.getPageSource());
        }*/
    }

    public GoogleSearchResultPage searchGoogle(String testdata) {
        type(GoogleHomePageElements.getSearchBox(), testdata);
        clickAndWaitForElementPresent(GoogleHomePageElements.getSearchButton(),
                GoogleSearchResultPageElements.getResultStatus());
        return new GoogleSearchResultPage(driver);
    }    
}
