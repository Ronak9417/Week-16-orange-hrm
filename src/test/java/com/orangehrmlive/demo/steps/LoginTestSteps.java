package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTestSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }
    @When("^I enter username$")
    public void iEnterUsername() {
        new LoginPage().enterUsername("Admin");
    }

    @And("^I enter password$")
    public void iEnterPassword() {
        new LoginPage().enterPassword("admin123");
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickLoginButton();
    }

    @Then("^I navigate to Dashboard page$")
    public void iNavigateToDashboardPage() {
    }

    @And("^I should verify Welcome message$")
    public void iShouldVerifyWelcomeMessage() {
        new DashboardPage().getDashboardText();
    }

    @Then("^I verify the logo$")
    public void iVerifyTheLogo() {
        new LoginPage().getLogoHRForALL();
    }

    @And("^I click on User Profile Logo$")
    public void iClickOnUserProfileLogo() {
        new DashboardPage().clickOnUserProfileLogo();
    }

    @Then("^I mouse hover on logout and click$")
    public void iMouseHoverOnLogoutAndClick() {
        new DashboardPage().mouseHooverOnLogoutAndClick();
    }

    @And("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
    }

    @And("^I verify the text Login Panel is displayed$")
    public void iVerifyTheTextLoginPanelIsDisplayed() {
        new LoginPage().loginPanelDisplayed();
    }
}
