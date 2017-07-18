Scenario: TC-007 - Verify clicking on Help/Feedback tab

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Feedback_tab
And I switch tabs
Then The Feedback_Page should display