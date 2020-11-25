package project.pages;

import org.openqa.selenium.By;
import project.pages.BasePage;

public class RegistrationPage extends BasePage {
    By fieldName = By.xpath("//input[@id='input-firstname']");
    By fieldLastName = By.xpath("//input[@id='input-lastname']");
    By fieldEmailName = By.xpath("//input[@id='input-email']");
    By fieldTelephone = By.xpath("//input[@id='input-telephone']");
    By fieldPassword = By.xpath("//input[@id='input-password']");
    By fieldConfirmPassword = By.xpath("//input[@id='input-confirm']");
    By agreeCheckBox = By.xpath("//input[@name='agree']");
    By buttonContinue = By.xpath("//input[@class='btn btn-primary']");

    public RegistrationPage setUserName(String userName){
        find(fieldName).sendKeys(userName);
        return this;
    }
    public RegistrationPage setLastName(String lastName){
        find(fieldLastName).sendKeys(lastName);
        return this;
    }
    public RegistrationPage setEmail(String email){
        find(fieldEmailName).sendKeys(email);
        return this;
    }
    public RegistrationPage setTelephone(String telephone){
        find(fieldTelephone).sendKeys(telephone);
        return this;
    }
    public RegistrationPage setPassword(String password){
        find(fieldPassword).sendKeys(password);
        return this;
    }
    public RegistrationPage setConfirmPassword(String confpassword){
        find(fieldConfirmPassword).sendKeys(confpassword);
        return this;
    }
    public RegistrationPage clickAgreeCheckBox(){
        find(agreeCheckBox).click();
        return this;
    }
    public SuccessfullRegistrationPage clickButtonContinue(){
        find(buttonContinue).click();
        return new SuccessfullRegistrationPage();
    }


}
