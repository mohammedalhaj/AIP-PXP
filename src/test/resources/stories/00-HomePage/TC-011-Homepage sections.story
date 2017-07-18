Scenario: TC-011 - Verify the homepage sections 

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And The Author's_Tasks should be Author Tasks
Then The General_Tasks should be General Tasks