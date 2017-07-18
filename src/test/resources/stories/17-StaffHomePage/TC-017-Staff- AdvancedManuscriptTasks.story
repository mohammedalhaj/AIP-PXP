Scenario: TC-017 -Staff Home Page- Verify the functionality of "Advanced Manuscript Tasks" link - Editor-In-Chief Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The Staff_Editor_In_Chief_Tasks should be Editor-In-Chief Tasks
And I click on Advanced_Manuscript_Tasks
Then The AMT_FAQ should be AMT FAQ
