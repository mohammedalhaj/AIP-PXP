Scenario: TC-009 -Staff Home Page- Verify Clicking on the logo banner

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on logo_banner
And I switch tabs
Then The scitation_home_page should be Applied Physics Letters