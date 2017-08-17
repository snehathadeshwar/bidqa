package com.qauber.project;


import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;

public class LoginPageTestCases {

    WebDriver driver = new ChromeDriver();

    PageResources page = new PageResources(driver);

    @BeforeTest
    public void setup() {

        driver.get(TestData.getURL());
        page.HomePage().getLogIn().click();

        Dimension d = new Dimension(1400,900);
        driver.manage().window().setSize(d);
    }

    @Test
    public void test1() {


        driver.findElement(By.xpath("//*[@id='cssmenu']/ul/li[8]/a")).click();
        //registerationpage.Username().sendKeys("s");
        //registerationpage.Email().sendKeys("emmyhuddy-7452@yopmail.com");

        WebElement oCheckBox = driver.findElement(By.cssSelector("span[role='checkbox']"));

        oCheckBox.click();


        Select select = new Select(driver.findElement(By.id("")));

        select.selectByVisibleText("");


        // WebElement check = driver.findElement(By.id("recaptcha-anchor"));
        // WebElement radioBtn = driver.findElement(By.id("toolsqa"));

        // check.click();

        // registerationpage.Robot().click();
        //registerationpage.RegisterButton().click();

    }

            //Lost password link is working
        @Test
        public void lostpassword() {


            page.LoginPage().getLostYourPassword().click();

            String actualUrl = driver.getCurrentUrl();

            if (actualUrl.equals("http://test.bidqa.com/wp-login.php?action=lostpassword")) {
                System.out.println("Verification Successful - The correct Url is opened.");
            } else {
                System.out.println("Verification Failed - An incorrect Url is opened.");
                //In case of Fail, you like to print the actual and expected URL for the record purpose
                System.out.println("Actual URL is : " + actualUrl);
                System.out.println("Expected URL is : " + "http://test.bidqa.com/wp-login.php?action=lostpassword");


            }
        }

             //Login with lost password TC:C118819
            @Test
            public void test3() {
                page.QA().Username().sendKeys(TestData.getLostQAUsername());
                page.QA().Password().sendKeys(TestData.getLostQAPassword());
                page.QA().SignIn().click();

                // /driver.findElement(By.xpath(".//*[@id='cssmenu']/ul/li[8]/a")).click();
                WebElement element = driver.findElement(By.xpath("//*[@id='header']/div/div/div[4]"));
                String strng = element.getText();
                System.out.println(strng);
                Assert.assertEquals("Welcome u", strng);


                }


                    //TC: T127045
                    @Test
                   public void test4() throws Exception {
                        page.QA().Username().sendKeys(TestData.getQAUsername());
                        page.QA().Password().sendKeys(TestData.getQAPassword());
                        page.QA().SignIn().click();


                        WebElement element = page.LoginPage().getwelcomeMessage();
                        String strng = element.getText();
                        System.out.println(strng);
                        Assert.assertEquals("Welcome s", strng);

                        JavascriptExecutor js = (JavascriptExecutor) driver;
                        js.executeScript("history.go(-1);", new Object[0]);
                        js.executeScript("history.go(-1);", new Object[0]);

                        Thread.sleep(3000);
                        String actualURL = driver.getCurrentUrl();

                        String expectedURL = TestData.getURL();

                        if (actualURL.equals(expectedURL)) {

                            System.out.println("User is logged out");
                        } else

                        {
                            System.out.println("User is not logged out");

                        }


                    }

                        //TC:T127052

                        @Test

                        public void test5() {

                            page.QA().Username().sendKeys(TestData.getQAUsername());
                            page.QA().Password().sendKeys(TestData.getQAPassword());
                            page.QA().SignIn().click();
                            WebElement message = page.LoginPage().getwelcomeMessage();
                            String welcomeMessage = message.getText();
                            System.out.println(welcomeMessage);
                            Assert.assertEquals("Welcome s", welcomeMessage);
                        }
    //TC: T127053

    @Test

    public void test6() {

        page.QA().Username().sendKeys(TestData.getTestUsername());
        page.QA().Password().sendKeys(TestData.getQAPassword());
        page.QA().SignIn().click();

        WebElement message = page.LoginPage().getUserOrPassError();
        String ErrorMessage = message.getText();
        System.out.println(ErrorMessage);
        Assert.assertEquals("ERROR: Your password or username is incorrect. Lost your password?", ErrorMessage);
    }

    //TC:  T127054

    @Test

    public void test7() {

        page.QA().Username().sendKeys(TestData.getQAUsername());
        page.QA().Password().sendKeys(TestData.getTestPassword());
        page.QA().SignIn().click();

        WebElement message = page.LoginPage().getUserOrPassError();
        String ErrorMessage = message.getText();
        System.out.println(ErrorMessage);
        Assert.assertEquals("ERROR: Your password or username is incorrect. Lost your password?", ErrorMessage);
    }

//TC:  T127085

    @Test

    public void test8() {

         String actualURL = driver.getCurrentUrl();

        String expectedURL = "http://test.bidqa.com/wp-login.php";

        Assert.assertEquals(actualURL, expectedURL);
        System.out.println("Actual URL is : " + actualURL);
        System.out.println("Expected URL is : " + expectedURL);
    }

    //TC:  T126910
    @Test

    public void test9() {

        page.QA().Username().sendKeys(TestData.getQAUsername());
        page.QA().Password().sendKeys(TestData.getQAPassword());
        page.QA().SignIn().click();


        WebElement element = page.LoginPage().getLoggedinMessage();
        String strng = element.getText();
        System.out.println(strng);
        Assert.assertEquals("You are logged in as a QA Engineer", strng);

    }
    //TC:  T126918
    @Test
    public void test10() {

        page.QA().Username().sendKeys(TestData.getQAUsername());
        page.QA().SignIn().click();

        WebElement element = page.LoginPage().getBlankPasswordError();
        String blankPassword = element.getText();
        System.out.println(blankPassword);
        Assert.assertEquals("Error: The password field is empty.", blankPassword);
    }

        //TC:  T127002

        @Test
        public void test11 () throws Exception {

            page.QA().Username().sendKeys(TestData.getQAUsername());
            page.QA().Password().sendKeys(TestData.getQAPassword());
            page.LoginPage().getRememberMe().click();
            page.QA().SignIn().click();
            //driver.close();
            Thread.sleep(3000);
            //driver = new ChromeDriver();
            //driver.get("http://test.bidqa.com");


           /* WebElement message = page.LoginPage().getwelcomeMessage();
            String welcomeMessage = message.getText();
            System.out.println(welcomeMessage);
            Assert.assertEquals("Welcome s", welcomeMessage);*/


        }
         }









