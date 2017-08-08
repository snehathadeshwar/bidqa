package com.qauber.project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LoginPageTestCases {

    @Test
    public void test1() {
        WebDriver driver = new ChromeDriver();
        //HomePage homePage = new HomePage(driver);
        RegisterationPage registerationpage = new RegisterationPage(driver);
        driver.get("http://www.test.bidqa.com");
        driver.findElement(By.xpath("//*[@id='cssmenu']/ul/li[8]/a")).click();
                registerationpage.Username().sendKeys("s");
                registerationpage.Email().sendKeys("emmyhuddy-7452@yopmail.com");

        WebElement oCheckBox = driver.findElement(By.cssSelector("span[role='checkbox']"));

        oCheckBox.click();


        Select select = new Select(driver.findElement(By.id("")));

        select.selectByVisibleText("");


       // WebElement check = driver.findElement(By.id("recaptcha-anchor"));
           // WebElement radioBtn = driver.findElement(By.id("toolsqa"));

              // check.click();

               // registerationpage.Robot().click();
                registerationpage.RegisterButton().click();
    }
}
