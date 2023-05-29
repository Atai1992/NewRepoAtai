package com.digital.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;


public class HomePage extends BasePage {
    public SelenideElement fullName=$(By.id("userName"));
    public SelenideElement email=$(By.id("userEmail"));
    public SelenideElement currentAddress=$(By.id("currentAddress"));
    public SelenideElement permanentAddress=$(By.id("permanentAddress"));
    public SelenideElement submitBtn=$(By.id("submit"));
    public SelenideElement output=$(By.id("output"));



public HomePage inputFullName(String str){
    elementActions.input(fullName,str);
    return this;
}
public HomePage inputEmail(String str){
    elementActions.input(email,str);
    return  this;
}
public HomePage inputCurAddress(String str){
    elementActions.input(currentAddress,str);
    return this;
}
public HomePage inputPermAddress(String str){
    elementActions.input(permanentAddress,str);
    return this;
}
public HomePage pressSubmitBtn(){
elementActions.press(submitBtn);
return this;


}}
