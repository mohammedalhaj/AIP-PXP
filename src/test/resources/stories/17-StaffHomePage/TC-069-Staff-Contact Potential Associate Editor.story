Scenario: TC-069 -Staff Home Page-Verify the "Contact Potential Associate Editor" folder  - Staff Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The StaffTask should be Staff Tasks
And I click on Contact_Potential_Associate_Editor
Then The Contact_Potential_Associate_Editor_Header should be Contact Potential Associate Editor