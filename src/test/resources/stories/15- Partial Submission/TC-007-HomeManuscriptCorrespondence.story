Scenario:  TC-007- Send and return home Manuscript Correspondence.story

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Pending_Manuscript
And I click on Send_Manuscript_Correspondence
And I click on Send_Return_home
Then The Email_Message should be 1 Email sent.

                                 
