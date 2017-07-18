Scenario: TC-018 - Staff - Chase Reviewers - Change Next Chase Date

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on Staff_Chasers
And I click on Chase_Reviewers
And I click on Chaser_Name
And I click on Change_Next_Chase_Date
And I click on Update_Date
Then The Update_Date_Message should be Next chase date(s) were modified.