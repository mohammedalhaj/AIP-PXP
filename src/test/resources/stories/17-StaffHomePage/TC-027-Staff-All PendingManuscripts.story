Scenario: TC-027 -Staff Home Page-Verify the "All Pending Manuscripts" folder  - Editor-In-Chief Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The Staff_Editor_In_Chief_Tasks should be Editor-In-Chief Tasks
And I click on All_Pending_Manuscriptsn
Then The All_Pending_Manuscriptsn_Header should be All Pending Manuscripts