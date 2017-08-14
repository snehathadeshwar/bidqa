package com.qauber.project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterationPage {

    private WebDriver driver;

    public RegisterationPage(WebDriver driver) {
        this.driver = driver;
    }
    // This is for Username
    public WebElement getUsername() {
        return driver.findElement(By.xpath("//*[@id='user_login']"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.xpath("//*[@id='user_email']"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.xpath("//*[@id='pass1']"));
    }

    public WebElement getRepeatPassword() {
        return driver.findElement(By.xpath("//*[@id='pass2']"));
    }

    public WebElement getProjectOwner() {
        return driver.findElement(By.xpath("//input[@value='business_owner']"));
    }

    public WebElement getRobot() {
        return driver.findElement(By.xpath("//*[@id='recaptcha-anchor']"));
    }

    public WebElement getRegisterButton() {
        return driver.findElement(By.xpath("//*[@id='submits']"));
    }
    public WebElement getMismatchError() {
        return driver.findElement(By.xpath(".//*[@id='main']/div/div/div/div/div[1]/ul/li[1]"));
    }
    public WebElement getEmptyRobotError() {
        return driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/div[1]/ul/li"));
    }
    public WebElement getUsernameError() {
        return driver.findElement(By.xpath("//*[@id='error_username']"));
    }


    public WebElement getLoginButton() {
        ((JavascriptExecutor) driver).executeScript(("arguments[0].scrollIntoView();"), driver.findElement(By.xpath("//" +
                "*[@id='logins']/li[2]/a")));
        return driver.findElement(By.xpath("//*[@id='logins']/li[2]/a"));
    }
}




