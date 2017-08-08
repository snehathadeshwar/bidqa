package com.qauber.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterationPage {

    private WebDriver driver;

    public RegisterationPage(WebDriver driver) {
        this.driver = driver;
    }
    // This is for Username
    public WebElement Username() {
        return driver.findElement(By.xpath("//*[@id='user_login']"));
    }

    public WebElement Email() {
        return driver.findElement(By.xpath("//*[@id='user_email']"));
    }

    public WebElement Password() {
        return driver.findElement(By.xpath("//*[@id='pass1']"));
    }

    public WebElement RepeatPassword() {
        return driver.findElement(By.xpath("//*[@id='pass2']"));
    }

    public WebElement ProjectOwner() {
        return driver.findElement(By.xpath("//input[@value='business_owner']"));
    }


    public WebElement Robot() {
        return driver.findElement(By.xpath("//*[@id='recaptcha-anchor']"));
    }

    public WebElement RegisterButton() {
        return driver.findElement(By.xpath("//*[@id='submits']"));
    }

    }



