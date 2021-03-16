package com.nagp.testcases;

import org.testng.annotations.Test;
import com.nagp.pageObjects.initializePageObjects.PageFactoryInitializer;

public class TestCase01 extends PageFactoryInitializer {
	@Test()
	public void testGoogleTitle() throws Exception {
		googleHomePage().verifyPageTitle();
	}
}

