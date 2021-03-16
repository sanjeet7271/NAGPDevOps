package com.nagp.pageObjects.initializePageObjects;

import org.openqa.selenium.support.PageFactory;

import com.nagp.controllers.BaseMethod;
import com.nagp.pageObjects.modules.GMailPageObjects;
import com.nagp.pageObjects.modules.GoogleHomePageObjects;
/**
 * 
 * @author sanjeetpandit
 *
 */

public class PageFactoryInitializer extends BaseMethod {
    public GoogleHomePageObjects googleHomePage() {
        return PageFactory.initElements(getWebDriver(), GoogleHomePageObjects.class);
    }

    public GMailPageObjects gmailPage() {
        return PageFactory.initElements(getWebDriver(), GMailPageObjects.class);
    }
}
