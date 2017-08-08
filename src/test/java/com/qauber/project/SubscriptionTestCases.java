package com.qauber.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SubscriptionTestCases {
    WebDriver driver = new ChromeDriver();

    HomePage homePage = new HomePage(driver);
    RegisterationPage registerationPage = new RegisterationPage(driver);
    QA qa = new QA(driver);
    Subscription subscription = new Subscription(driver);

    @BeforeTest
    public void setup() throws Exception {


        driver.get("http://test.bidqa.com");
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
        public void test1() throws Exception {
            WebElement MyAccount = driver.findElement(By.xpath("//*[@id='cssmenu']/ul/li[6]/a"));

            Actions action = new Actions(driver);

            action.moveToElement(MyAccount).build().perform();

            driver.findElement(By.xpath("//*[@id='cssmenu']/ul/li[6]/ul/li[1]/a")).click();

            driver.findElement(By.xpath("//*[@id='subscribe-form']/button")).click();
            Thread.sleep(5000);
            //Verify error message


            boolean Error = driver.getPageSource().contains("Sorry, but all field is empty");
            if (Error == true) {
                System.out.print("Message Present ");
            } else {
                System.out.print("Message Absent");
            }

        }
            @Test

            public void test2 () throws Exception{


            subscription.Mysubscription().click();
            driver.findElement(By.xpath("//*[@id='782']")).click();
                Thread.sleep(3000);
                boolean Message = driver.getPageSource().contains("Successfully! Subscription deleted");
                if (Message == true) {
                    System.out.print("Subscription deleted ");
                } else {
                    System.out.print("Subscription not deleted");
                }



            }



            @AfterTest
            public void tearup () {

                driver.quit();
            }
        }











