package com.nagp.testcases;

import org.testng.annotations.Test;
import com.nagp.pageObjects.initializePageObjects.PageFactoryInitializer;

public class TestCase02 extends PageFactoryInitializer {
	@Test()
	public void testGoogleSearch() throws Exception {
		googleHomePage().enterTextToSearchBox();
		googleHomePage().clickToSearchButton();
	}
}
