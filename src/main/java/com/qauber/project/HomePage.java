package com.qauber.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement ForQAProfessionals() {
        return driver.findElement(By.xpath("//*[@id='cssmenu']/ul/li[3]/a"));
    }

    public WebElement Registeration() {
        return driver.findElement(By.xpath("//a[@href='http://test.bidqa.com/wp-login.php?action=register']"));
    }

    public WebElement QAContractorsProfile() {
        return driver.findElement(By.linkText("QA Contractors profiles"));

    }

}



