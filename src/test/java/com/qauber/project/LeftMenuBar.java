package com.qauber.project;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class LeftMenuBar {

    WebDriver driver = new ChromeDriver();
    PageResources page = new PageResources(driver);


    @BeforeTest
    public void setup() throws Exception {


        driver.get(TestData.getURL());
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
       String element = page.MyAccount().getProjectsWonNum().getText();

        System.out.println(element);
        Thread.sleep(3000);
      page.MyAccount().getProjectsWon().click();

      List<WebElement> linkSize = driver.findElements(By.xpath("//div[contains(@class, 'account-main-area')]/div/div" +
              "/div[1]/a"));
        int intLinksinPage= linkSize.size();
        System.out.println(intLinksinPage);

       /* List<WebElement> elemLink = driver.findElements(By.xpath("//div[contains(@class, 'account-main-area')]/div/div/div[1]/a"));

        int intLinksinPage = elemLink.size();
        System.out.println(intLinksinPage);

       for (int i = 0;i<intLinksinPage;i++)
        {
            System.out.println("The name of the link " + (i+1) +" in the page is :- " + elemLink.get(i).getAttribute("text"));
        }*/
    }
}

