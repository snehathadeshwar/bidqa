package com.qauber.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement Username() {
        return driver.findElement(By.xpath("//*[@id='log']"));
    }


    public WebElement Password() {
        return driver.findElement(By.xpath(".//*[@id='login_password']"));
    }


    public WebElement LoginButton() {
        return driver.findElement(By.xpath(".//*[@id='submits']"));
    }

    public WebElement LostYourPassword() {
        return driver.findElement(By.xpath("//*[@id='logins']/li[3]/a"));
    }
}
