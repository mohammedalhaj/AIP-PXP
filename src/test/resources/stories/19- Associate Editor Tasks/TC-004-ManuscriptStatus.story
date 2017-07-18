Scenario:  TC-004 - Check Manuscript Status

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on Check_Manuscript_Status
And Fill Drying with no Concentration Gradient in Large Microfluidic Droplets to : Manuscript_title_Search
And I click on Search
And I click on MS_Num
And I switch tabs
Then The Manuscript_Items should display