package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class CreateUserPage {

    public CreateUserPage(){
        //driver tanimla
        WebDriver driver = new ChromeDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="Name")
    private WebElement nameButton;
    @FindBy(id="Salary")
    private WebElement salaryButton;
    @FindBy(id="Grade")
    private WebElement gradeButton;
    @FindBy(id="DurationWorked")
    private WebElement workedDurationButton;
    @FindBy(id="Email")
    private WebElement emailButton;

    @FindBy(linkText="Create New")
    private WebElement createNewButton;

    @FindBy(xpath="//input[@type=\"submit\"]")
    private WebElement createSubmitButton;

    @FindBy(xpath = "//tr/td[5]")
    private List<WebElement> emailList;


    public void addNewUser(String name, String salary, String workedDuration, String grade, String email){

        nameButton.sendKeys(name);
        salaryButton.sendKeys(salary);
        workedDurationButton.sendKeys(workedDuration);
        gradeButton.sendKeys(grade);
        emailButton.sendKeys(email);

    }
    public void clickCreate(){
        createSubmitButton.click();

    }


    public void checkemail(String email) {
        List<String> emaillist = new ArrayList<>();
        for (WebElement webElement : emailList) {
            emaillist.add(webElement.getText());
        }
        Assert.assertTrue(emaillist.contains(email));

    }

    public void clickCreateNewUser() {
        createNewButton.click();
    }
}
