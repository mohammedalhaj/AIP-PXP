Scenario:  TC-013 - Staff - Manage Accounts -  Add Person

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on Staff_Manage_Accounts
And I click on Add_Person_link
And I click on Add_person_Title
And I Fill User to : Add_person_firstname
And I Fill Test to : Add_person_lastname
And I Enter Test@NewTest.com to : Add_person_Email Email
And Fill Street Address to : Street_Address
And Fill Test to : Add_person_City
And Fill state to : Add_person_reg_state
And Fill 12312 to : Add_person_reg_zipcode
And I click on Add_person_reg_country
And Fill 0123456789 to : Add_person_reg_telephone
And I Fill NewTest to : Add_person_login 
And Fill Test@123 to : Add_person_password
And Fill Test@123 to : Add_person_password2
And I click on Add_Person_btn
Then Person should be added
