Scenario: TC-001- Verify Accepted - Waiting for Production Page

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on Waiting_for_Production
Then MS waiting for production should display

