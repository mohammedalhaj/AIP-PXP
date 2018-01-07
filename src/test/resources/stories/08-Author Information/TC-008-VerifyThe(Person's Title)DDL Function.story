Scenario: TC-008- Author Information-Verify the "Person's Title" DDL function

Given [1000-9000] User opens Login page
When [1100-1340] User fills User Name with `Valid User Name`
And [1100-1340] User fills Password with `Valid Password`
And [1111-1000] Login Button should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Submit Manuscript should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1000-2000] Accept Alert
And [1111-1000] Submit New Manuscript Button should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Article should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Type Continue should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Next should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Next should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1080] Author Information should be displayed, Within 20 seconds
And [1111-1000] Dr should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Mr should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Ms should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Mrs should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Miss should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Prof should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Prof_Dr should be clickable, Within 20 seconds
And [1100-0300] User click on it





