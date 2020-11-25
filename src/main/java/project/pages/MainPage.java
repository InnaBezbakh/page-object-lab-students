package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {

  By iconAccount = By.xpath("//a[@title='My Account']"); //i[@class='fa fa-user']
  By buttonRegister = By.xpath("//li[@class='dropdown open']//a[text()='Register']");
  By buttonLogin = By.xpath("//li//a[text()='Login']");

  public MainPage openMainPage() {
    getDriver().get("https://demo.opencart.com/");
    return this;
  }


  public MainPage clickOnTheIconAccount(){
    //find(iconAccount).click();
    waitUntilVisible(iconAccount, 5).click();
    return this;
  }

  public RegistrationPage clickRegistrationButton() {
    waitUntilVisible(buttonRegister, 5).click();
    return new RegistrationPage();
  }

public LoginPage clickLoginButton(){
    waitUntilVisible(buttonLogin, 5).click();
    return new LoginPage();
}

}
