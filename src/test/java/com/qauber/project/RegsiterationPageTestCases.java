package com.qauber.project;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class RegsiterationPageTestCases {

    WebDriver driver = new ChromeDriver();

    RegisterationPage registerationPage = new RegisterationPage(driver);
    HomePage homePage = new HomePage(driver);

    @BeforeTest

    public void setup() throws Exception {

        driver.get("http://test.bidqa.com");
        Thread.sleep(3000);
        homePage.Registeration().click();


    }

    @Test

    public void test1() {


        registerationPage.Username().sendKeys("abcdefghijklmnopqrstu");
        //String message = driver.findElement(By.xpath(".//*[@id='error_username']")).getText();
        //System.out.println(message);


        WebElement element = driver.findElement(By.xpath("//*[@id='error_username']"));
        String message = element.getText();
        System.out.println(message);
        Assert.assertEquals("Maximum username length is 20 characters.", message);

    }

    @Test

    public void test2() {


        registerationPage.Username().sendKeys("abcdefgh");
        //String message = driver.findElement(By.xpath(".//*[@id='error_username']")).getText();
        //System.out.println(message);
        registerationPage.Email().sendKeys("sneha1234@gmail.com");
        registerationPage.Password().sendKeys("1234");
        registerationPage.RepeatPassword().sendKeys("1234");
        registerationPage.RegisterButton().click();

        WebElement element = driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/div[1]/ul/li"));
        String message = element.getText();
        System.out.println(message);
        Assert.assertEquals("ERROR: Incorrect or empty reCAPTCHA response, please try again.", message);

    }

    @Test

    public void test3() throws Exception {


        registerationPage.Username().sendKeys("abcdefgh");

        //String message = driver.findElement(By.xpath(".//*[@id='error_username']")).getText();
        //System.out.println(message);
        registerationPage.Email().sendKeys("sneha1234@gmail.com");
        Thread.sleep(3000);
        registerationPage.Password().sendKeys("123");
        registerationPage.RepeatPassword().sendKeys("1234");

        registerationPage.ProjectOwner().click();

        registerationPage.RegisterButton().click();

        WebElement element = driver.findElement(By.xpath(".//*[@id='main']/div/div/div/div/div[1]/ul/li[1]"));
        String message = element.getText();
        System.out.println(message);
        Assert.assertEquals("ERROR: please use a passwords don't match.", message);

    }
        @AfterTest
        public void tearup() {

             driver.quit();


        }
    }





















