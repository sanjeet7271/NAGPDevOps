package com.nagp.testcases;

import org.testng.annotations.Test;

import com.nagp.controllers.ExcelDataProvider;
import com.nagp.pageObjects.initializePageObjects.PageFactoryInitializer;

public class TestCase03 extends PageFactoryInitializer {
	@Test(dataProvider = "excelSheetNameAsMethodName", dataProviderClass = ExcelDataProvider.class)
	public void testGoogle(String testCaseID, String emailID, String password) throws Exception {
		googleHomePage().clickonGmailLink();
	}
}
