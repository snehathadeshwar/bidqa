package com.qauber.project;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProposalsTestCases {

    WebDriver driver = new ChromeDriver();
    PageResources page = new PageResources(driver);


    @BeforeTest
    public void setup() throws Exception {

        driver.get("http://test.bidqa.com");
        Thread.sleep(3000);
        Dimension d = new Dimension(1400, 900);
        driver.manage().window().setSize(d);

        page.HomePage().getLogIn().click();
        page.QA().Username().sendKeys(TestData.getQAUsername());
        page.QA().Password().sendKeys(TestData.getQAPassword());
        page.QA().SignIn().click();
        WebElement element = page.LoginPage().getwelcomeMessage();

        String strng = element.getText();
        System.out.println(strng);
        Assert.assertEquals("Welcome s", strng);

    }

    @Test

    public void test1() {

        page.MyAccount().getMyAccount().click();
        page.Proposals().getProject().click();
        System.out.println("Project Clicked");

    }

        @AfterTest
         public void tearup() {
        driver.quit();
    }
}




