package com.digital.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class RadioButtonPage extends BasePage{
    public SelenideElement yesButton=$(byText("Yes"));
    public SelenideElement impressiveButton=$(byText("Impressive"));
    public SelenideElement noButton=$(byText("No"));
    public SelenideElement textYes=$x("//span[text()='Yes']");
    public SelenideElement textImpressive=$x("//span[text()='Impressive']");



}
