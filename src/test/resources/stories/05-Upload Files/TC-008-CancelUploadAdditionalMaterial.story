Scenario: TC-008-Verify clicking on cancel button on "Title , Description" fields of "Additional Material for Reviewer" file type
 
Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I upload Test.docx to : Browse
And I click on Upload_Files
And I select Type of Additional_Material
And Fill Additional Material File to : File_title_Text
And Fill Additional Material File to : File_Des_Text
Then I click on Cancel_After_upload


