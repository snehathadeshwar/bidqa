package com.qauber.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccount {

    private WebDriver driver;
    public MyAccount(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement MyAccount() { return driver.findElement(By.xpath("//*[@id='cssmenu']/ul/li[6]/a "));
    }


    public WebElement Activeprojects() { return driver.findElement(By.xpath(".//*[@id='my-account-admin-menu_seller']" +
            "/li[2]/a "));
    }


}
