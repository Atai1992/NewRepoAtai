package com.digital.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class AlertsPage extends BasePage{
    public SelenideElement alertButton = $(byId("alertButton"));
    public SelenideElement timerAlertButton = $(byId("timerAlertButton"));
    public SelenideElement confirmButton = $(byId("confirmButton"));
    public SelenideElement textOkCancel = $(byId("confirmResult"));
    public SelenideElement promtButton = $(byId("promtButton"));
    public SelenideElement promptText = $(byId("promptResult"));

    public AlertsPage clickAlertButton(){
        alertButton.click();
        Selenide.actions().sendKeys(Keys.ENTER).perform();
        return this;
    }
    public AlertsPage clickTimerAlertButton(){
        timerAlertButton.click();
        return this;
    }
    public AlertsPage confirmButton(){
        confirmButton.click();
        return this;
    }
    public AlertsPage clickPromptButton(){
        promtButton.click();
        return this;
    }

}
