package components;

import components.enums.TopMenuComponents;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter
public class TopMenu {

    private static WebDriver driver;
    private static WebDriverWait wait;


    public TopMenu(WebDriver webDriver) {
        driver = webDriver;
        wait = new WebDriverWait(driver, 10);
    }


    By componentsButton = By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']//a[text()='Components']");
    By desctopsButton = By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']//a[text()='Desktops']");
    By leptopsNotebooksButton = By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']//a[text()='Laptops & Notebooks']");
    By tabletsButton = By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']//a[text()='Tablets']");
    By softwareButton = By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']//a[text()='Software']");
    By phonesButton = By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']//a[text()='Phones & PDAs']");
    By camerasButton = By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']//a[text()='Cameras']");
    By mp3PlayersButton = By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']//a[text()='MP3 Players']");


    By monitorItems = By.xpath("//*[contains(text(),'Monitors')]");

    public TopMenu hoverComponentsButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(componentsButton)).build().perform();
        return this;
    }

    //public TopMenu click
    public TopMenu selectComponentsItems(TopMenuComponents topMenuItem) {
        Actions actions = new Actions(driver);
        switch (topMenuItem) {
            case COMPONENTS:
                actions.moveToElement(driver.findElement(componentsButton)).build().perform();
                break;
            //case DESKTOP:
            // actions.moveToElement(driver.findElement(Items)).build().perform();
        }
        return this;
    }

    public TopMenu clickMonitorItemSubMenu() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(monitorItems)).click();
        return
    }
}
}
