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
    PageResources page = new PageResources(driver);

    @BeforeTest

    public void setup() throws Exception {

        driver.get("http://test.bidqa.com");
        Thread.sleep(3000);
        page.HomePage().Registeration().click();


    }

    //user cannnot enter Username more than 20 characters
    @Test

    public void test1() {


        page.RegisterationPage().Username().sendKeys("abcdefghijklmnopqrstu");
        //String message = driver.findElement(By.xpath(".//*[@id='error_username']")).getText();
        //System.out.println(message);


        WebElement element = driver.findElement(By.xpath("//*[@id='error_username']"));
        String message = element.getText();
        System.out.println(message);
        Assert.assertEquals("Maximum username length is 20 characters.", message);

    }

    //User cannot register without checking "I'm robot"
    @Test

    public void test2() throws Exception {


        page.RegisterationPage().Username().sendKeys("abcdefgh");
        //String message = driver.findElement(By.xpath(".//*[@id='error_username']")).getText();
        //System.out.println(message);
        page.RegisterationPage().Email().sendKeys("sneha1234@gmail.com");
        page.RegisterationPage().Password().sendKeys("1234");
        page.RegisterationPage().RepeatPassword().sendKeys("1234");
        Thread.sleep(3000);
        page.RegisterationPage().RegisterButton().click();

        WebElement element = driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/div[1]/ul/li"));
        String message = element.getText();
        System.out.println(message);
        Assert.assertEquals("ERROR: Incorrect or empty reCAPTCHA response, please try again.", message);

    }

    //cannot register when passwords dont match
    @Test

    public void test3() throws Exception {


        page.RegisterationPage().Username().sendKeys("abcdefgh");

        //String message = driver.findElement(By.xpath(".//*[@id='error_username']")).getText();
        //System.out.println(message);
        page.RegisterationPage().Email().sendKeys("sneha1234@gmail.com");
        Thread.sleep(3000);
        page.RegisterationPage().Password().sendKeys("123");
        page.RegisterationPage().RepeatPassword().sendKeys("1234");

        page.RegisterationPage().ProjectOwner().click();

        page.RegisterationPage().RegisterButton().click();

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




















