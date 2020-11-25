package project.pages;

import org.openqa.selenium.By;

public class MyAccountPage extends BasePage{
 By textMyAccount = By.xpath("//h2[text()='My Account']");

    public String getSuccessfullLoginText() {
       String actualResult1 = find(textMyAccount).getText();
       return actualResult1;
    }

}
