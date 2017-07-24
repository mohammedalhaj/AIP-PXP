package aspire.com.steps;

import java.io.IOException;

import org.jbehave.core.annotations.*;

import aspire.com.pages.*;

public class BlogSteps extends BaseSteps {

	public BlogSteps() {
		super();
	}

	public BlogSteps(PageFactory pageFactory) {
		super(pageFactory);
	}

	@When("close subscribe popup")
	@Then("close subscribe popup")
	public void clickOnElement() {
		try {
			getBlogPage().clickOnElement("subscribeXbutton");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@When("I enter invalid email address")
	public void enterInvalidEmail() {
		getBlogPage().enterInvalidEmail();
	}
}
