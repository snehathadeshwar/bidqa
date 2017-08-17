package com.qauber.project;

import com.sun.java.util.jar.pack.DriverResource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class Subscription {

    private WebDriver driver;

    public Subscription(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAccountMysubscription() {
        return driver.findElement(By.xpath("//*[@id='cssmenu']/ul/li[6]/ul/li[1]/a"));

    }

    public WebElement getMysubscription() {
        return driver.findElement(By.xpath(".//*[@id='my-account-admin-menu']/li[2]/a"));
    }


    public WebElement getSubscribeButton() {
        return driver.findElement(By.xpath("//*[@id='subscribe-form']/button"));
    }

    public WebElement getSubscriptionTable() {
        return driver.findElement(By.id("my_subscribtions"));
    }

    public WebElement getTableRow() {
        return driver.findElement(By.xpath("//*[@id='my_subscribtions']/tbody/tr"));
    }

    public WebElement getDeleteButton() {
        return driver.findElement(By.xpath("//*[@id='my_subscribtions']/tbody/tr[1]/td[6]"));
    }


    }






