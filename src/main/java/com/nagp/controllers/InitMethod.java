package com.nagp.controllers;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestResult;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.io.File;
import java.net.URI;
/**
 * 
 * @author sanjeetpandit
 *
 */
public class InitMethod {
    public static ApplicationConfigReader appConfig = new ApplicationConfigReader();

    public static final String WebsiteURL = appConfig.getWebsiteUrl();
    public static final String Browser = appConfig.getBrowser();
    public static final int MaxPageLoadTime = appConfig.getMaxPageLoadTime();
    public static final int ImplicitlyWait = appConfig.getImplicitlyWait();

    public static final String FS = File.separator;

    public static final String OSName = System.getProperty("os.name");
    public static final String OSArchitecture = System.getProperty("os.arch");
    public static final String OSVersion = System.getProperty("os.version");
    public static final String OSBit = System.getProperty("sun.arch.data.model");

    public static final String ProjectWorkingDirectory = System.getProperty("user.dir");

    public static final String TestData = "./src/test/resources/TestData/";
    public static final String ExcelFiles = "./src/test/resources/TestData/Excel Files/";
    public static final String PropertiesFiles = "./src/test/resources/TestData/Properties Files/";
    public static final String Reports = "./src/test/resources/Reports/";
    public static final String Images = "./src/test/resources/Reports/Images/";
    public static final String Videos = "./src/test/resources/Reports/Videos/";

    public static Robot re;
    public static Alert al;
    public static String robotImageName;
    public static Select se;
    public static String FileToUpload;
    public static Actions ac;
    public static ITestResult testResult;
    public static SoftAssert softAssert;
    public static ITestResult result;
    public static URI uri;

    public static final String OUTPUT_FOLDER = "./src/test/resources/Reports/";
    public static final String FILE_NAME = "Extent Report.html";
    public ExtentReports extent;
    public ISuite suite;
    public ISuiteResult res;
    public ExtentTest test;

}
