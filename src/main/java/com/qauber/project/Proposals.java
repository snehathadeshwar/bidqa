package com.qauber.project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Proposals {


    private WebDriver driver;

    public Proposals(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement MyAccount() { return driver.findElement(By.xpath("//*[@id='cssmenu']/ul/li[6]/a "));
    }


    public WebElement Project() {
        //((JavascriptExecutor) driver).executeScript(("arguments[0].scrollIntoView();"), driver.findElement(By.xpath("//*" +
               // "[@id='post-6097']/div/div[1]/a")));
        return driver.findElement(By.xpath("//*[@id='post-6097']/div/div[1]/a"));
    }


}
