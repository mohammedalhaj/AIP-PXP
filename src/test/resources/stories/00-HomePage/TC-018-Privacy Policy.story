Scenario: TC-004 - Verify the "Privacy Policy" footer link function

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Privacy_Policy
And I switch tabs
Then The Privacy_Policy_Page should be Peer X-Press Privacy Policy