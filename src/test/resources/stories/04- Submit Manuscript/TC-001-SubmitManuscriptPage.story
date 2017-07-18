Scenario: TC-001-Submit Manuscript page

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Submit_Manuscript
And I accept Dialog
Then The Submit_Manuscrip_Page should display