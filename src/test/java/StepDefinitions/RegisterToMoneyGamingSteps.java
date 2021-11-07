package StepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class RegisterToMoneyGamingSteps extends BaseDriver {


    public RegisterToMoneyGamingSteps() {

    }

    //todo: #Test case 1: As a new customer, the user should not be able to create an account without the Birthdate field is missing.

    @Given("User navigates to the moneygaming application")
    public void user_navigates_to_the_moneygaming_application() {

        PageObjectBase.driver.get("https://moneygaming.qa.gameaccount.com");
    }

    @When("User enters the firstName and Surname")
    public void user_enters_the_firstName_and_Surname() {
        driver.findElement(By.xpath("//a[contains(text(), 'Join')]")).click(); //join now click

        PageObjectBase.getFirstNameField().sendKeys("ahmet");
        PageObjectBase.getLastNameField().sendKeys("selimgul");
    }

    @When("User selects the tickbox for the termsandconditions")
    public void user_selects_the_tickbox_for_the_termsandconditions() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        PageObjectBase.getCheckBoxForTerms().click();
    }

    @When("User clicks on the Join Now button")
    public void user_clicks_on_the_Join_Now_button() {
        PageObjectBase.getJoinCheckBox().click();
    }

    @Then("User views the validation message for the date of birth field.")
    public void user_views_the_validation_message_for_the_date_of_birth_field() {
        String validationMessage = "This field is required";
        Assert.assertEquals(driver.findElement(By.xpath("//label[@for='dob']")).getText(), validationMessage);
    }


}
