package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayTestingApp {
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.ebay.com/");
        WebElement searchField = driver.findElement(By.name("_nkw"));
        searchField.sendKeys("Laptop");
        searchField.submit();
    }

    public final static String CHROME = "CHROME_DRIVER";
    public static WebDriver getDriver(final String driver) {

        System.setProperty("webdriver.chrome.driver", "/Users/Mateusz/Documents/Development/Projects/chromedriver");

        if(driver.equals(CHROME)) {
            return new ChromeDriver();
        } else {
            return null;
        }
    }
}
