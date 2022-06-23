package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    private static final String XPATH_SELECT_COOKIES = "//div[contains(@class, \"_9xo5\")]/button";
    private static final String XPATH_CREATE_NEW_ACCOUNT = "//div[@class=\"_6ltg\"]/a";
    private static final String XPATH_SELECT_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    private static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    private static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement webElementSelectCookies = driver.findElement(By.xpath(XPATH_SELECT_COOKIES));
        webElementSelectCookies.click();

        WebElement webElementCreateNewAccount = driver.findElement(By.xpath(XPATH_CREATE_NEW_ACCOUNT));
        webElementCreateNewAccount.click();
/*
        WebElement webElementSelectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(webElementSelectDay);
        selectDay.selectByIndex(1);

        WebElement webElementSelectMonth  =driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(webElementSelectMonth);
        selectMonth.selectByIndex(1);

        WebElement webElementSelectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(webElementSelectYear);
        selectYear.selectByIndex(13);

 */
    }
}
