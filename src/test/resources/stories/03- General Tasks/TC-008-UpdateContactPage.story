Scenario: TC-008- Verify Update Contact Information page

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Update_Contact_Information
Then The profile_Message should be Will you please take a minute to update your profile?
And The info_fields should display
And The password_message should display
And The Cancel should display
And The Modify_Profile should display

