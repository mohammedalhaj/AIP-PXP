Scenario:  TC-001 - Modify Unavailability Dates Page

Given I am on login page
When I enter Valid_User_Name username and Valid_Password password
And I click on Modify_Unavailability_Dates
Then The Months_Table should display
And The Examples_Message should be Please separate days with a comma and use a dash ( - ) for a range
And The Return_Home_btn should display
And The Submit_Dates should display

