package com.qauber.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccount {

    private WebDriver driver;
    public MyAccount(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getMyAccount() { return driver.findElement(By.xpath("//*[@id='cssmenu']/ul/li[6]/a "));
    }


    public WebElement getActiveprojects() { return driver.findElement(By.xpath(".//*[@id='my-account-admin-menu_seller']" +
            "/li[2]/a "));
    }

    public WebElement getMyProjects() { return driver.findElement(By.xpath(".//*[@id='cssmenu']/ul/li[5]/a"));
    }

    public WebElement getProjectsWon() { return driver.findElement(By.xpath("//*[@id='my-account-admin-menu_buyer']/li[1]/a"));
    }

    public WebElement getProjectsWonNum() { return driver.findElement(By.xpath("//*[@id='my-account-admin-menu_buyer']/li[1]/a/span"));
    }

}
