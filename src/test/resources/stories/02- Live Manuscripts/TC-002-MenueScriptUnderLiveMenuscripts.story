Scenario:  TC-002-Verify MenueScript under the Live Menuscripts

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Live_Manuscripts
And I click on First_Live_Manuscripts
Then The Manuscript_num should display