package com.digital.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class WebTablesPage extends BasePage{
    public SelenideElement addButton=$(byId("addNewRecordButton"));
    public SelenideElement searchBoxButton=$(byId("searchBox"));
    public SelenideElement editButton=$(byId("edit-record-4"));
    public SelenideElement deleteButton3=$(byId("delete-record-3"));
    public SelenideElement departmentField=$(byId("department"));
    public SelenideElement salaryField=$(byId("salary"));
    public SelenideElement ageField=$(byId("age"));
    public SelenideElement firstName = $(byId("firstName"));
    public SelenideElement lastName = $(byId("lastName"));
    public SelenideElement userEmail = $(byId("userEmail"));
    public SelenideElement submitButtonWebTables=$(byId("submit"));

    @FindBy(xpath = "//div[@class='rt-table']")
    public List<SelenideElement> nameList;

    public WebTablesPage inputFirstName(String str){
        elementActions.input(firstName, str);
        return this;
    }
    public WebTablesPage inputLastName(String str){
        elementActions.input(lastName, str);
        return this;
    }
    public WebTablesPage inputEmail(String str){
        elementActions.input(userEmail, str);
        return this;
    }

    public WebTablesPage inputAge(String ageNum) {
        elementActions.input(ageField, ageNum);
        return this;
    }
    public WebTablesPage inputSalary(String str){
        elementActions.input(salaryField, str);
        return this;
    }

    public WebTablesPage inputDepartment(String str){
        elementActions.input(departmentField,str);
        return this;
    }
    public WebTablesPage clickAdd(){
        elementActions.press(addButton);
        return this;
}
public WebTablesPage clickSubmit(){
        elementActions.press(submitButtonWebTables);
        return this;
    }
}
