package project.tests;

import components.enums.TopMenuComponents;
import org.junit.Before;
import org.junit.Test;
import project.pages.MainPage;
import project.pages.MyAccountPage;

public class AddToWishListTest extends BaseTest {
    private MainPage mainPage;
    private MyAccountPage myAccountPage;

    @Before
    public void loginWithMyOwnCred() {
        String myEmailForLogin = "inna@mailinator.com";
        String myPasswordForLogin = "999999";
        String successfulLoginText = "My Account";

        mainPage = new MainPage();

        myAccountPage = mainPage.openMainPage()
                .clickOnTheIconAccount()
                .clickLoginButton()
                .setMyEmail(myEmailForLogin)
                .setMyPassword(myPasswordForLogin)
                .clickOnTheSubmitButton();
    }

    @Test
    public void addItemsToWishList() {

        myAccountPage.getTopMenu().hoverComponentsButton();


    }

}
