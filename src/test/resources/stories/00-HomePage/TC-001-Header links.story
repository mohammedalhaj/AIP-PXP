Scenario: TC-001 - Verify Header links section

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
Then The About_Journal should be About the Journal
And The Preparing_Manuscript should be Preparing Your Manuscript
And The Contact_Office should be Contact Editorial Office