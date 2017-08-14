package com.qauber.project;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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
        Dimension d = new Dimension(1400,900);
        driver.manage().window().setSize(d);


    }

    //user cannnot enter Username more than 20 characters
    @Test
    public void test1() {


        page.RegisterationPage().getUsername().sendKeys(TestData.getLongUsername());

        WebElement element = page.RegisterationPage().getUsernameError();
        String message = element.getText();
        System.out.println(message);
        Assert.assertEquals("Maximum username length is 20 characters.", message);

    }

    //User cannot register without checking "I'm robot"
    @Test

    public void test2() throws Exception {


        page.RegisterationPage().getUsername().sendKeys(TestData.getTestUsername());
        page.RegisterationPage().getEmail().sendKeys(TestData.getTestEmail());
        page.RegisterationPage().getPassword().sendKeys(TestData.getTestPassword());
        page.RegisterationPage().getRepeatPassword().sendKeys(TestData.getTestPassword());
        Thread.sleep(3000);
        page.RegisterationPage().getRegisterButton().click();

        WebElement element = page.RegisterationPage().getEmptyRobotError();
        String message = element.getText();
        System.out.println(message);
        Assert.assertEquals("ERROR: Incorrect or empty reCAPTCHA response, please try again.", message);

    }

    //cannot register when passwords dont match
    @Test
    public void test3() throws Exception {


        page.RegisterationPage().getUsername().sendKeys(TestData.getTestUsername());
        page.RegisterationPage().getEmail().sendKeys(TestData.getTestEmail());
        Thread.sleep(3000);
        page.RegisterationPage().getPassword().sendKeys(TestData.getQAPassword());
        page.RegisterationPage().getRepeatPassword().sendKeys(TestData.getPOPassword());

        page.RegisterationPage().getProjectOwner().click();

        page.RegisterationPage().getRegisterButton().click();

        WebElement element = page.RegisterationPage().getMismatchError();
        String message = element.getText();
        System.out.println(message);
        Assert.assertEquals("ERROR: please use a passwords don't match.", message);

    }
        //TC: T127048
        @Test
        public void test4() throws Exception {

        Thread.sleep(3000);
            page.RegisterationPage().getLoginButton().click();

            String actulaURL = driver.getCurrentUrl();

            String expectedURL = "http://test.bidqa.com/wp-login.php";

            if (actulaURL.equals(expectedURL)){

                System.out.println("User is navigated to Login page");
            }
            else

            {
                System.out.println("User is not navigated to Login page");

            }


    }


    @AfterTest

    public void tearup() {

        driver.quit();

    }
}




















