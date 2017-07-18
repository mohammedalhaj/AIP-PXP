Scenario: TC-087 -Staff Home Page-Verify the functionality of "Configuration Tasks" link - Staff Administrator

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The Staff_Administrator should be Staff Administrator
And I click on Configuration_Tasks
Then The Configuration_Tasks_Header should be Configuration Tasks
