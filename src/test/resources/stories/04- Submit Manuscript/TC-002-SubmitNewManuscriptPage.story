Scenario: TC-002 - Submit new manuscript page

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
Then The Submit_New_Manuscript should be New Manuscript Submission to Applied Physics Letters
And The Article should display
And The Comment/Response should display
And The Erratum should display
And The Type_Continue should display
