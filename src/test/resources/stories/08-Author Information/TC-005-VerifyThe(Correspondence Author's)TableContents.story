Scenario: TC-005- Author Information-"Verify the "Correspondence Author's" table contents

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
And [1101-0140] Text should contain Author Information
And [1111-1080] Corr Author should be displayed, Within 20 seconds
And [1111-1080] Authors Title should be displayed, Within 20 seconds
And [1111-1080] Authors FName should be displayed, Within 20 seconds
And [1111-1080] Authors MName should be displayed, Within 20 seconds
And [1111-1080] Authors LName should be displayed, Within 20 seconds
And [1111-1080] Find Author should be displayed, Within 20 seconds
And [1111-1080] Authors Email should be displayed, Within 20 seconds
And [1111-1080] Authors Institution should be displayed, Within 20 seconds
And [1111-1080] Authors Department should be displayed, Within 20 seconds
And [1111-1080] Authors AddressLine1 should be displayed, Within 20 seconds
And [1111-1080] Authors AddressLine2 should be displayed, Within 20 seconds
And [1111-1080] Authors City should be displayed, Within 20 seconds
And [1111-1080] Authors State should be displayed, Within 20 seconds
And [1111-1080] Authors ZipCode should be displayed, Within 20 seconds
And [1111-1080] Authors Country should be displayed, Within 20 seconds
And [1111-1080] Authors WorkPhone should be displayed, Within 20 seconds
