Scenario: TC-076 -Staff Home Page-Verify the "Consult on Manuscript" folder  - Staff Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The StaffTask should be Staff Tasks
And I click on StaffTask_Consult_on_Manuscript
Then The Consult_on_Manuscript_Header should be Consult on Manuscript