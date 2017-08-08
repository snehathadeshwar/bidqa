package com.qauber.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RegsiterationPageTestCases {

@Test
    public void test1() throws Exception {
        WebDriver driver = new ChromeDriver();

        RegisterationPage registerationPage = new RegisterationPage(driver);


       driver.get("http://www.test.bidqa.com");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='cssmenu']/ul/li[2]/a")).click();
        //registerationPage.Username().sendKeys("s");
    System.out.println("Clicked");

    }
    }
