Scenario: TC-008 - Home-Verify clicking on Return to Main Page tab

Given [1000-9000] User opens Login page
When [1100-1340] User fills User Name with `Valid User Name`
And [1100-1340] User fills Password with `Valid Password`
And [1111-1000] Login Button should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Return Main Page should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1080] Aip Login Message should be displayed, Within 20 seconds