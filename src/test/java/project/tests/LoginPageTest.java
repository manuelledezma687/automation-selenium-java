package project.tests;
import org.junit.Test;
import project.pageActions.LoginPage;

public class LoginPageTest extends BaseTest {

    @Test
    public void testLoginSuccess() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
    }
}