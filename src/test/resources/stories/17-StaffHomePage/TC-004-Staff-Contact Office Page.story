Scenario: TC-004 -Staff Home Page- Verify Contact Office Page

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on Contact_Office
And I switch tabs
Then The Contact_Office_Page should display