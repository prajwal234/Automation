package org.example;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExcelDataReader {

    public static List<ArrayList<String>> readTestData(String filePath) {
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fileInputStream)) {
            Sheet sheet = workbook.getSheetAt(0);
            int rowCount = sheet.getPhysicalNumberOfRows();
            return IntStream.range(1, rowCount)
                    .mapToObj(i -> {
                        Row row = sheet.getRow(i);
                        if (row != null) {
                            int cellCount = row.getPhysicalNumberOfCells();
                            return IntStream.range(0, cellCount)
                                    .mapToObj(j -> getCellValue(row.getCell(j)))
                                    .collect(Collectors.toCollection(ArrayList::new));
                        }
                        return new ArrayList<String>(); // or throw an exception if an empty row is not allowed
                    })
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace(); // Log the exception or rethrow it if needed
        }
        return Collections.emptyList(); // Return an empty list in case of an exception
    }

    private static String getCellValue(Cell cell) {
        if (cell == null) {
            return "";
        }
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                return String.valueOf(cell.getNumericCellValue());
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        String filePath = "path/to/your/excel/file.xlsx";
        List<ArrayList<String>> testData = readTestData(filePath);
        testData.forEach(System.out::println);
    }
}


