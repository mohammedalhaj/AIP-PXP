Scenario: TC-025 -Staff Home Page-Verify the "Under Review" folder  - Editor-In-Chief Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The Staff_Editor_In_Chief_Tasks should be Editor-In-Chief Tasks
And I click on Under_Review
Then The Under_Review_Header should be Under Review