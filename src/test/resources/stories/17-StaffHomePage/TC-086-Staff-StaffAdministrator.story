Scenario: TC-086 -Staff Home Page-Verify the existence of "Staff Administrator" section

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
Then The Staff_Administrator should be Staff Administrator