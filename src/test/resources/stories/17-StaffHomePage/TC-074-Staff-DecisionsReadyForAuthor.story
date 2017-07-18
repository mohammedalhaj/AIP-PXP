Scenario: TC-074 -Staff Home Page-Verify the " Decisions Ready for Author" folder  - staff Tasks

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And The StaffTask should be Staff Tasks
And I click on Decisions_Ready_for_Author
Then The Decisions_Ready_for_Author_Header should be  Decisions Ready for Author