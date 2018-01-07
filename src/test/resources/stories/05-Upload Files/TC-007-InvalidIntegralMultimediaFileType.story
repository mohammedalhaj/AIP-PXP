Scenario: TC-007- Upload file-Verify clicking on cancel button related "Associated Figure Number , Description" fields
 
Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
And I click on Submit_New_Manuscript_button
And I click on Article
And I click on Type_Continue
And I upload Test.docx to : Browse
And I click on Upload_Files
And I select Type of Integral_Multimedia
And Fill Integral Multimedia File to : File_title_Text
And Fill Integral Multimedia File to : File_Des_Text
Then I click on Save
Then The Invalid_Format_msg should be Invalid file format



