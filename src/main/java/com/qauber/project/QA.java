package com.qauber.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QA {

    private WebDriver driver;

    public QA(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement Username() {
        return driver.findElement(By.xpath("//*[@id='log']"));
    }

    //public WebElement Email() {
       // return driver.findElement(By.xpath("//*[@id='login_password']"));


    public WebElement Password() {
        return driver.findElement(By.xpath("//*[@id='login_password']"));
    }

    public WebElement SignIn() {
        return driver.findElement(By.xpath("//*[@id='submits']"));
    }

}


