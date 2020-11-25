package project.tests;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import project.pages.MainPage;

public class LoginTest extends BaseTest {

    private MainPage mainPage;

    @Test
    public void loginWithMyOwnCred(){
        String myEmailForLogin = "inna@mailinator.com";
        String myPasswordForLogin = "999999";
        String successfulLoginText = "My Account";

        mainPage = new MainPage();
        mainPage.openMainPage();

        String actualTextAfterLogin = mainPage.clickOnTheIconAccount()
                .clickLoginButton()
                .setMyEmail(myEmailForLogin)
                .setMyPassword(myPasswordForLogin)
                .clickOnTheSubmitButton()
                .getSuccessfullLoginText();

        Assertions.assertThat(actualTextAfterLogin).isEqualTo(successfulLoginText);

    }

}
