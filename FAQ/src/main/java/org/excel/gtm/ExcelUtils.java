package org.excel.gtm;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class ExcelUtils {



    static ReadExcel reader;

    public static ArrayList<Object[]> getDataFromexcel() {
        ArrayList<Object[]> myData = new ArrayList<Object[]>();
        try {
            String Excel_Name="C:\\Users\\a1354\\Workout\\FAQ\\src\\main\\java\\org\\excel\\gtm\\Shriramfinance_slug_Other-Domain (1).xlsx";
            reader = new ReadExcel(Excel_Name);
            System.out.println(Excel_Name);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        for (int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {
        	String INDEX = reader.getCellData("Sheet1", "INDEX", rowNum);
        	String PageURL = reader.getCellData("Sheet1", "PageURL", rowNum);



        	



            Object ob[] = { INDEX, PageURL };
            myData.add(ob);
        }
        return myData;

    }
    public static void writeinexcel(String value, int INDEX) throws Exception {
        Thread.sleep(2000);
        File fis = new File("C:\\Users\\a1354\\Workout\\FAQ\\src\\main\\java\\org\\excel\\gtm\\Shriramfinance_slug_Other-Domain (1).xlsx");
//        String arr[]="https://www.google.com";
//        ArrayList<String> cars = new ArrayList<String>(fis);
        FileInputStream excelloc = new FileInputStream(fis);
        XSSFWorkbook wb = new XSSFWorkbook(excelloc);
        XSSFSheet s = wb.getSheetAt(0);
        XSSFRow row = s.getRow(INDEX);
        XSSFCell c = row.createCell(2);
        c.setCellValue(value);
        FileOutputStream out = new FileOutputStream(fis);
        wb.write(out);
        out.close();
    }
    
    public static void writeinexcel2(String value, int INDEX) throws Exception {
        Thread.sleep(2000);
        File fis = new File("C:\\Users\\a1354\\Workout\\FAQ\\src\\main\\java\\org\\excel\\gtm\\Shriramfinance_slug_Other-Domain (1).xlsx");
//        String arr[]="https://www.google.com";
//        ArrayList<String> cars = new ArrayList<String>(fis);
        FileInputStream excelloc = new FileInputStream(fis);
        XSSFWorkbook wb = new XSSFWorkbook(excelloc);
        XSSFSheet s = wb.getSheetAt(0);
        XSSFRow row = s.getRow(INDEX);
        XSSFCell c = row.createCell(3);
        c.setCellValue(value);
        FileOutputStream out = new FileOutputStream(fis);
        wb.write(out);
        out.close();
    }

    public static void writeinexcelForReasons(String value, int INDEX) throws Exception {
        Thread.sleep(2000);
        File fis = new File(
                "C:\\Users\\a1354\\Workout\\FAQ\\src\\main\\java\\org\\excel\\gtm\\Shriramfinance_slug_Other-Domain (1).xlsx");
        FileInputStream excelloc = new FileInputStream(fis);
        XSSFWorkbook wb = new XSSFWorkbook(excelloc);
        XSSFSheet s = wb.getSheetAt(0);
        XSSFRow row = s.getRow(INDEX);
        XSSFCell c = row.createCell(46);
        c.setCellValue(value);
        FileOutputStream out = new FileOutputStream(fis);
        wb.write(out);
        out.close();
    }



}
