/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.twou.test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author somesh.bansal
 */
public class ActionDriver {

    protected WebDriver driver;

    public ActionDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void type(By by, String testdata) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(testdata);
    }

    public void typeKeys(By locator, Keys key) {
        driver.findElement(locator).sendKeys(key);
    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }

    public void waitForElementPresent(By locator) {
        for (int i = 0; i < 60; i++) {
            if (isElementPresent(locator)) {
                break;
            } else {
                try {
                    driver.wait(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void clickAndWaitForElementPresent(By locator, By waitElement) {
        click(locator);
        waitForElementPresent(waitElement);
    }
}
