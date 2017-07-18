Scenario: TC-016-Staff - Chase Associate Editor

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on Staff_Chasers
And I click on Chase_Associate_Editor
And I click on Chaser_Name
And I click on Send_btn
Then The Chaser_Msg should be Chaser Sent.