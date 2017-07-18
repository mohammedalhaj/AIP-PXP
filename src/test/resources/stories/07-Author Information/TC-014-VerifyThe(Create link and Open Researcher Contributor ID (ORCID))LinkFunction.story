Scenario: TC-014-Verify the "Create/link and Open Researcher Contributor ID (ORCID)" link function

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
And I click on ORCID_Link
Then The ORCID_LOGO should display





