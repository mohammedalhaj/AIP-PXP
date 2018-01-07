package com.aspire.pxp.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "author", url = "${pages.login.url}")
public interface Author {

	@CssSelector("${pages.author.emailLookup}")
	public AspireWebElement emailLookup();

	@CssSelector("${pages.author.corrAuthor}")
	public AspireWebElement corrAuthor();

	@CssSelector("${pages.author.contributingAuthorsAgreement}")
	public AspireWebElement contributingAuthorsAgreement();

	@CssSelector("${pages.author.addAuthorBtn}")
	public AspireWebElement addAuthorBtn();

	@CssSelector("${pages.author.searchBtn}")
	public AspireWebElement searchBtn();

	@CssSelector("${pages.author.iAgreeCheckbox}")
	public AspireWebElement iAgreeCheckbox();

	@CssSelector("${pages.author.emailLookupTestBox}")
	public AspireWebElement emailLookupTestBox();

	@CssSelector("${pages.author.searchEmailLookupResults}")
	public AspireWebElement searchEmailLookupResults();

	@CssSelector("${pages.author.authorsTitle}")
	public AspireWebElement authorsTitle();

	@CssSelector("${pages.author.authorsFName}")
	public AspireWebElement authorsFName();

	@CssSelector("${pages.author.authorsMName}")
	public AspireWebElement authorsMName();

	@CssSelector("${pages.author.authorsLName}")
	public AspireWebElement authorsLName();

	@CssSelector("${pages.author.findAuthor}")
	public AspireWebElement findAuthor();

	@CssSelector("${pages.author.authorsEmail}")
	public AspireWebElement authorsEmail();

	@CssSelector("${pages.author.authorsInstitution}")
	public AspireWebElement authorsInstitution();

	@CssSelector("${pages.author.authorsDepartment}")
	public AspireWebElement authorsDepartment();

	@CssSelector("${pages.author.authorsAddressLine1}")
	public AspireWebElement authorsAddressLine1();

	@CssSelector("${pages.author.authorsAddressLine2}")
	public AspireWebElement authorsAddressLine2();

	@CssSelector("${pages.author.authorsCity}")
	public AspireWebElement authorsCity();

	@CssSelector("${pages.author.authorsZipCode}")
	public AspireWebElement authorsZipCode();

	@CssSelector("${pages.author.authorsState}")
	public AspireWebElement authorsState();

	@CssSelector("${pages.author.authorsCountry}")
	public AspireWebElement authorsCountry();

	@CssSelector("${pages.author.authorsWorkPhone}")
	public AspireWebElement authorsWorkPhone();
	
	/* Submit MS */

	@CssSelector("${pages.author.submitManuscript}")
	public AspireWebElement submitManuscript();

	@CssSelector("${pages.author.submitManuscripPage}")
	public AspireWebElement submitManuscripPage();

	@CssSelector("${pages.author.submitNewManuscriptButton}")
	public AspireWebElement submitNewManuscriptButton();

	@CssSelector("${pages.author.submitNewManuscript}")
	public AspireWebElement submitNewManuscript();

	@CssSelector("${pages.author.article}")
	public AspireWebElement article();

	@CssSelector("${pages.author.commentResponse}")
	public AspireWebElement commentResponse();

	@CssSelector("${pages.author.erratum}")
	public AspireWebElement erratum();

	@CssSelector("${pages.author.typeContinue}")
	public AspireWebElement typeContinue();

	@CssSelector("${pages.author.modifyUnavailabilityDates}")
	public AspireWebElement modifyUnavailabilityDates();

	@CssSelector("${pages.author.monthsTable}")
	public AspireWebElement monthsTable();

	@CssSelector("${pages.author.examplesMessage}")
	public AspireWebElement examplesMessage();

	@CssSelector("${pages.author.returnHomeBtn}")
	public AspireWebElement returnHomeBtn();

	@CssSelector("${pages.author.submitDates}")
	public AspireWebElement submitDates();

