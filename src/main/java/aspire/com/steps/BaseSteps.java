package aspire.com.steps;

import aspire.com.pages.StepsPage;
import jo.aspire.generic.SoftAssert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import aspire.com.pages.BlogPage;
import aspire.com.pages.EventsPage;
import aspire.com.pages.GenericPage;
import aspire.com.pages.PageFactory;
import aspire.com.pages.SearchPage;
import aspire.com.pages.AuthorPage;
import aspire.com.pages.EditorPage;
import aspire.com.pages.StaffPage;
import aspire.com.pages.LoginPage;

@ContextConfiguration(
// "classpath:/aspire/com/steps/cucumber.xml"
"file:cucumber.xml")
public class BaseSteps {

	@Autowired
	PageFactory pageFactory = null;
	private StepsPage steps;
	private GenericPage genericSteps;
	private EventsPage eventPage;
	private SearchPage searchPage;
	private BlogPage blogPage;
	private LoginPage loginPage;
	private AuthorPage authorPage;
	private EditorPage editorPage;
	private StaffPage staffPage;
	
	public BaseSteps() {

	}

	public BaseSteps(PageFactory pageFactory) {
		this.pageFactory = pageFactory;

	}

	public StepsPage getStepsPage() {
		if (steps == null) {
			steps = pageFactory.newSteps();
		}
		return steps;

	}

	public GenericPage getGenericPage() {
		if (genericSteps == null) {
			genericSteps = pageFactory.genericPage();
		}
		return genericSteps;

	}

	public EventsPage getEventPage() {
		if (eventPage == null) {
			eventPage = pageFactory.eventPage();
		}
		return eventPage;

	}

	public SearchPage getSearchPage() {
		if (searchPage == null) {
			searchPage = pageFactory.SearchPage();
		}
		return searchPage;

	}

	public BlogPage getBlogPage() {
		if (blogPage == null) {
			blogPage = pageFactory.blogPage();
		}
		return blogPage;

	}
	
	public LoginPage getLoginPage()
	{
		if(loginPage == null){
			loginPage = pageFactory.newLoginPage();
		}
		return loginPage;
		
	}
	
	public AuthorPage getAuthorPage()
	{
		if(authorPage == null){
			authorPage = pageFactory.newAuthorPage();
		}
		return authorPage;
		
	}
	
	public EditorPage getEditorPage()
	{
		if(editorPage == null){
			editorPage = pageFactory.newEditorPage();
		}
		return editorPage;
		
	}
	
	public StaffPage getStaffPage()
	{
		if(staffPage == null){
			staffPage = pageFactory.newStaffPage();
		}
		return staffPage;
		
	}

}
