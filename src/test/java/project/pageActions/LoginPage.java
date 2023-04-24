package project.pageActions;
import org.openqa.selenium.WebDriver;
import project.pageObjects.LoginFormPage;

public class LoginPage extends  LoginFormPage{

    private WebDriver driver;
    private LoginFormPage loginForm;

    // Constructor
    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        loginForm = new LoginFormPage(driver);
    }

    public void login(String username, String password) {
        loginForm.setUsername(username);
        loginForm.setPassword(password);
        loginForm.clickSubmitButton();
    }

}
