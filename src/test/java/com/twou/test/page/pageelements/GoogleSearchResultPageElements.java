/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.twou.test.page.pageelements;

import org.openqa.selenium.By;

/**
 *
 * @author somesh.bansal
 */
public class GoogleSearchResultPageElements {

    private static String resultStatus = "resultStats";

    public static By getResultStatus() {
        return By.id(resultStatus);
    }
}
