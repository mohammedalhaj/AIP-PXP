Scenario: TC-011- Verify Update Contact Information page - Cancel button

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Update_Contact_Information
And I click on Cancel
Then The home_page should display
