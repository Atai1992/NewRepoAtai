package search;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import ui.BaseUiTest;



public class TestWebTablesPage extends BaseUiTest {
    @Test
    public void WebTableTest() {
        navigate.toWebTablesPage();
        webTablesPage.clickAdd()
                .inputFirstName("John ")
                .inputLastName("Wick")
                .inputEmail("Jw@gmail.com")
                .inputAge("45")
                .inputSalary("25000")
                .inputDepartment("Cinema")
                .submitButtonWebTables.click();
        webTablesPage.editButton.click();
        webTablesPage.departmentField.doubleClick().sendKeys(Keys.DELETE);
        webTablesPage.inputDepartment("Hollywood");
        webTablesPage.salaryField.doubleClick().sendKeys(Keys.DELETE);
        webTablesPage.inputSalary("250000");
        webTablesPage.ageField.doubleClick().sendKeys(Keys.DELETE);
                webTablesPage.inputAge("46")
                .clickSubmit();





    }




}







