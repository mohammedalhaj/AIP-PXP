Scenario: TC-006 -Staff Home Page- Verify tabs under go to journal tab

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on Go_Journal
And I click on AIP_Advances
Then The AIP_Advances_site should display