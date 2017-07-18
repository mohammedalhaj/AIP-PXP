Scenario: TC-000-Verify the existence of "Initial QC" Folder Page contents.

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on Initial_QC
Then Initial QC content should appear
