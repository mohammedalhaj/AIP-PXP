Scenario: TC-029 -Staff Home Page-Verify the "Post Decision" folder  - Editor-In-Chief Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The Staff_Editor_In_Chief_Tasks should be Editor-In-Chief Tasks
And I click on Post_Decision
Then The Post_Decision_Header should be Post Decision