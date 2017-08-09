package com.qauber.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiveProjects {


    private WebDriver driver;
    public ActiveProjects(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement firstProject() { return driver.findElement(By.xpath("//div[contains(@class, 'account-main-area')]" +
            "/div/div/div[1]/a"));
    }

    public WebElement editProject() { return driver.findElement(By.xpath("//*[@id='post-6260']/div/div[3]/div/a[2]"));
    }

    public WebElement descriptionEditProject() { return driver.findElement(By.xpath("//*[@id='post_edit_form']" +
            "/ul/li[15]/p[2]/textarea"));
    }

    public WebElement saveEditProject() { return driver.findElement(By.xpath("//*[@id='post_edit_form']" +
            "/ul/li[17]/p/input"));
    }

    public WebElement clickHereEditProject() { return driver.findElement(By.xpath(".//*[@id='content']" +
            "/div/div/div/div/a/strong"));
    }

}
