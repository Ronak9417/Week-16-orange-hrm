package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.ViewSystemUserPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class UserTestSteps {
    @And("^I click on Admin Tab$")
    public void iClickOnAdminTab() {
        new ViewSystemUserPage().clickAdminLink();
    }

    @Then("^I verify system Users text$")
    public void iVerifySystemUsersText() {
        new ViewSystemUserPage().getSystemUserText();
    }

    @And("^I click on add button$")
    public void iClickOnAddButton() {
        new ViewSystemUserPage().clickAddButton();
    }

    @Then("^I verify add user text$")
    public void iVerifyAddUserText() {
        new ViewSystemUserPage().AddUser();
    }

    @And("^I select User Role Admin$")
    public void iSelectUserRoleAdmin()throws InterruptedException {
        new ViewSystemUserPage().selectAdminRole();
    }

    @And("^I enter employee name \"([^\"]*)\"$")
    public void iEnterEmployeeName(String emp) throws InterruptedException  {
        new ViewSystemUserPage().enterEmp(emp);

    }

    @And("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String username)  {
        new ViewSystemUserPage().enterUser(username);

    }

    @And("^I select status Disable$")
    public void iSelectStatusDisable() throws InterruptedException{
        new ViewSystemUserPage().selectDisableOption();
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new ViewSystemUserPage().enterPass(password);

    }

    @And("^I enter confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String confirmpassword)  {
        new ViewSystemUserPage().enterConfirmPass(confirmpassword);

    }

    @Then("^I click on save button$")
    public void iClickOnSaveButton() {
        new ViewSystemUserPage().clickOnSaveButton();
    }


    @And("^I enter System Users Username  \"([^\"]*)\"$")
    public void iEnterSystemUsersUsername(String username)  {
        new AddUserPage().enterUsername(username);

    }

    @And("^I select User role$")
    public void iSelectUserRole() throws InterruptedException{
        new AddUserPage().selectUserRole();
    }

    @And("^I select Disable status$")
    public void iSelectDisableStatus() throws InterruptedException{
        new AddUserPage().selectStatusDisable();
    }

    @And("^I click on search button$")
    public void iClickOnSearchButton() {
        new AddUserPage().clickSearchButton();
    }

    @Then("^I verify the user is in the result list$")
    public void iVerifyTheUserIsInTheResultList() throws InterruptedException{
        new AddUserPage().verifyResultList();
    }

    @Then("^I click on checkbox$")
    public void iClickOnCheckbox() throws InterruptedException {
       new AddUserPage().clickOnCheckbox();
    }

    @Then("^I click on Delete button$")
    public void iClickOnDeleteButton() throws InterruptedException {
        new AddUserPage().clickDeleteButton();
    }

    @And("^I click on popup button$")
    public void iClickOnPopupButton() throws InterruptedException {
        new AddUserPage().popUpClick();
    }

    @Then("^I should be able to verify user Successfully Deleted$")
    public void iShouldBeAbleToVerifyUserSuccessfullyDeleted() {
        new AddUserPage().verifyMsgCheck();
    }

    @And("^I enter enter employee name \"([^\"]*)\"$")
    public void iEnterEnterEmployeeName(String emp) throws InterruptedException {
        new ViewSystemUserPage().enterEmp(emp);

    }

    @Then("^I verify No Record Found Text$")
    public void iVerifyNoRecordFoundText() {
        new AddUserPage().VerifyNoRecordFound();
    }
}
