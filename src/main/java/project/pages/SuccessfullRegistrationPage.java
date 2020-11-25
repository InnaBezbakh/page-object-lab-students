package project.pages;

import org.openqa.selenium.By;

public class SuccessfullRegistrationPage extends BasePage {

    By textIsVisible = By.xpath("//h1[text()='Your Account Has Been Created!']");


    public String getSuccessfullRegistrationText() {
        String actualResult = find(textIsVisible).getText();
        return actualResult;
    }
}
