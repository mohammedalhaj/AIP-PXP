Scenario: TC-003 - Home-Verify Preparing Manuscript Page

Given [1000-9000] User opens Login page
When [1100-1340] User fills User Name with `Valid User Name`
And [1100-1340] User fills Password with `Valid Password`
And [1111-1000] Login Button should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Preparing Manuscript should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1000-4000] User switchs to tab 1
Then [1111-1080] Preparing Manuscript Page should be displayed, Within 20 seconds
And [1101-0140] Text should contain Preparing Your Manuscript