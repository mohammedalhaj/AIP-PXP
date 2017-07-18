Scenario:  TC-007 - Merge Person

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on Find_Person
And Fill Doyle to : Person_Last_name
And I click on Merge_Person_btn
And I switch tabs
And I Merge Person
Then The Mearge_Title should be Merged