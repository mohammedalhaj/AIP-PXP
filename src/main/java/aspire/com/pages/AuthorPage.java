package aspire.com.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import jo.aspire.automation.logger.EnvirommentManager;

public class AuthorPage extends StepsPage {

	public AuthorPage(WebDriverProvider webDriverProvider) {
		super(webDriverProvider);
	}

	public void acceptDialog() throws AWTException {

		//SleepTime(1000);
		try {
			acceptTheDialog();
		} catch (Exception e) {

		}
	}

	public void completeUploading() throws IOException {
		try {
			WaitDOMToBeReady();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		waitPresenceOfElement("Validate_arrow");
		waitUntil("Validate_arrow");
		try {
			findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("Validate_PDF"))).click();
			browserTabs = new ArrayList<String>(getWindowHandles());
			switchTo().window(browserTabs.get(0));
			clickOnAnElement("Validate_Checkbox");
		} catch (Exception e) {
			findElement(By.cssSelector("#reviewfiles_approve_file_link_0 img:nth-child(2)")).click();
			browserTabs = new ArrayList<String>(getWindowHandles());
			switchTo().window(browserTabs.get(0));
			clickOnAnElement("Validate_Checkbox");
		}

	}

	public void CheckPartialSubmissionAndDelete() throws IOException, AWTException {
	
		int count = 0;
		List<WebElement> links = findElements(
				By.cssSelector(EnvirommentManager.getInstance().getProperty("PartialSubmissionList")));
		for (int i = 3; i < links.size()-4; i++) {
			links.get(i).click();
			try {
				WaitDOMToBeReady();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
					if (VerifyTheVisibiltyOfContentSimple("Delete_Partial_Submission")) {
						clickOnAnElement("Delete_Partial_Submission");
						try {
							acceptDialog();
						} catch (Exception e) {
							e.printStackTrace();
						}
						i = i - 1;
						count++;
						
						System.err.println(count + " : pending Manuscript deleted");
					} else {
						navigate().back();
					}

				 
			
			try {
				WaitDOMToBeReady();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			links = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("PartialSubmissionList")));
		}
	}
	

}
