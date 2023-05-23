Feature: User Test

  As a user I should verify employee successfully

  Background: I am on homepage

    @sanity @regression
      Scenario: I should add user successfully
      When      I enter username
      And       I enter password
      And       I click on login button
      Then      I should navigate to login page successfully
      And       I click on Admin Tab
      Then      I verify system Users text
      And       I click on add button
      Then      I verify add user text
      And       I select User Role Admin
      And       I enter employee name "Sita Ram"
      And       I enter username "Gopal"
      And       I select status Disable
      And       I enter password "SitaRam1"
      And       I enter confirm password "SitaRam1"
      Then      I click on save button

      @smoke  @regression
        Scenario:  I should see the user in the result list
        When       I enter username
        And        I enter password
        And        I click on login button
        Then       I should navigate to login page successfully
        And        I click on Admin Tab
        And        I verify system Users text
        And        I enter System Users Username  "Hema Patel"
        And        I select User role
        And        I select Disable status
        And        I click on search button
        Then       I verify the user is in the result list

        @regression
        Scenario: I should able to delete the user successfully
          When    I enter username
          And     I enter password
          And     I click on login button
          Then    I should navigate to login page successfully
          And     I click on Admin Tab
          And     I verify system Users text
          And     I enter System Users Username  "Hema Patel"
          And     I select User role
          And     I enter employee name "Sita Ram"
          And     I select Disable status
          And     I click on search button
          Then    I verify the user is in the result list
          Then    I click on checkbox
          Then    I click on Delete button
          And     I click on popup button
          Then    I should be able to verify user Successfully Deleted

          @regression
          Scenario: I should be able to search deleted user and verify No Records Found Text
            When    I enter username
            And     I enter password
            And     I click on login button
            Then    I should navigate to login page successfully
            And     I click on Admin Tab
            And     I verify system Users text
            And     I enter System Users Username  "Hema Patel"
            And     I select User role
            And     I enter enter employee name "Sita Ram"
            And     I select Disable status
            And     I click on search button
            Then    I verify No Record Found Text
