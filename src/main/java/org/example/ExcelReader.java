package org.example;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ExcelReader {

    public ArrayList<String> getData(String testCaseName) throws IOException {
        ArrayList<String> s = new ArrayList<String>();
        FileInputStream file = new FileInputStream("C:\\Users\\Ganga\\IdeaProjects\\PracticeSessions\\resources\\TestData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        int sheets = workbook.getNumberOfSheets();
        for (int i = 0; i < sheets; i++) {
            if (workbook.getSheetName(i).equalsIgnoreCase("Test")) {
                XSSFSheet sheet = workbook.getSheetAt(i);
                //Identify TestCases column by 1st row
                Iterator<Row> rows = sheet.iterator();
                Row firstRow = rows.next();
                Iterator<Cell> cell = firstRow.cellIterator();
                int k = 0;
                int column = 0;
                while (cell.hasNext()) {//cell is present or not
                    Cell value = cell.next();
                    if (value.getStringCellValue().equalsIgnoreCase("TestCases")) {
                        column = k;
                    }
                    k++;
                }
                System.out.println(column);
                while (rows.hasNext()) {
                    Row r = rows.next();
                    if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName)) {
                        Iterator<Cell> cv = r.cellIterator();
                        while (cv.hasNext()) {
                            Cell c = cv.next();
                            if (c.getCellType()==CellType.STRING) {
                                s.add(c.getStringCellValue());
                            }
                            else{
                                s.add(NumberToTextConverter.toText(c.getNumericCellValue()));
                            }
                        }
                    }
                }
            }

        }
        return s;
    }

}




