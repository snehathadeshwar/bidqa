package com.qauber.project;


import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTestCases {

    WebDriver driver = new ChromeDriver();

    PageResources page = new PageResources(driver);



    @BeforeTest
    public void setup() {

        driver.get("http://test.bidqa.com");
        page.HomePage().LogIn().click();

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


            page.LoginPage().LostYourPassword().click();

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
                page.QA().Username().sendKeys("u");
                page.QA().Password().sendKeys("3d28c94");
                page.QA().SignIn().click();

                // /driver.findElement(By.xpath(".//*[@id='cssmenu']/ul/li[8]/a")).click();
                WebElement element = driver.findElement(By.xpath("//*[@id='header']/div/div/div[4]"));
                String strng = element.getText();
                System.out.println(strng);
                Assert.assertEquals("Welcome u", strng);


                }


    }

