Scenario: TC-066 -Staff Home Page-Verify the "Initial QC" folder

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The StaffTask should be Staff Tasks
And I click on Initial_QC
Then The Initial_QC_Header should be Initial QC