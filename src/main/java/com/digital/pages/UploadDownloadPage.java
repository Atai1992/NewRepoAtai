package com.digital.pages;

import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class UploadDownloadPage extends BasePage{
    public SelenideElement downloadButton = $(byId("downloadButton"));

    public SelenideElement chooseFileButton = $(byId("uploadFile"));
    public SelenideElement uploadedFilePath = $(byId("uploadedFilePath"));

    public UploadDownloadPage clickDownloadButton(){
        elementActions.press(downloadButton);
        return this;
    }

    public UploadDownloadPage clickChooseFile(){
        chooseFileButton.click();
        return this;
    }
    public UploadDownloadPage uploadFileButton(String path){
        chooseFileButton.setValue(path);
        return this;
    }


}
