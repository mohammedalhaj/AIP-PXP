Scenario: TC-089 -Staff Home Page-Verify the functionality of "Configuration Tasks" link - System Administration

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The System_Administration should be System Administration
And I click on System_Administration_Configuration_Tasks
Then The Configuration_Tasks_Header should be Configuration Tasks
