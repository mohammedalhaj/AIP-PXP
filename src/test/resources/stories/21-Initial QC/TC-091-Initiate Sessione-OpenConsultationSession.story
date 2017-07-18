Scenario: TC-091-Initiate Sessione-Open Consultation Session

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on  Initial_QC
And I click the initial QC Manuscript
And I click on Consultation_Session
And I click on Consultation_Staff
And I click on participants
And I click on Add_to_List
And I click on Initiate_Session_btn
Then The Title_Message should be Consultation session has been initiated.
