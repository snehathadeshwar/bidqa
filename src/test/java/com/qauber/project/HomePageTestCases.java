package com.qauber.project;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.Dimension;

public class HomePageTestCases {
    WebDriver driver = new ChromeDriver();
    PageResources page = new PageResources(driver);

    //   Login in link clicked
    @BeforeTest
    public void testHomePage() throws Exception {

        driver.get("http://test.bidqa.com");

        Dimension d = new Dimension(1400, 900);
        driver.manage().window().setSize(d);

        Thread.sleep(3000);
        System.out.println("Loading site");

        page.HomePage().getLogIn().click();
        System.out.println("Login link clicked");

    }

    @Test

    public void test1() throws Exception {

        //Thread.sleep(3000);

        // homePage.ForQAProfessionals().click();
        // Thread.sleep(3000);
        // System.out.println("ForQAProfessionals link clicked");


        driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys(TestData.getQAUsername());

        System.out.println("Username Entered ");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='user_email']")).sendKeys(TestData.getQAEmail());
        System.out.println("Email Entered ");
        Thread.sleep(3000);


    }
        //T127031
        @Test
            public void test3() throws Exception {
            page.HomePage().getHomebuttonLoginPage().click();

            String actualURL = driver.getCurrentUrl();
            String expectedURL = "http://test.bidqa.com/";

                if (actualURL.equals(expectedURL)){
                    System.out.println("Verification Successful - The correct Url is opened.");
                }
                else{
                    System.out.println("Verification Failed - An incorrect Url is opened.");
                }

                 System.out.println("Actual URL is :" + actualURL);
                 System.out.println("Expected URL is :" + expectedURL);
                }






    @AfterTest

    public void tearup() {

        driver.quit();

    }
}