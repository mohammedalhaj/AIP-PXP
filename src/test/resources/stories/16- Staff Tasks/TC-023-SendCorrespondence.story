Scenario: TC-023 - Staff - Chase Reviewers - Send Manuscript Correspondence

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on Staff_Chasers
And I click on Chase_Reviewers
And I click on Chaser_Name
And I click on Chaser_Send_Manuscript_Correspondence
And I switch tabs
And I click on recip_staff
And I click on Send_Return_home
Then The Title_Msg should be 1 Email sent.