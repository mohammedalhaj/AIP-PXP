Scenario: TC-016 -Staff Home Page- Verify the functionality of "Find Person" link - Editor-In-Chief Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The Staff_Editor_In_Chief_Tasks should be Editor-In-Chief Tasks
And I click on Find_Person
Then The FirstName should be First Name
