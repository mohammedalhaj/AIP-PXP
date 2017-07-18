Scenario: TC-002 -Staff Home Page- Verify About Journal Page

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on About_Journal
And I switch tabs
Then The About_Journal_Page should be Overview