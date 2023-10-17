package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FirstPage {



    WebDriver driver;

    public FirstPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Employee List")
    private WebElement employeeListButton;


    public void navigateToEmployeeList() {
        employeeListButton.click();
    }
}
