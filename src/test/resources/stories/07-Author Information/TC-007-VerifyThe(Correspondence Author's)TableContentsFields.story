Scenario: TC-007-Verify The (Correspondence Author's) Table Contents Fields

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
Then Fill Automation to : Authors_FName
And Fill PXP to : Authors_MName
And Fill Test to : Authors_LName
And Fill test@test.com to : Authors_Email
And Fill Institution to : Authors_Institution
And Fill Department to : Authors_Department
And Fill AddressLine1 to : Authors_AddressLine_1
And Fill AddressLine2 to : Authors_AddressLine_2
And Fill City to : Authors_City
And Fill State to : Authors_State
And Fill ZipCode to : Authors_ZipCode
And Fill WorkPhone to : Authors_WorkPhone




