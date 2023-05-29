package com.digital.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class FramesPage extends BasePage{

        public SelenideElement frameOne=$(byId("frame1"));
        public SelenideElement frameTwo=$(byId("frame2"));
    }

