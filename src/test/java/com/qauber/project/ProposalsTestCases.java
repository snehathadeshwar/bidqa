package com.qauber.project;

import org.openqa.selenium.By;
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
        driver.manage().window().maximize();
        page.HomePage().LogIn().click();
        page.QA().Username().sendKeys("s");
        page.QA().Password().sendKeys("c55b38f");
        page.QA().SignIn().click();

        // /driver.findElement(By.xpath(".//*[@id='cssmenu']/ul/li[8]/a")).click();
        WebElement element = driver.findElement(By.xpath("//*[@id='header']/div/div/div[4]"));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertEquals("Welcome s", strng);
    }

          @Test

         public void test1() {

              page.MyAccount().MyAccount().click();
             page.Proposals().Project().click();

             //proposals.Project().click();
             }




    //public void tearup() {
      //  driver.quit();
    }




