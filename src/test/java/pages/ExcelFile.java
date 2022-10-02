package pages;

import io.cucumber.java.lv.Tad;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFChartSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelFile {


    String path = "C:\\Users\\gefeyik\\IdeaProjects\\Hepsiburada\\src\\test\\java\\utilities\\Sample data.xlsx";


    @Test
    public void TestDatas() throws IOException {

        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet worksheet = workbook.getSheetAt(0);
        System.out.println(worksheet.getRow(0).getCell(1));
        System.out.println("ben: " + worksheet.getRow(1).getCell(1));

    }

    @Test
    public void TestDatas2() throws IOException {
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet worksheet = workbook.getSheetAt(0);
       // XSSFCell cell= worksheet.getRow(0).createCell(1);
        //cell.setCellValue(30);
       // cell.setCellValue("kids");
        XSSFCell cell =worksheet.getRow(1).getCell(1);

        System.out.println(cell);

       // System.out.println(cell);
        FileOutputStream fos = new FileOutputStream(path);
        workbook.write(fos);
        fos.close();
        workbook.close();
        fis.close();
    }
}