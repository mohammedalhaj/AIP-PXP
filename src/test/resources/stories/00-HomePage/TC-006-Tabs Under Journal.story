Scenario: TC-006 - Verify tabs under go to journal tab

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Go_Journal
And I click on AIP_Advances
Then The AIP_Advances_site should display