Scenario: TC-028 -Staff Home Page-Verify the "Consult on Manuscript" folder  - Editor-In-Chief Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The Staff_Editor_In_Chief_Tasks should be Editor-In-Chief Tasks
And I click on Consult_on_Manuscript
Then The Consult_on_Manuscript_Header should be Consult on Manuscript