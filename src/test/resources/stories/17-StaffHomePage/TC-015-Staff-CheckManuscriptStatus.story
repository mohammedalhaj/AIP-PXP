Scenario: TC-015 -Staff Home Page- Verify the functionality of "Check Manuscript Status" link - Editor-In-Chief Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The Staff_Editor_In_Chief_Tasks should be Editor-In-Chief Tasks
And I click on Check_Manuscript_Status
Then The ManuscriptNumber should be Manuscript #
