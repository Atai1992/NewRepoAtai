package com.digital.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ModalPage extends BasePage{
    public SelenideElement smallModal = $(byId("showSmallModal"));
    public SelenideElement closeSmallModal = $(byId("closeSmallModal"));
    public SelenideElement largeModal = $(byId("showLargeModal"));
    public SelenideElement closeLargeModal = $(byId("closeLargeModal"));
    public SelenideElement smallModalText = $x("/html/body/div[5]/div/div/div[2]");
    public SelenideElement largeModalText = $x("/html/body/div[5]/div/div/div/p");
}
