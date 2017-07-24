package aspire.com.steps;

import java.io.IOException;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


import aspire.com.pages.PageFactory;
import aspire.com.pages.LoginPage;

public class LoginPageSteps extends BaseSteps {

	
		public LoginPageSteps(){
			super();
		}
	public LoginPageSteps(PageFactory pageFactory) {
		super(pageFactory);
	}
	
	
	@Given("I am on login page")
	public void LoginPage() throws IOException {
	   //Login.go();
		getLoginPage().GoFor("Login");
	}
	
	
	@When("I enter $username username and $password password")
	public void FillUsernameAndPassword(@Named("username") String username,
		@Named("password") String password) throws IOException {
		getLoginPage().Login(username, password);

	}
	
	
	
}
