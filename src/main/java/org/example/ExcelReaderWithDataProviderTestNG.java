package org.example;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReaderWithDataProviderTestNG {
    DataFormatter formatter=new DataFormatter();
    @Test(dataProvider = "driveTest")
    public void testCasesData(String greeting,String communication,String id){
        System.out.println(greeting+" " + communication+" " + id);
    }

    @DataProvider(name="driveTest")
    public Object[][]  getData() throws IOException {
//        Object[][] data={{"hello","text",1},{"he","msg",1},{"hi","text message",1} };
//        return data;
        FileInputStream fis=new FileInputStream("C:\\Users\\Ganga\\IdeaProjects\\PracticeSessions\\resources\\ExcelData.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(fis);
       XSSFSheet sheet=workbook.getSheetAt(0);
       int rowCount=sheet.getPhysicalNumberOfRows();
       XSSFRow row=sheet.getRow(0);
       int columnCount=row.getLastCellNum();
       //rowCount-1 - indicates first row is not required
       Object data[][]=new Object[rowCount-1][columnCount];
       for(int i=0;i<rowCount-1;i++){
           row=sheet.getRow(i+1);
           for(int j=0;j<columnCount;j++){
               XSSFCell cell=row.getCell(j);
               data[i][j]=formatter.formatCellValue(cell);
           }
       }
       return  data;
    }
}
