package com.qauber.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProposalsTestCases {

    WebDriver driver = new ChromeDriver();

    HomePage homePage = new HomePage(driver);
    RegisterationPage registerationPage = new RegisterationPage(driver);
    QA qa = new QA(driver);
    Subscription subscription = new Subscription(driver);
    Proposals proposals = new Proposals(driver);

    @BeforeTest
    public void setup() throws Exception {


        driver.get("http://test.bidqa.com");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        homePage.LogIn().click();
        qa.Username().sendKeys("s");
        qa.Password().sendKeys("c55b38f");
        qa.SignIn().click();

        // /driver.findElement(By.xpath(".//*[@id='cssmenu']/ul/li[8]/a")).click();
        WebElement element = driver.findElement(By.xpath("//*[@id='header']/div/div/div[4]"));
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertEquals("Welcome s", strng);
    }

     @Test

        public void test1() {

        proposals.MyAccount().click();
        proposals.Project().click();

            //proposals.Project().click();
     }






    }
