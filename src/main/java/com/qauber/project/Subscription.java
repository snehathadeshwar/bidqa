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

    public WebElement accountMysubscription() {
        return driver.findElement(By.xpath("//*[@id='cssmenu']/ul/li[6]/ul/li[1]/a"));

    }

    public WebElement Mysubscription() {
        return driver.findElement(By.xpath(".//*[@id='my-account-admin-menu']/li[2]/a"));
    }


    public WebElement subscribeButton() {
        return driver.findElement(By.xpath("//*[@id='subscribe-form']/button"));
    }

    public WebElement subscriptionTable() {
        return driver.findElement(By.id("my_subscribtions"));
    }

    public WebElement tableRow() {
        return driver.findElement(By.xpath("//*[@id='my_subscribtions']/tbody/tr"));
    }

    public WebElement deleteButton() {
        return driver.findElement(By.xpath("//*[@id='my_subscribtions']/tbody/tr[1]/td[6]"));
    }

    @AfterTest
    public void tearup () {

        driver.quit();
    }

    }






