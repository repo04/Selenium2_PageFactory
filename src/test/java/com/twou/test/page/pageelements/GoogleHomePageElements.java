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
public class GoogleHomePageElements {

    private static String searchBox = "q";
    private static String searchButton = "btnG";

    public static By getSearchBox() {
        return By.name(searchBox);
    }

    public static By getSearchButton() {
        return By.name(searchButton);
    }
}
