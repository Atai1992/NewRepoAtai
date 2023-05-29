package com.digital.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class NestedFramesPage extends BasePage{
    public SelenideElement parentFrame=$(byId("frame1"));
    public SelenideElement childFrame=$x("//iframe[contains(@srcdoc,'frame')]");
    public SelenideElement child1=$x("//body/p[text()='Child Iframe'");
    public SelenideElement parentFrameText = $x("//body[text()='Parent frame']");
    public SelenideElement childFrameText = $x("//body/p[text()='Child Iframe']");

}
