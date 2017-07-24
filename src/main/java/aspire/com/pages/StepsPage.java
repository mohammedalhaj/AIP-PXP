package aspire.com.pages;


import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.glass.events.KeyEvent;

import jo.aspire.automation.logger.EnvirommentManager;
import jo.aspire.web.automationUtil.BrowserAlertHelper;




import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Page object defining the home page
 */
public class StepsPage extends FluentWebDriverPage {

	public StepsPage(WebDriverProvider driverProvider) {
		super(driverProvider);

		// TODO Auto-generated constructor stub
	}

	ArrayList<String> theList = new ArrayList<String>();
	List<String> browserTabs;

	public WebElement getFirstVisible(WebElement element, String by) {

		Iterator<WebElement> listItems;
		if (element == null) {
			listItems = findElements(By.cssSelector(by)).iterator();
		} else {
			listItems = element.findElements(By.cssSelector(by)).iterator();
		}

		while (listItems.hasNext()) {
			WebElement item = listItems.next();
			if (item.isDisplayed()) {
				return item;
			}
		}
		return null;
	}

	// Afnan
	public void scrollToElement(String element) throws IOException {
		waitPresenceOfElement(element);
		WebDriver driver = getDriverProvider().get();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))));
	}

	public void scrollToElementAndStop(String element) throws IOException {
		WebDriver driver = getDriverProvider().get();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",
				driver.findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))));
	}

	public void waitAnimationToDone() {
		WebDriver driver = getDriverProvider().get();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		// WaitPageToLoad();
		while (!(Boolean) (executor.executeScript("return $(\":animated\").length == 0;"))) {
			System.out.println("   wait animation to done");
			SleepTime(4000);
		}
	}

	public void wait(String element) throws IOException {
		WebDriverWait wait = new WebDriverWait(getDriverProvider().get(), 60);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))));

	}

	public void waitUntil(String element) throws IOException {
		WebDriverWait wait = new WebDriverWait(getDriverProvider().get(), 800);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))));

	}

	public void waitAttributeToChange(String element, String attribute, String value) throws IOException {
		WebDriverWait wait = new WebDriverWait(getDriverProvider().get(), 20);
		final boolean result = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element)))
				.getAttribute(attribute).contains(value);
		ExpectedCondition<Boolean> e = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver arg0) {
				return (result == true);
			}
		};
		wait.until(e);
	}

	public boolean waitPresenceOfElement(String element) throws IOException {
		boolean result = true;
		String elementVal = EnvirommentManager.getInstance().getProperty(element);
		if (elementVal == null) {
			elementVal = element;
		}
		WebDriverWait wait = new WebDriverWait(getDriverProvider().get(), 10);
		try {
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(elementVal)));		
		} catch (Exception e) {
			result = false;
		}
		return result;
	}

	public void waitUntilElementBeClickable(String element) throws IOException {
		WebDriverWait wait = new WebDriverWait(getDriverProvider().get(), 50);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))));
	}

	public void clickOnTheVisible(String element) throws IOException {
		Iterator<WebElement> day = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(element)))
				.iterator();
		while (day.hasNext()) {
			WebElement item2 = day.next();
			if (item2.isDisplayed()) {
				item2.click();
			}
		}
	}

	public void refresh() {
		WebDriver driver = getDriverProvider().get();
		driver.navigate().refresh();
		// WaitPageToLoad();
	}

	public void SleepTime(int Time) {
		try {
			Thread.currentThread();
			Thread.sleep(Time);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterValueToTextBox(String element, String dataEntry) throws IOException {

		waitPresenceOfElement(element);
		String value = dataEntry;
		if (value.equalsIgnoreCase("empty")) {
			findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).clear();
		} else {
			findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).sendKeys(value);
		}
	}

	public boolean CheckTextBoxIsEmpty(String element) throws IOException {

		waitPresenceOfElement(element);
		WebElement myInput = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element)));

		if (!myInput.getAttribute("value").equals("")) {
			return false;
		}
		return false;

	}

	public void enterDynamicValueToTextBox(String element, String dataEntry) throws IOException {
		waitPresenceOfElement(element);
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element)))
				.sendKeys(dataEntry + generateID());

	}
	
	public void enterDynamicEmail(String element, String dataEntry) throws IOException {
		waitPresenceOfElement(element);
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element)))
				.sendKeys(generateEmail(dataEntry));

	}

	public void clickOnElement(String element) throws IOException {
		// WaitPageToLoad();
		// wait(element);
		WebDriverWait wait = new WebDriverWait(getDriverProvider().get(), 20);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))));
		WebDriver driver = getDriverProvider().get();
		Actions action = new Actions(driver);
		action.moveToElement(findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element)))).click()
				.perform();
		// findElement(
		// By.cssSelector(EnvirommentManager.getInstance().getProperty(
		// element))).click();
		// WaitPageToLoad();
	}

	public void clickOnAnElement(String element) throws IOException {

		waitPresenceOfElement(element);
		SleepTime(1000);

		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).click();
		
		SleepTime(1000);
	}

	public void clickOnAnElementAndAcceptAlert(String element) throws IOException, AWTException {

		waitPresenceOfElement(element);
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).click();
		if (isAlertPresent()) {
			acceptTheDialog();
		}
		SleepTime(1000);
	}

	public void clickOnTheSecondArticalBtns(String element) throws IOException {

		SleepTime(2000);
		waitPresenceOfElement(element);
		findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).get(1).click();
		SleepTime(1000);
	}

	public void clickOnElementUsingJS(String element) throws IOException {
		WebDriver driver = getDriverProvider().get();
		element = EnvirommentManager.getInstance().getProperty(element);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("$('" + element + "').click();");
	}

	public void waitElementToDisappear(String element) throws IOException {
		WebDriverWait wait = new WebDriverWait(getDriverProvider().get(), 360);
		wait.until(ExpectedConditions
				.invisibilityOfElementLocated(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))));

	}

	public boolean compareTwoElement(String element, String value) throws IOException {
		waitElementToDisappear("progressDialog");
		waitPresenceOfElement(element);
		boolean result = false;
		if (findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).getText().toString()
				.equalsIgnoreCase(value)) {
			result = true;
		}
		return result;
	}

	public boolean checkIsDisplys(String element) throws IOException {		
		waitPresenceOfElement(element);
		return findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).isDisplayed();

	}

	
	
		public void acceptTheDialog() throws AWTException {
		SleepTime(3000);
		
		try {
//			WebDriverWait wait = new WebDriverWait(getDriverProvider().get(),10);
//			wait.until(ExpectedConditions.alertIsPresent());
			switchTo().alert().accept();
		
		} catch (NoAlertPresentException  e) {
			e.printStackTrace();
		}

	}
	
	
		public void acceptThePopup() throws AWTException {

		SleepTime(3000);
		try {
		//	WebDriverWait wait = new WebDriverWait(getDriverProvider().get(), 10);
		switchTo().activeElement().click();

		} catch (NoAlertPresentException  e) {
			System.err.println("No Alert Found");
			e.printStackTrace();
		}

	}
	
	

	public boolean isAlertPresent() {
		boolean presentFlag = false;
		try {
			switchTo().alert();
			presentFlag = true;
		} catch (NoAlertPresentException ex) {
			// Alert not present
			ex.printStackTrace();
		}
		return presentFlag;
	}

	public void dismissTheDialog() throws AWTException {
		SleepTime(3000);
		try {
		//	WebDriverWait wait = new WebDriverWait(getDriverProvider().get(), 10);
		//	wait.until(ExpectedConditions.alertIsPresent());
			switchTo().alert().dismiss();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static String generateTimeStamp(String prefix) {
		java.util.Date date = new java.util.Date(); // Right now
		java.sql.Timestamp timestamp = new java.sql.Timestamp(date.getTime());
		String token = new SimpleDateFormat("MM/dd/yyyy hh:mm").format(timestamp).toString();

		return prefix + " " + token;
	}

	public static String getCurrentTime() {
		java.util.Date date = new java.util.Date(); // Right now
		java.sql.Timestamp timestamp = new java.sql.Timestamp(date.getTime());
		String token = new SimpleDateFormat("MM/dd/yy hh:mm a").format(timestamp).toString();

		return token;
	}

	public static String generateID() {
		java.util.Date date = new java.util.Date(); // Right now
		java.sql.Timestamp timestamp = new java.sql.Timestamp(date.getTime());
		String token = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(timestamp).toString();
		return token;
	}

	public static String generateEmail(String prefix) {
		java.util.Date date = new java.util.Date(); // Right now
		java.sql.Timestamp timestamp = new java.sql.Timestamp(date.getTime());
		String token = new SimpleDateFormat("MMddyyyyhhmmss").format(timestamp).toString();
		String[] emailArray = prefix.split("@");
		String generatedEmail = emailArray[0] + token + "@" + emailArray[1];

		return generatedEmail;
	}

	public void searchForAnElement() throws IOException {
		waitElementToDisappear("progressDialog");
		waitPresenceOfElement("Search_Box");
		waitUntilElementBeClickable("Search_Box");
		enterValueToTextBox("Search_Box", "#Automation ");
		waitElementToDisappear("progressDialog");
		try {
			WaitDOMToBeReady();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int calculateTheNumberOfItems(String items) throws IOException {
		int num1;
		waitElementToDisappear("progressDialog");
		waitPresenceOfElement("Last_page_Button");
		if (findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty("Last_page_Button")))
				.size() == 0) {
			if (findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(items))).size() == 0) {
				num1 = 0;
			} else {
				num1 = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(items))).size();
			}
		} else {
			clickOnElement("Last_page_Button");
			waitElementToDisappear("progressDialog");
			waitPresenceOfElement(items);
			num1 = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(items))).size();
		}
		return num1;
	}

	public boolean isEnabled(String element) throws IOException {
		boolean Condition = false;
		waitPresenceOfElement(element);
		if (findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).isEnabled()) {
			Condition = true;
		}
		return Condition;
	}

	public void hoverOverElement(String theElement) throws IOException {
		waitElementToDisappear("progressDialog");
		waitPresenceOfElement(theElement);
		WebElement elem = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(theElement)));
		Actions builder = new Actions(getDriverProvider().get());
		Actions hoverOver = builder.moveToElement(elem);
		hoverOver.perform();
	}

	public void resetAttribute(String element, String Attribute, String value) {
		WebDriver driver = getDriverProvider().get();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement setElement = driver.findElement(By.cssSelector(element));
		js.executeScript("arguments[0].setAttribute('" + Attribute + "', '" + value + "')", setElement);
	}

	
	public boolean CheckElementNotDisplays(String element) throws IOException {
		if (findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).isDisplayed()) {
			return false;
		}
		return true;
	}

	public void ScrollAndClick(String element) throws IOException {
		waitPresenceOfElement("Page_Title");
		wait("Search_Box");
		scrollToElementAndStop(element);
		clickOnElement(element);
		waitPresenceOfElement("Page_Title");
	}


	public void printLists(ArrayList<String> a1, ArrayList<String> a2) {

		int size = 0;

		if (a1.size() >= a2.size()) {
			size = a1.size();
		} else {
			size = a2.size();
		}

		for (int i = 0; i < size; i++) {

			System.err.println(a1.get(i) + "               " + a2.get(i));
			System.out.println("\n");
			System.out.println("\n");
			System.out.println("\n");

		}
	}

	public void displaysElement(String element) throws IOException {
		try {
			WaitDOMToBeReady();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		waitPresenceOfElement(element);
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).isDisplayed();

	}

	
	public void uploadFileTo(String Thefile, String Choose) throws IOException, AWTException {
		try {
			WaitDOMToBeReady();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Path = System.getProperty("user.dir") + File.separator + "src" + File.separator + Thefile;

		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(Choose))).sendKeys(Path);
		if (!Choose.equals("Replace_Browse_Btn")) {
			waitPresenceOfElement("Upload_Files");
		}
	}

	public void switchTabs() {
		browserTabs = new ArrayList<String>(getWindowHandles());
		switchTo().window(browserTabs.get(1));
		

	}

	public void switchToSecondTab() {
		browserTabs = new ArrayList<String>(getWindowHandles());
		switchTo().window(browserTabs.get(2));

	}

	public void switchTabsBack() {
		browserTabs = new ArrayList<String>(getWindowHandles());
		switchTo().window(browserTabs.get(0));

	}

	public void getText(String element) throws IOException {
		waitPresenceOfElement(element);
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(element))).getText();

	}

	public void assertResult(String Actual, String expected) throws IOException {

		try {
			WaitDOMToBeReady();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		waitPresenceOfElement(Actual);
		String Message = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(Actual))).getText();
		System.out.println(expected);
	    System.out.println(Message);
	  //  org.junit.Assert.assertTrue(Message.toLowerCase().contains(expected.toLowerCase()));
	    Assert.assertTrue("Actual: '" + Message  +"' Expected: '" + expected+"'",Message.contains(expected));
	 
	
		
	}

	public void SwitchToIframe(String IframeSelector) throws IOException, AWTException {
		getDriverProvider().get().switchTo()
				.frame(findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(IframeSelector))));
	}

	public void SwitchBackFromIframe() throws IOException, AWTException {
		getDriverProvider().get().switchTo().defaultContent();
	}

	public void DragAndDrop(String source, String target) throws IOException, AWTException {
		WebElement Source = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(source)));

		WebElement Target = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(target)));

		getActions().dragAndDrop(Source, Target).perform();
	}

	public void assertValue(String ele, String page, String newValue) throws IOException {

		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty("ManuScript_title"))).clear();
		findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(ele))).sendKeys(newValue);

		clickOnElement("Confirm_Information_Tab");
		String a = findElement(By.cssSelector(EnvirommentManager.getInstance().getProperty(page))).getText();

		Assert.assertTrue(a.toLowerCase().contains(newValue.toLowerCase()));
	}

	public void WaitDOMToBeReady() throws Exception {
		boolean pageLoaded = false;
		while (!pageLoaded) {
			int counter = 0;
			if (executeScript("return document.readyState").toString().equals("complete")) {
				pageLoaded = true;
				break;
			}
			if (counter == 20) {
				pageLoaded = true;
				break;
			}
			Thread.sleep(1000);
			counter++;
		}
	}

	public boolean VerifyTheVisibiltyOfContentSimple(String ItemSelector) throws IOException {
		boolean condition = false;
		condition = findElements(By.cssSelector(EnvirommentManager.getInstance().getProperty(ItemSelector))).size() > 0;
		return condition;
	}



}