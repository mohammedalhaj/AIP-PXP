Scenario: TC-085 -Staff Home Page-Verify the functionality of "Submit Manuscript" link

Given I am on login page
When I enter staff_User_Name username and Valid_Password password
And I click on AuthorTasks_Submit_Manuscript
Then The Submit_Manuscrip_Page should be New Manuscript Submission