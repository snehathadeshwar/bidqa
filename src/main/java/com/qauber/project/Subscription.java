package com.qauber.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Subscription {

    private WebDriver driver;

    public Subscription(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement accountMysubscription() {
        return driver.findElement(By.xpath("//*[@id='cssmenu']/ul/li[6]/ul/li[1]/a"));
    }

    public WebElement Mysubscription() {
        return driver.findElement(By.xpath(".//*[@id='my-account-admin-menu']/li[2]/a"));
    }


    public WebElement subscribeButton() {
        return driver.findElement(By.xpath("//*[@id='subscribe-form']/button"));
    }

    //public WebElement Email() {
    // return driver.findElement(By.xpath("//*[@id='login_password']"));


    //public WebElement deleteButton() {
       // return driver.findElement(By.xpath("//*[@id='774']"));
    }






