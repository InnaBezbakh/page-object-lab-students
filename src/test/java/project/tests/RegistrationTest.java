package project.tests;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import project.pages.MainPage;
import project.pages.SuccessfullRegistrationPage;
import project.tests.utils.RandomEmails;
import static org.assertj.core.api.Assertions.*;
import static project.tests.utils.RandomEmails.generateEmail;

public class RegistrationTest extends BaseTest {


  private MainPage mainPage;


  @Test
  public void registrationWithValidCredentials() {
    String userName = "Inn";
    String lastName = "Bezbak";
    String email = RandomEmails.generateEmail()+ "@mailinator.com";
    String telephone = "+380935555555";
    String password = "99999q";
    String confpassword = "99999q";
    String successfulRegistrationText = "Your Account Has Been Created!";


    mainPage = new MainPage();
    mainPage.openMainPage();

String actualText = mainPage.clickOnTheIconAccount()
            .clickRegistrationButton()
            .setUserName(userName)
            .setLastName(lastName)
            .setEmail(email)
            .setTelephone(telephone)
            .setPassword(password)
            .setConfirmPassword(confpassword)
            .clickAgreeCheckBox()
            .clickButtonContinue()
            .getSuccessfullRegistrationText();

    Assertions.assertThat(actualText).isEqualTo(successfulRegistrationText);
  }

}
