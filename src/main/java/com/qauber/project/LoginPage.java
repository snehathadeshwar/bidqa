package com.qauber.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsername() {
        return driver.findElement(By.xpath("//*[@id='log']"));
    }


    public WebElement getPassword() {
        return driver.findElement(By.xpath(".//*[@id='login_password']"));
    }


    public WebElement getLoginButton() {
        return driver.findElement(By.xpath(".//*[@id='submits']"));
    }

    public WebElement getLostYourPassword() {
        return driver.findElement(By.xpath("//*[@id='logins']/li[3]/a"));
    }

    public WebElement getRememberMe() {
        return driver.findElement(By.xpath(".//*[@id='rememberme']"));
    }

    public WebElement getwelcomeMessage() {
        return driver.findElement(By.xpath("//*[@id='header']/div/div/div[4]"));
    }

    public WebElement getLoggedinMessage() {
        return driver.findElement(By.xpath("//*[@id='cssmenu2']/ul/li[7]"));
    }

    public WebElement getUserOrPassError() {
        return driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/div[1]/ul/li"));
    }

    public WebElement getBlankPasswordError() {
        return driver.findElement(By.xpath(".//*[@id='main']/div/div/div/div/div[1]/ul/li"));
    }
}