package com.qauber.project;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class SubscriptionTestCases {
    WebDriver driver = new ChromeDriver();
    PageResources page = new PageResources(driver);


    @BeforeTest
    public void setup() throws Exception {


        driver.get("http://test.bidqa.com");
        Dimension d = new Dimension(1400,900);
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


            //Cannot subscribe when all fields are empty -gets error
            @Test
             public void test1() throws Exception {
            WebElement MyAccount = driver.findElement(By.xpath("//*[@id='cssmenu']/ul/li[6]/a"));

            Actions action = new Actions(driver);

            action.moveToElement(MyAccount).build().perform();

            page.Subscription().getAccountMysubscription().click();

            page.Subscription().getSubscribeButton().click();
            Thread.sleep(5000);

            //Verify error message
            boolean Error = driver.getPageSource().contains("Sorry, but all field is empty");
            if (Error == true) {
                System.out.print("Message Present ");
            } else {
                System.out.print("Message Absent");
            }
        }

        //
            @Test

            public void test2 () throws Exception{

                WebElement MyAccount = page.MyAccount().getMyAccount();

                Actions action = new Actions(driver);
                action.moveToElement(MyAccount).build().perform();
                Thread.sleep(5000);
                action.moveToElement(MyAccount).build().perform();
                page.Subscription().getAccountMysubscription().click();

                WebElement Webtable= page.Subscription().getSubscriptionTable();

                List<WebElement> TotalRowCount= Webtable.findElements(By.xpath("//*[@id='my_subscribtions']/tbody/tr"));

                System.out.println("No. of Rows in the WebTable: "+TotalRowCount.size());

                page.Subscription().getDeleteButton().click();
                Thread.sleep(3000);

                boolean Message = driver.getPageSource().contains("Successfully! Subscription deleted");
                if (Message == true) {
                    System.out.print("Subscription deleted ");
                } else {
                    System.out.print("Subscription not deleted");

                }

    }

}



















