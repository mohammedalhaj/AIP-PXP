Scenario: TC-020 - Staff - Chase Reviewers - Assign Additional Potential Reviewers

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on Staff_Chasers
And I click on Chase_Reviewers
And I click on Chaser_Name
And I click on Assign_Additional_Potential_Reviewers
And I click on Done
Then The Chaser_Msg should be assigned
