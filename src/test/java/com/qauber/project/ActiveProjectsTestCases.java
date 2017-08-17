package com.qauber.project;

import org.junit.After;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ActiveProjectsTestCases {

    WebDriver driver = new ChromeDriver();


    PageResources page = new PageResources(driver);


    @BeforeTest

    public void setup() throws Exception {


        driver.get(TestData.getURL());
        Thread.sleep(3000);
        Dimension d = new Dimension(1400,900);
        driver.manage().window().setSize(d);
        page.HomePage().getLogIn().click();
        page.QA().Username().sendKeys(TestData.getPOUsername());
        page.QA().Password().sendKeys(TestData.getPOPassword());
        page.QA().SignIn().click();

    }

        //Edit project link is functional
         @Test
        public void editproject() {

        page.MyAccount().getMyAccount().click();
        page.ActiveProjects().getEditProject().click();

        String actualTitle = driver.getTitle();

        if (actualTitle.equals("BidQA Edit Project - ")) {
            System.out.println("Verification Successful - The correct Title is opened.");
        } else {
            System.out.println("Verification Failed - An Title Url is opened.");
            System.out.println("Actual URL is : " + actualTitle);
            System.out.println("Expected URL is : " + "BidQA Edit Project -");
        }
    }

    //Can save an edited project
    @Test
    public void saveEditproject() {


        page.ActiveProjects().getEditProject().click();
        page.ActiveProjects().getDescriptionEditProject().sendKeys(TestData.getTestDescription());
        page.ActiveProjects().getSaveEditProject().click();
        page.ActiveProjects().getClickHereEditProject().click();

        String actualTitle = driver.getTitle();

        if (actualTitle.equals("BidQA | App testing ")) {
            System.out.println("Verification Successful - The correct Title is opened.");
        } else {
            System.out.println("Verification Failed - An Title Url is opened.");
            //In case of Fail, you like to print the actual and expected URL for the record purpose
            System.out.println("Actual URL is : " + actualTitle);
            System.out.println("Expected URL is : " + "BidQA | App testing");
        }
    }
    @AfterTest

    public void tearup() {

        driver.quit();

    }

    }




