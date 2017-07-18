Scenario: TC-009- Update Contact Information - Valid data

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Update_Contact_Information
And Fill empty to : Email_Add
And Fill mnajjar@aspire-infotech.net to : Email_Add
And I click on Modify_Profile
Then The modification_message should be Profile modification complete.