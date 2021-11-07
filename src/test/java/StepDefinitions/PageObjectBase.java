package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectBase extends BaseDriver {

    static By firstNameField = By.name("map(firstName)");
    static By lastNameField = By.name("map(lastName)");
    static By joinNow = By.name("map(firstName)");
    static By checkBoxForTerms = By.name("map(terms)");
    static By joinCheckBox = By.xpath("//input[@value='Join Now!']");

    public static WebElement getFirstNameField() { return retryFindElement(firstNameField);}
    public static WebElement getLastNameField() { return retryFindElement(lastNameField);}
    public static WebElement getJoinNow() { return retryFindElement(joinNow);}
    public static WebElement getCheckBoxForTerms() { return retryFindElement(checkBoxForTerms);};
    public static WebElement getJoinCheckBox() { return retryFindElement(joinCheckBox);}

    public static WebElement waitToBeClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement retryFindElement(By by){
        WebElement element = null;
        int attempts = 0;
        while(attempts<3){
            try{
                element = waitToBeClickable(driver.findElement(by));
                if(element!=null){
                    break;
                }
            }catch (org.openqa.selenium.StaleElementReferenceException e){
                element = waitToBeClickable(driver.findElement(by));
            }
            attempts++;
        }
        return element;
    }



}


