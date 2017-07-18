Scenario: TC-019 - Staff - Chase Reviewers - Extend Review Durations

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on Staff_Chasers
And I click on Chase_Reviewers
And I click on Chaser_Name
And I click on Extend_Review_Durations
And I click on Update_Review_Duration
Then The Chaser_Msg should be Duration updated.

