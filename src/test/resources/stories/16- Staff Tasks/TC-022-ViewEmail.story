Scenario: TC-022 - Staff - Chase Reviewers - View E-mail

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on Staff_Chasers
And I click on Chase_Reviewers
And I click on Chaser_Name
And I click on View_E-mail
And I switch tabs
Then The Continue should display
