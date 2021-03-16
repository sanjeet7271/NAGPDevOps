package com.nagp.controllers;

import org.testng.annotations.DataProvider;

import com.nagp.utils.ExcelUtils;

import java.io.File;
import java.lang.reflect.Method;
/**
 * 
 * @author sanjeetpandit
 *
 */

public class ExcelDataProvider extends InitMethod {
    @DataProvider(name = "multiSheetExcelRead")
    public static Object[][] multiSheetExcelRead(Method method) throws Exception {
        File file = new File("./src/test/resources/Excel Files/TestData.xlsx");
        String SheetName = method.getName();
        System.out.println(SheetName);
        return ExcelUtils.getTableArray(file.getAbsolutePath(), SheetName);
    }

    @DataProvider(name = "excelSheetNameAsMethodName")
    public static Object[][] excelSheetNameAsMethodName(Method method) throws Exception {
        File file = new File("src/test/resources/Test Data/Excel Files/" + method.getName() + ".xls");
        System.out.println("Opening Excel File:" + file.getAbsolutePath());
        return ExcelUtils.getTableArray(file.getAbsolutePath());
    }
}
