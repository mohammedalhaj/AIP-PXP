Scenario: TC-005- Forward Email

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on  Initial_QC
And I click the initial QC Manuscript
And I click on Email_Tab
And I click on Forward_Email
And Fill Test@test.com to : To_field
And I click on Send_Email_btn
Then The Title_Message should be The Email has been forwarded!
