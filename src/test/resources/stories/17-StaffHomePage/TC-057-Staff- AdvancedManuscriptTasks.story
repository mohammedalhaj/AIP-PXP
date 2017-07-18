Scenario: TC-057 -Staff Home Page-Verify the functionality of "Advanced Manuscript Tasks" link - Staff Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The StaffTask should be Staff Tasks
And I click on StaffTask_Advanced_Manuscript_Tasks
Then The AMT_FAQ should be AMT FAQ
