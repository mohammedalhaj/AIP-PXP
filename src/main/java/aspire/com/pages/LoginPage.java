package aspire.com.pages;

import java.io.IOException;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import jo.aspire.automation.logger.EnvirommentManager;

public class LoginPage extends StepsPage {

	public LoginPage(WebDriverProvider webDriverProvider) {
		super(webDriverProvider);
	}

	public static String siteHost;
	public static String UserName;
	public static String PassWord;

	public void logUserOut() throws IOException {
		getDriverProvider().get().manage().deleteAllCookies();

	}

	public void go() throws IOException {

		get(siteHost);
		// getDriverProvider().get().manage().timeouts().pageLoadTimeout(20,
		// TimeUnit.SECONDS);
		getDriverProvider().get().manage().window().maximize();

	}

	public void GoFor(String ContentURLVariable) throws IOException {
		String URL = EnvirommentManager.getInstance().getProperty(ContentURLVariable);
		get(URL);
		//navigate().to(URL);
		getDriverProvider().get().manage().window().maximize();

	}

	public void Login(String username, String password) throws IOException {
		username = EnvirommentManager.getInstance().getProperty(username);
		password = EnvirommentManager.getInstance().getProperty(password);
		waitPresenceOfElement("Login_user");
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Login_user"))).sendKeys(username);
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Password_user"))).sendKeys(password);
		clickOnElement("submit_login");
		try {
			WaitDOMToBeReady();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
