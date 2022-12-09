package day05;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _01Excel {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\tjkba\\OneDrive\\Desktop\\Book1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet("Sheet1");


        Row row = sheet.getRow(1);
        Cell cell = row.getCell(1);
        //System.out.println(cell);

        Row row1 = sheet.getRow(2);
        Cell cell1 = row1.getCell(0);
        //System.out.println(cell1);
        // length(), size(), getPhysicalNumberOfRows()
       int rows = sheet.getPhysicalNumberOfRows();
       int cols = sheet.getRow(0).getLastCellNum();

       /*String a ="adsad";

        for (int i = 0; i <a.length() ; i++) {

        }*/

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <cols ; j++) {
                    Cell cellValue = sheet.getRow(i).getCell(j);
                System.out.print(" " +sheet.getRow(i).getCell(j));
            }
            System.out.println();
        }
    }
}
