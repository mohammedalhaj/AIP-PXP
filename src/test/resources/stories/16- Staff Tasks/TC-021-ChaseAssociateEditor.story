Scenario: TC-021 - Staff - Chase Reviewers - Chase Associate Editor

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on Staff_Chasers
And I click on Chase_Reviewers
And I click on Chaser_Name
And I click on Chase_Associate_Editor_link
And I click on Send_btn
Then The Chaser_Msg should be Associate Editor chaser sent.

