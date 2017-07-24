package aspire.com.pages;

import java.io.IOException;

import org.jbehave.web.selenium.WebDriverProvider;

import aspire.com.steps.Selectors;

/**
 * Page object defining the home page
 */
public class SearchPage extends GenericPage {
	public SearchPage(WebDriverProvider driverProvider) {
		super(driverProvider);

	}

	public boolean searchFunctionality() {
		waitUntilElementVisible(Selectors.getElement("searchBox"), 5);
		findElement(Selectors.getElement("searchBox")).sendKeys(Selectors.getProperty("valid_text"));
		try {
			clickOnElement("searchButton");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		waitUntilElementVisible(Selectors.getElement("results"), 5);
		boolean isFunctional = false;
		isFunctional = verifyElementDisplaysWithText("titleOfSearchResults",
				"Search results for: " + Selectors.getProperty("valid_text"))
				&& findElements(Selectors.getElement("results")).size() >= 1;
		return isFunctional;
	}

}
