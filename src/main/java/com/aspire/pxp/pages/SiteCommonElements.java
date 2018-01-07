package com.aspire.pxp.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "siteCommonElements", url = "")
public interface SiteCommonElements {

	@CssSelector("div.prettyInput-wrapper input[placeholder=\"Search\"]")
	public AspireWebElement searchBox();

	@CssSelector("div div button[data-ng-click=\"table.export()\"]")
	public AspireWebElement exportButton();

	@CssSelector("tr:nth-child(1) > td.t-alignRight.ng-scope > div > button")
	public AspireWebElement actionButton();

	@CssSelector(".cpPagination")
	public AspireWebElement paginationModule();

	@CssSelector("table > thead > tr > th:nth-child(1) h7")
	public AspireWebElement firstColumn();

	@CssSelector("table > thead > tr > th:nth-child(2) h7")
	public AspireWebElement secondColumn();

	@CssSelector("table > thead > tr > th:nth-child(3) h7")
	public AspireWebElement thirdColumn();

	@CssSelector("table > thead > tr > th:nth-child(4) h7")
	public AspireWebElement forthColumn();

	@CssSelector("table > thead > tr > th:nth-child(5) h7")
	public AspireWebElement fifthColumn();

	@CssSelector("table > thead > tr > th:nth-child(6) h7")
	public AspireWebElement sixthColumn();

	@CssSelector("table > thead > tr > th:nth-child(7) h7")
	public AspireWebElement seventhColumn();

	@CssSelector("table > thead > tr > th:nth-child(8) h7")
	public AspireWebElement eightthColumn();

	@CssSelector("table > thead > tr > th:nth-child(9) h7")
	public AspireWebElement ninthColumn();

	@CssSelector("table > thead > tr > th:nth-child(10) h7")
	public AspireWebElement tenthColumn();

	@CssSelector("table > thead > tr > th:nth-child(11) h7")
	public AspireWebElement elevenColumn();

	@CssSelector(".prettySelect-dropdown:not([class*=\"hiddin\"]) li:nth-child(1)")
	public AspireWebElement firstOption();

	@CssSelector("button+button[data-ng-click=\"modal.getDelegate().submit()\"]")
	public AspireWebElement submitButton();

	@CssSelector("circle[class=\"loader-track\"]")
	public AspireWebElement progressDialog();

	@CssSelector("table tbody tr:nth-child(1) td[data-index=\"0\"]")
	public AspireWebElement firstCell();

	@CssSelector("tr[data-ng-if=\"table.isEmpty()\"]")
	public AspireWebElement noDataFound();

	@CssSelector("${pages.site.main.activeTab}")
	public AspireWebElement activeTab();

	@CssSelector("${pages.site.main.returnedRows}")
	public AspireWebElements returnedRows();

	@CssSelector("${pages.site.main.modalDialogAcceptButton}")
	public AspireWebElement modalDialogAcceptButton();

	@CssSelector("${pages.site.main.getItemsPerPage75Button}")
	public AspireWebElement getItemsPerPage75Button();

	@CssSelector("${pages.site.main.getItemsPerPage100Button}")
	public AspireWebElement getItemsPerPage100Button();
	
	@CssSelector("${pages.site.main.previousArrowButton}")
	public AspireWebElement previousArrowButton();
	
	@CssSelector("${pages.site.main.nextArrowButton}")
	public AspireWebElement nextArrowButton();
	
	@CssSelector("${pages.site.main.secondPageButton}")
	public AspireWebElement secondPageButton();
	
	@CssSelector("${pages.site.main.activeNumber}")
	public AspireWebElement activeNumber();
	
	@CssSelector("${pages.site.main.pageTitle}")
	public AspireWebElement pageTitle();
	
}