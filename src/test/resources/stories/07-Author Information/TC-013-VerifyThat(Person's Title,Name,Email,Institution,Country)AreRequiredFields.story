Scenario: TC-013-Verify that "Person's Title,Name,Email,Institution,Country,Contributing Author's Agreement" are required fields

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I click on Next
And I click on Next
And The Author_Information should display
And The Author_Information should be Author Information
And I click on Add_Author_Btn
And Fill z to : Authors2_LName
And I click on Next
And I click on Previous
Then The Authors2_PersonTitle_ErrorMsg should be Person Title response is required.
And The Authors2_Name_ErrorMsg should be First and Last Names are required.
And The Authors2_Email_ErrorMsg should be A valid Email response is required.
And The Authors2_Institution_ErrorMsg should be Institution response is required.
And The Authors2_Country_ErrorMsg should be Country response is required.
And The ContributingAuthorAgreement_ErrorMsg should be Contributing Author Agreement response is required.





