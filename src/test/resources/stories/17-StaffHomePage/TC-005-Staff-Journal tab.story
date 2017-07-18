Scenario: TC-005 -Staff Home Page- Verify going to journal tab

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on Go_Journal
Then The list_publications should display