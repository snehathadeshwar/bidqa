package com.qauber.project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePageTestCases {

    @Test
    public void testHomePage() throws Exception{
        WebDriver driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);

        driver.get("http://test.bidqa.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        System.out.println("Loading site");

        driver.findElement(By.xpath("//*[@id='cssmenu']/ul/li[8]/a")).click();
        System.out.println("Login link clicked");



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