	@CssSelector("${pages.author.october}")
	public AspireWebElement october();

	@CssSelector("${pages.author.changeDates}")
	public AspireWebElement changeDates();

	@CssSelector("${pages.author.errorMessage}")
	public AspireWebElement errorMessage();

	@CssSelector("${pages.author.homePage}")
	public AspireWebElement homePage();

	@CssSelector("${pages.author.recordedMessage}")
	public AspireWebElement recordedMessage();

	@CssSelector("${pages.author.updateContactInformation}")
	public AspireWebElement updateContactInformation();

	@CssSelector("${pages.author.profileMessage}")
	public AspireWebElement profileMessage();

	@CssSelector("${pages.author.infoFields}")
	public AspireWebElement infoFields();

	@CssSelector("${pages.author.passwordMessage}")
	public AspireWebElement passwordMessage();

	@CssSelector("${pages.author.cancel}")
	public AspireWebElement cancel();

	@CssSelector("${pages.author.modifyProfile}")
	public AspireWebElement modifyProfile();

	@CssSelector("${pages.author.november}")
	public AspireWebElement november();

	@CssSelector("${pages.author.authorsTasks}")
	public AspireWebElement authorsTasks();

	@CssSelector("${pages.author.emailAdd}")
	public AspireWebElement emailAdd();

	@CssSelector("${pages.author.modificationMessage}")
	public AspireWebElement modificationMessage();

	@CssSelector("${pages.author.newPassword1}")
	public AspireWebElement newPassword1();

	@CssSelector("${pages.author.sorryMessage}")
	public AspireWebElement sorryMessage();

	@CssSelector("${pages.author.next}")
	public AspireWebElement next();
	
	@CssSelector("${pages.author.browse}")
	public AspireWebElement browse();
	
	@CssSelector("${pages.author.upload_Files}")
	public AspireWebElement upload_Files();
	
	// -------------------------Author Information
	// -----------------------------------

	@CssSelector("${pages.author.authorInformation}")
	public AspireWebElement authorInformation();

	@CssSelector("${pages.author.search_Find_Author_Results}")
	public AspireWebElement search_Find_Author_Results();

	@CssSelector("${pages.author.authors2_FName}")
	public AspireWebElement authors_FName();

	@CssSelector("${pages.author.authors2_MName}")
	public AspireWebElement authors_MName();

	@CssSelector("${pages.author.authors2_LName}")
	public AspireWebElement authors_LName();

	@CssSelector("${pages.author.authors2_Email}")
	public AspireWebElement authors_Email();

	@CssSelector("${pages.author.authors2_Institution}")
	public AspireWebElement authors_Institution();

	@CssSelector("${pages.author.authors2_Department}")
	public AspireWebElement authors_Department();

	@CssSelector("${pages.author.authors2_AddressLine_1}")
	public AspireWebElement authors_AddressLine_1();

	@CssSelector("${pages.author.authors2_AddressLine_2}")
	public AspireWebElement authors_AddressLine_2();

	@CssSelector("${pages.author.authors2_City}")
	public AspireWebElement authors_City();

	@CssSelector("${pages.author.authors2_State}")
	public AspireWebElement authors_State();

	@CssSelector("${pages.author.authors2_ZipCode}")
	public AspireWebElement authors_ZipCode();

	@CssSelector("${pages.author.authors2_WorkPhone}")
	public AspireWebElement authors2_WorkPhone();

	@CssSelector("${pages.author.dr}")
	public AspireWebElement dr();

	@CssSelector("${pages.author.mr}")
	public AspireWebElement mr();

	@CssSelector("${pages.author.ms}")
	public AspireWebElement ms();

	@CssSelector("${pages.author.mrs}")
	public AspireWebElement mrs();

	@CssSelector("${pages.author.miss}")
	public AspireWebElement miss();

	@CssSelector("${pages.author.prof}")
	public AspireWebElement prof();

	@CssSelector("${pages.author.prof_Dr}")
	public AspireWebElement prof_Dr();

