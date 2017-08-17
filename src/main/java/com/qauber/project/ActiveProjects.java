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
    public WebElement getPostedProjectsFilter() { return driver.findElement(By.xpath(".//*[@id='all_filter']"));
    }

    public WebElement getFirstOpenPostedProjects() { return driver.findElement(By.xpath("//div[contains" +
            "(@class,'box_content')]/div/div/div/a"));
    }
    public WebElement getSubmitProposal() { return driver.findElement(By.xpath("//*[@id='submit-proposal-id']"));
    }
    public WebElement getbid() { return driver.findElement(By.xpath("//*[contains(@class,'bid_field')]"));
            //".//*[@id='fancybox-content']" +
            //"/div/div/div[2]/div/form/ul/li[1]/p"));
    }
    public WebElement getbidDescription() { return driver.findElement(By.xpath(".//*[@id='fancybox-content']" +
            "/div/div/div[2]/div/form/ul/li[6]/p/textarea"));
    }

    public WebElement getCheckboxBid() { return driver.findElement(By.xpath(".//*[@id='submits_crt_check']"));
    }
    public WebElement getPlaceBid() { return driver.findElement(By.xpath(".//*[@id='submits_crt']"));
    }

}
