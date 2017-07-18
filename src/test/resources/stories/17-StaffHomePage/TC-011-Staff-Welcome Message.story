Scenario: TC-011 -Staff Home Page- Verify the homepage welcome text

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
Then The Staff_Aip_Login_message should display