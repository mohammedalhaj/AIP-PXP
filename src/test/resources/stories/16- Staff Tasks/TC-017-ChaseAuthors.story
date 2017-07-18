Scenario: TC-017 - Staff - Chase Authors

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on Staff_Chasers
And I click on Chase_Authors
And I click on Chaser_Authors_Name
And I select Send All Emails
Then The Title_Msg should be Chasers Sent.