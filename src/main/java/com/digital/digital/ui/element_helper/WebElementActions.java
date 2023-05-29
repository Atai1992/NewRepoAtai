package com.digital.digital.ui.element_helper;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;




public class WebElementActions {
    public WebElementActions input(SelenideElement element, String txt){
        element.sendKeys(txt);
        return this;
    }

    public WebElementActions press(SelenideElement element){
        element.click();
        return this;
    }


    public WebElementActions pressDownAndEnter(SelenideElement element){
        element.sendKeys(Keys.DOWN,Keys.ENTER);
        return this;

    }
    public WebElementActions scrollPage(SelenideElement element){
        element.sendKeys(Keys.PAGE_DOWN);
        return this;
    }
}
