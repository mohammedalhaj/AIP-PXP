Scenario: TC-010- Verify validation mesages on Update Contact Information page

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Update_Contact_Information
And Fill test to : new_password1
And I click on Modify_Profile
Then The Sorry_Message should be Sorry, your profile modification could not be completed.