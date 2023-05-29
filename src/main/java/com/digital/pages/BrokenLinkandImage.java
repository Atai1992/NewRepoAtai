package com.digital.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;

public class BrokenLinkandImage extends BasePage{
    public SelenideElement workingLink=$(byLinkText("Click Here for Valid Link"));
    public SelenideElement brokenLink=$(byLinkText("Click Here for Broken Link"));
}
