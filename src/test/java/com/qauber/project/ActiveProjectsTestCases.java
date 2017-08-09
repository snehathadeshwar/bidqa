package com.qauber.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActiveProjectsTestCases {

    WebDriver driver = new ChromeDriver();


    PageResources page = new PageResources(driver);



    @BeforeTest
    public void setup() throws Exception {


        driver.get("http://test.bidqa.com");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        page.HomePage().LogIn().click();
        page.QA().Username().sendKeys("st");
        //.Username().sendKeys("st");
        page.QA().Password().sendKeys("12");
        page.QA().SignIn().click();

    }

        //Edit project link is functional
    @Test


    public void editproject() {

        page.MyAccount().MyAccount().click();
        page.ActiveProjects().editProject().click();

        String actualTitle = driver.getTitle();

        if (actualTitle.equals("BidQA Edit Project - ")) {
            System.out.println("Verification Successful - The correct Title is opened.");
        } else {
            System.out.println("Verification Failed - An Title Url is opened.");
            //In case of Fail, you like to print the actual and expected URL for the record purpose
            System.out.println("Actual URL is : " + actualTitle);
            System.out.println("Expected URL is : " + "BidQA Edit Project -");
        }
    }

    //Can save an edited project


    @Test


    public void saveEditproject() {


        page.ActiveProjects().editProject().click();
         page.ActiveProjects().descriptionEditProject().sendKeys("Editing");
         page.ActiveProjects().saveEditProject().click();
         page.ActiveProjects().clickHereEditProject().click();



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

}


