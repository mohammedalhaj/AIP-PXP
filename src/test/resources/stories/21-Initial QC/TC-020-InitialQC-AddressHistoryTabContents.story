Scenario: TC-020 -Initial QC-Verify the existence of "Address history" tab contents of "Signed in User name" page

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on  Initial_QC
And I click the initial QC Manuscript
And I click on QC_HeaderTableUserName
And I switch tabs
And I click on Address_History
Then The Address_HistoryTable should display