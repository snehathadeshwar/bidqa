package com.qauber.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class LogPageTestCases {

    @Test
    public void test1() throws Exception {
        WebDriver driver = new ChromeDriver();

        RegisterationPage registerationPage = new RegisterationPage(driver);

        driver.get("http://www.test.bidqa.com");
        driver.findElement(By.xpath(".//*[@id='cssmenu']/ul/li[8]/a")).click();


    }


}