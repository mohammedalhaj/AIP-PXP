Scenario:  TC-010 - Add Person - Reset

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on Find_Person
And I click on Add_Person_btn
And I switch tabs
And I click on Add_person_Title
And Fill User to : Add_person_firstname
And I Fill T to : Add_person_lastname
And I click on Reset
Then Information page for Add_person_firstname should be empty
