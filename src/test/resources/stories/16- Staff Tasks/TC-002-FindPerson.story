Scenario: TC-002-Staff - Find Person

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on Staff_Find_Person
And Fill Doyle to : Person_Last_name
And I click on Find_Person_btn
And I switch tabs
Then The Person_Search_Results should be Person Search Results