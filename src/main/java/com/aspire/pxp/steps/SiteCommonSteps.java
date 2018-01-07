package com.aspire.pxp.steps;

import java.io.File;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.util.Iterator;
import java.util.stream.Stream;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.aspire.automation.annotation.Steps;
import com.aspire.automation.web.util.AspireBrowser;
import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.Browser;
import com.aspire.pxp.pages.SiteCommonElements;

import lombok.extern.slf4j.Slf4j;

@Component
@Steps
@Slf4j
public class SiteCommonSteps {
	@Value("${user.dir}")
	private String refPath;

	{

	}
	@Browser("siteCommonElements")
	AspireBrowser<SiteCommonElements> siteCommonElements;

	@When("[8001-0003] I upload $fileName at $inputField")
	public void uploadFile(@Named("fileName") String fileName, @Named("inputField") String inputField) {
		String filePath = refPath + File.separator + "src" + File.separator + fileName;

		AspireBrowser.getLastAccessedPage().getElementByPropertyName(inputField).sendKeys(filePath);
		if (!inputField.equals("Replace_Browse_Btn")) {
			AspireBrowser.getElementByPropertyNameGlobaly("Upload_Files").within(20).toBeDisabled();
		}		

	}

}
