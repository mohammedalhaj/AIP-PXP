Scenario: TC-065 -Staff Home Page-Verify the "Awaiting Author Approval" folder

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The StaffTask should be Staff Tasks
And I click on StaffTask_Awaiting_Author_Approval
Then The Awaiting_Author_Approval_Header should be Awaiting Author Approval 