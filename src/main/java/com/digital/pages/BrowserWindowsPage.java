package com.digital.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class BrowserWindowsPage extends BasePage{
    public SelenideElement newTabButton=$(byId("tabButton"));
    public SelenideElement newWindowButton=$(byId("windowButton"));
    public SelenideElement newWindowMessageButton=$(byId("messageWindowButton"));
    public SelenideElement newTabHeading = $(byId("sampleHeading"));

    public BrowserWindowsPage clickNewTabButton(){
        elementActions.press(newTabButton);
        return this;
    }
    public BrowserWindowsPage clickNewWindowButton(){
        elementActions.press(newWindowButton);
        return this;
    }
    public BrowserWindowsPage clickNewWindowMessageButton(){
        elementActions.press(newWindowMessageButton);
        return this;
    }

}
