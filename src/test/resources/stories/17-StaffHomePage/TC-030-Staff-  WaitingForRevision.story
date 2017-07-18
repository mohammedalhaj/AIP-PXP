Scenario: TC-030 -Staff Home Page-Verify the " Waiting for Revision" folder  - Editor-In-Chief Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The Staff_Editor_In_Chief_Tasks should be Editor-In-Chief Tasks
And I click on  Waiting_for_Revision
Then The Waiting_for_Revision_Header should be  Waiting for Revision