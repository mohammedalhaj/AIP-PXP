Scenario: TC-054 -Staff Home Page-Verify the functionality of "Check Manuscript Status" link - Staff Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The StaffTask should be Staff Tasks
And I click on StaffTask_Check_Manuscript_Status
Then The ManuscriptNumber should be Manuscript #
