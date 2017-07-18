Scenario:  TC-007- Message unde E-mail tab

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on  Initial_QC
And I click the initial QC Manuscript
And I click on Email_Tab
And I click on Message_Email
And I switch tabs
Then The Close_Window should display
And The Print_Email should display
