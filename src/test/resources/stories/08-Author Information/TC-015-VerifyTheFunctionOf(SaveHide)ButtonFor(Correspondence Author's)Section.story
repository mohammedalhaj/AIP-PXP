Scenario: TC-015- Author Information-Verify the function of "Save/Hide" button for "Correspondence Author's" section.

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
And [1111-1000] Authors_SaveHide_btn should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1101-1090] Authors Title should be disabled
And [1101-1090] Authors Email should be disabled
And [1101-1090] Authors FName should be disabled
And [1101-1090] Authors MName should be disabled
And [1101-1090] Authors LName should be disabled
And [1101-1090] Authors Institution should be disabled
And [1101-1090] Authors Department should be disabled
And [1101-1090] Authors AddressLine_1 should be disabled
And [1101-1090] Authors AddressLine_2 should be disabled
And [1101-1090] Authors City should be disabled
And [1101-1090] Authors State should be disabled
And [1101-1090] Authors ZipCode should be disabled
And [1101-1090] Authors Country should be disabled
And [1101-1090] Authors WorkPhone should be disabled


