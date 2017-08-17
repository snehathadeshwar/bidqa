package com.qauber.project;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TopMenuBar {


    WebDriver driver = new ChromeDriver();
    PageResources page = new PageResources(driver);

    //   Login in link clicked
    @BeforeTest
    public void setup() {
        driver.get(TestData.getURL());
        page.HomePage().getLogIn().click();

        Dimension d = new Dimension(1400, 900);
        driver.manage().window().setSize(d);
        page.QA().Username().sendKeys(TestData.getQAUsername());
        page.QA().Password().sendKeys(TestData.getQAPassword());
        page.QA().SignIn().click();


        WebElement element = driver.findElement(By.xpath("//*[@id='header']/div/div/div[4]"));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertEquals("Welcome s", strng);

    }

    //TC: T127266
    @Test

    public void test1() throws Exception {

        page.MyAccount().getMyProjects().click();
        String actualTitle = driver.getTitle();
        String expectedTtile =  "BidQA | Projects I’ve Won";

        Assert.assertTrue(actualTitle.equals(expectedTtile),"Correct page");
        System.out.println("Expected Title is : " + expectedTtile);

    }
}