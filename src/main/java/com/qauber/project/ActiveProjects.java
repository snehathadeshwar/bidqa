package com.qauber.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiveProjects {


    private WebDriver driver;
    public ActiveProjects(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getfirstProject() { return driver.findElement(By.xpath("//div[contains(@class, 'account-main-area')]" +
            "/div/div/div[1]/a"));
    }

    public WebElement getEditProject() { return driver.findElement(By.xpath("//*[@id='post-6260']/div/div[3]/div/a[2]"));
    }

    public WebElement getDescriptionEditProject() { return driver.findElement(By.xpath("//*[@id='post_edit_form']" +
            "/ul/li[15]/p[2]/textarea"));
    }

    public WebElement getSaveEditProject() { return driver.findElement(By.xpath("//*[@id='post_edit_form']" +
            "/ul/li[17]/p/input"));
    }

    public WebElement getClickHereEditProject() { return driver.findElement(By.xpath(".//*[@id='content']" +
            "/div/div/div/div/a/strong"));
    }

}
