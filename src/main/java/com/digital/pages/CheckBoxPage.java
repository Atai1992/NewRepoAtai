package com.digital.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class CheckBoxPage extends BasePage {
    public SelenideElement homeButton = $x("(//button[@aria-label='Toggle'])[1]");
    public SelenideElement homeCheckbox = $x("//label[@for='tree-node-home']");
    public SelenideElement desktopButton = $x("(//button[@aria-label='Toggle'])[2]");
    public SelenideElement desktopCheckbox = $x("//label[@for='tree-node-desktop']");
    public SelenideElement notesCheckbox = $x("//label[@for='tree-node-notes']");
    public SelenideElement commandsCheckbox = $x("//label[@for='tree-node-commands']");
    public SelenideElement documentsButton = $x("(//button[@aria-label='Toggle'])[3]");
    public SelenideElement documentsCheckbox = $x("//label[@for='tree-node-documents']");
    public SelenideElement workSpaceButton = $x("(//button[@aria-label='Toggle'])[4]");
    public SelenideElement workSpaceCheckbox = $x("//label[@for='tree-node-workspace']");
    public SelenideElement reactCheckbox = $x(("//label[@for='tree-node-react']"));
    public SelenideElement angularCheckbox = $x(("//label[@for='tree-node-angular']"));
    public SelenideElement veuCheckbox =  $x(("//label[@for='tree-node-veu']"));
    public SelenideElement officeBtn = $(By.xpath("(//button[@aria-label='Toggle'])[5]"));
    public SelenideElement officeCheckBox = $x(("//label[@for='tree-node-office']"));
    public SelenideElement publicBtn = $x("//label[@for='tree-node-public']");
    public SelenideElement privateBtn = $x("//label[@for='tree-node-private']");
    public SelenideElement classifiedBtn = $x("//label[@for='tree-node-classified']");
    public SelenideElement generalBtn = $x("//label[@for='tree-node-general']");
    public SelenideElement downloadBtn = $(By.xpath("(//button[@aria-label='Toggle'])[6]"));
    public SelenideElement downloadsBtn = $x("//label[@for='tree-node-downloads']");
    public SelenideElement wordFileBtn = $x("//label[@for=‘tree-node-wordFile’]");
    public SelenideElement excelBtn = $x("//label[@for=‘tree-node-excelFile’]");
    public SelenideElement expandAllBtn = $x("//button[@title='Expand all']");
    public SelenideElement collapseButton = $x("//button[@title='Collapse all']");
    public SelenideElement successMessage = $x("//div[@id='result']");

    public CheckBoxPage goToCheckBox() {
        open("https://demoqa.com/checkbox");
        return this;
    }

    public CheckBoxPage clickExpandAllBtn() {
        expandAllBtn.click();
        return this;
    }

    public CheckBoxPage checkDesktop() {
        clickExpandAllBtn();
        desktopCheckbox.click();
        return this;
    }

    public boolean isDesktopSelected() {
        if (desktopCheckbox.isSelected() && notesCheckbox.isSelected() && commandsCheckbox.isSelected()) {

        }
        return true;
    }
    public CheckBoxPage selectWorkSpace(){
        workSpaceCheckbox.click();
        return this;
    }
    public boolean isWorkSpaceBoxesSelected() {
        if (workSpaceCheckbox.isSelected() && reactCheckbox.isSelected()
                && angularCheckbox.isSelected() && veuCheckbox.isSelected()) {
        }
        return true;
    }
    public CheckBoxPage selectOffice() {
        officeCheckBox.click();
        return this;
    }


    public boolean isOfficeSelected() {
        if (officeCheckBox.isSelected() && publicBtn.isSelected() && privateBtn.isSelected() && classifiedBtn.isSelected() &&
                generalBtn.isSelected()) {

        }
        return true;

    }
    public CheckBoxPage selectDownloads() {
        downloadsBtn.click();
        return this;
    }

    public boolean isDownloadSelected() {
        if (downloadsBtn.isSelected() && wordFileBtn.isSelected() && excelBtn.isSelected()) {

        }
        return true;
    }
}