	@CssSelector("${pages.author.authors2_Country_ErrorMsg}")
	public AspireWebElement authors2_Country_ErrorMsg();

	@CssSelector("${pages.author.authors2_PersonTitle_ErrorMsg}")
	public AspireWebElement authors2_PersonTitle_ErrorMsg();

	@CssSelector("${pages.author.authors2_Name_ErrorMsg}")
	public AspireWebElement authors2_Name_ErrorMsg();

	@CssSelector("${pages.author.authors2_Email_ErrorMsg}")
	public AspireWebElement authors2_Email_ErrorMsg();

	@CssSelector("${pages.author.authors2_Institution_ErrorMsg}")
	public AspireWebElement authors2_Institution_ErrorMsg();

	@CssSelector("${pages.author.contributingAuthorAgreement_ErrorMsg}")
	public AspireWebElement contributingAuthorAgreement_ErrorMsg();

	@CssSelector("${pages.author.orcid_Link}")
	public AspireWebElement orcid_Link();

	@CssSelector("${pages.author.orcid_LOGO}")
	public AspireWebElement orcid_LOGO();

	@CssSelector("${pages.author.authors_Remove_Btn}")
	public AspireWebElement authors_Remove_Btn();

	@CssSelector("${pages.author.none_Assigned_Msg}")
	public AspireWebElement none_Assigned_Msg();

	@CssSelector("${pages.author.authors2_Email}")
	public AspireWebElement authors2_Email();

	@CssSelector("${pages.author.us_option}")
	public AspireWebElement us_option();

	@CssSelector("${pages.author.authors2_Institution}")
	public AspireWebElement authors2_Institution();

	@CssSelector("${pages.author.Authors2_SaveHide_btn}")
	public AspireWebElement authors2_SaveHide_btn();

	@CssSelector("${pages.author.second_Author}")
	public AspireWebElement second_Author();

	@CssSelector("${pages.author.contributing_Author_Agreement}")
	public AspireWebElement contributing_Author_Agreement();

	@CssSelector("${pages.author.no_Matches_Found_Msg}")
	public AspireWebElement no_Matches_Found_Msg();

	@CssSelector("${pages.author.authors1_Clear_btn}")
	public AspireWebElement authors1_Clear_btn();

	@CssSelector("${pages.author.author_Country_Option}")
	public AspireWebElement author_Country_Option();
	
	@CssSelector("${pages.author.previous}")
	public AspireWebElement previous();
	
	// -------------------------------------------------------------------------------
	
	
	/* ############## Manuscript Classification ###### */
	@CssSelector("${pages.author.author_Information_Tab}")
	public AspireWebElement author_Information_Tab();

	@CssSelector("${pages.author.ms_Classification_Title}")
	public AspireWebElement ms_Classification_Title();

	@CssSelector("${pages.author.ms_Classification_Tab}")
	public AspireWebElement ms_Classification_Tab();

	@CssSelector("${pages.author.classification_Message}")
	public AspireWebElement classification_Message();
	
	@CssSelector("${pages.author.subject_Area}")
	public AspireWebElement subject_Area();
	
	@CssSelector("${pages.author.asterisk}")
	public AspireWebElement asterisk();

	@CssSelector("${pages.author.wrong_tick}")
	public AspireWebElement wrong_tick();

	@CssSelector("${pages.author.classification_Error}")
	public AspireWebElement classification_Error();

	@CssSelector("${pages.author.additional_Keywords}")
	public AspireWebElement additional_Keywords();
	
	@CssSelector("${pages.author.asterisk_keywords}")
	public AspireWebElement asterisk_keywords();
	
	@CssSelector("${pages.author.keywords_Error}")
	public AspireWebElement keywords_Error();
	
	@CssSelector("${pages.author.publishing_Permissions_Title}")
	public AspireWebElement publishing_Permissions_Title();
	
	@CssSelector("${pages.author.author_Information_Title}")
	public AspireWebElement author_Information_Title();
	
}