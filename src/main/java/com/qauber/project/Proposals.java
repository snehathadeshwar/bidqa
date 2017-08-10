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



    public WebElement Project() {

        return driver.findElement(By.xpath("//div[@id='content']/div[@class='post']/div[@class='padd10']" +
                        "/div[@class='post-title']/a"));

    }


}
