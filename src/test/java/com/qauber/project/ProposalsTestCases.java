package com.qauber.project;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class ProposalsTestCases {

    WebDriver driver = new ChromeDriver();
    PageResources page = new PageResources(driver);


    @BeforeTest
    public void setup() throws Exception {

        driver.get(TestData.getURL());
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
    @Test
    public void SubmitProposal() {

        page.MyAccount().getPostedProjects().click();
        Select select = new Select(page.ActiveProjects().getPostedProjectsFilter());
        select.selectByVisibleText("Ending Soon");
        page.ActiveProjects().getFirstOpenPostedProjects().click();
        String old = driver.getWindowHandle();
        System.out.println(old);

        page.ActiveProjects().getSubmitProposal().click();


        String current = driver.getWindowHandle();
        System.out.println(current);


        page.ActiveProjects().getbid().sendKeys("10");
        page.ActiveProjects().getbidDescription().sendKeys(TestData.getTestDescription());
        page.ActiveProjects().getCheckboxBid().click();
        page.ActiveProjects().getPlaceBid().click();

    }
        @AfterTest
         public void tearup() {
        driver.quit();
    }
}




