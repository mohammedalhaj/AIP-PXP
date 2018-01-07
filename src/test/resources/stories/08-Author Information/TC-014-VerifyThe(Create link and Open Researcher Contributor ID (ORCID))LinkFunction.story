Scenario: TC-014- Author Information-Verify the "Create/link and Open Researcher Contributor ID (ORCID)" link function

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
And [1111-1000] ORCID_Link should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1080] ORCID_LOGO should be displayed, Within 20 seconds





