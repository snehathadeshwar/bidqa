package com.qauber.project;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.Dimension;

public class HomePageTestCases {
    WebDriver driver = new ChromeDriver();
    PageResources page = new PageResources(driver);

     //   Login in link clicked
    @Test
    public void testHomePage() throws Exception {


        driver.get("http://test.bidqa.com");


        Dimension d = new Dimension(1400,900);
        //Resize the current window to the given dimension
        driver.manage().window().setSize(d);

        Thread.sleep(3000);
        System.out.println("Loading site");

        page.HomePage().LogIn().click();
        System.out.println("Login link clicked");

    }
    @Test

    public void test2() throws Exception {

        //Thread.sleep(3000);

        // homePage.ForQAProfessionals().click();
        // Thread.sleep(3000);
        // System.out.println("ForQAProfessionals link clicked");






        //*[@id="cssmenu"]/ul/li[7]/a


        driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("s");

        System.out.println("Username Entered ");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='user_email']")).sendKeys("emmyhuddy-7452@yopmail.com");
        System.out.println("Email Entered ");
       Thread.sleep(3000);


        //driver.findElement(By.xpath("//*[@id='recaptcha-anchor']/div[5]"));
        //Thread.sleep(5000);
        //System.out.println("Email Entered");






    }




        // driver.findElement(By.)
        //Thread.sleep(3000);
        //System.out.println("QAContractorsProfile link clicked");

        //driver.close();
        //driver.quit();

    }
