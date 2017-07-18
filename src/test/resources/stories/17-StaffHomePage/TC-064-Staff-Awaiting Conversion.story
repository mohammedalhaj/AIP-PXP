Scenario: TC-064 -Staff Home Page-Verify the "Awaiting Conversion" folder

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The StaffTask should be Staff Tasks
And I click on StaffTask_Awaiting_Conversion
Then The Awaiting_Conversion_Header should be  Awaiting Conversion 