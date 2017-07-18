Scenario:  TC-012 - Staff - Clear Form

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on Staff_Find_Person
And I click on Add_Person_btn
And Fill Doyle to : Person_Last_name
And I click on Clear_Form_btn
Then Information page for Person_Last_name should be empty