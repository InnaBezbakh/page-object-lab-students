package project.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    By fieldEmail = By.xpath("//input[@id='input-email']");
    By fieldPassword = By.xpath("//input[@id='input-password']");
    By buttonSubmit = By.xpath("//input[@class='btn btn-primary']");

    public LoginPage setMyEmail(String myEmailForLogin){
        find(fieldEmail).sendKeys(myEmailForLogin);
        return this;
    }

    public LoginPage setMyPassword(String myPasswordForLogin){
        find(fieldPassword).sendKeys(myPasswordForLogin);
        return this;
    }

    public MyAccountPage clickOnTheSubmitButton(){
        find(buttonSubmit).click();
        return new MyAccountPage();
    }


}
