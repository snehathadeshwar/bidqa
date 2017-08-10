package com.qauber.project;

import org.openqa.selenium.WebDriver;

public class PageResources {

    private HomePage homePage;
    private LoginPage loginPage;
    private MyAccount myAccount;
            private PageResources pageResources;
            private Proposals proposals;
            private QA qa;
            private RegisterationPage registerationPage;
            private Subscription subscription;
            private ActiveProjects activeProjects;

    public PageResources(WebDriver driver) {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);

        registerationPage = new RegisterationPage(driver);
        subscription = new Subscription(driver);
        activeProjects = new ActiveProjects(driver);
        myAccount = new MyAccount(driver);
         qa = new QA(driver);
        proposals = new Proposals(driver);

    }

    public HomePage HomePage() {
        return homePage;
    }

    public LoginPage LoginPage(){
        return loginPage;
    }

    public MyAccount MyAccount(){
        return myAccount;
    }

    public Proposals Proposals(){
        return proposals;
    }
    public QA QA(){
        return qa;
    }
    public RegisterationPage RegisterationPage(){
        return registerationPage;
    }

    public Subscription Subscription(){
        return subscription;
    }

    public ActiveProjects ActiveProjects(){
        return activeProjects;
    }
}
