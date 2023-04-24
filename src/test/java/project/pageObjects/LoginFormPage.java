package project.pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginFormPage {
    private WebDriver driver;

    private WebElement usernameInput;
    private WebElement passwordInput;
    private WebElement submitButton;


    public LoginFormPage(WebDriver driver) {
        this.driver = driver;
        usernameInput = driver.findElement(By.name("user-name"));
        passwordInput = driver.findElement(By.name("password"));
        submitButton = driver.findElement(By.id("login-button"));
    }

    public void setUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void setPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }
}
