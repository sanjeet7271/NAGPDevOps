# NAGP Automation Framework

This is a Selenium Hybrid Framework.
 - Written in **JAVA**
 - Implemented using **TestNG**
 - Build Toold - Maven
 - Implemented Page Object Model Design Pattern
 - Excel TestNG @DataProvider
 - Video Recording - Automation-Remarks
 - Ashot - To Capture Full Page Screenshot

### Browsers Supported
 - Mozilla Firefox
 - Google Chrome
 - Internet Explorer
 - Opera
 - Microsoft Edge

### Headerless Support
 - HTMLUnit 
 - Chrome Headless

### Platform Support
 - Windows
 - Linux
 - Macintosh

---
### Reporting
 - [Extent Reporting](http://extentreports.com/)
 
---
### Usage
```sh
$ git clone 
$ mvn clean test
```
---
### Browser Setup
 - Navigate to *WebAutomation\src\main\resources* change *BrowserType* in the ApplicationConfig.properties
 or use Maven to invoke different browsers

```sh
$ mvn clean test -DBrowserType=Chrome			#Chrome
$ mvn clean test -DBrowserType=Chrome_Headless		#Chrome Headless
$ mvn clean test -DBrowserType=Firefox			#Mozilla Firefox
$ mvn clean test -DBrowserType=IE			#Internet Explorer
$ mvn clean test -DBrowserType=Opera			#Opera Blink
$ mvn clean test -DBrowserType=Edge			#Microsoft Edge
$ mvn clean test -DBrowserType=Unit			#HTML Unit Headerless Browser
```
---
### Report Details

**Report Location** `System.getProperty("user.dir") + "/src/test/resources/Reports/";`

**Failed Screenshots** `System.getProperty("user.dir") + "/src/test/resources/Reports/Images";`

**Video Location** `System.getProperty("user.dir") + "/src/test/resources/Reports/Videos";`

---


 
 ### @DataProvider Usuage
 
__To Use Method Name as Excel Workbook Name, Use the following:__
```java
@Test(dataProvider="excelSheetNameAsMethodName", dataProviderClass=ExcelDataProvider.class)
```

__To use a Single Workbook with multiple `@DataProvider` sheets, Use:__

> NOTE: SheetName should be same name as Method Name
```java
@Test(dataProvider="multiSheetExcelRead", dataProviderClass=ExcelDataProvider.class)
```

### Video Feature
 > _enabledALL_ -> To Save recorded video for All test case. Stored in `"./src/test/resources/Reports/Videos"`
 
 > _enabledFAILED_ -> To Save recorded video for ONLY FAILED test case. Stored in  `"./src/test/resources/Reports/Videos"`
 
 > _disabled_ -> To not save the video