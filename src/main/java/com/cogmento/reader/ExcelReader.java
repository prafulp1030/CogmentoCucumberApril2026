package com.cogmento.reader;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	XSSFSheet sheet;

	public ExcelReader(String excelFileName, String sheetName) {
		try {
			FileInputStream fis = new FileInputStream(excelFileName);

			XSSFWorkbook workbook = new XSSFWorkbook(fis);

			sheet = workbook.getSheet(sheetName);
		} catch (Exception e) {
			e.getLocalizedMessage();
		}
	}

	public String getSheetTestData(int row, int cell) {
		return sheet.getRow(row).getCell(cell).getStringCellValue();
	}

	public List<LinkedHashMap<String,String>> getAllSheetTestData() {

		int totalRow = sheet.getLastRowNum() + 1;

		int totalColumns = sheet.getRow(0).getLastCellNum();

		List<LinkedHashMap<String,String>> list = new ArrayList<LinkedHashMap<String, String>>();
		
		
		for (int i = 1; i < totalRow; i++) {

			LinkedHashMap<String,String> linkedHashMap =new LinkedHashMap<String, String>();
			
			for (int j = 0; j < totalColumns; j++) {

				String columnName = getSheetTestData(0, j);

				String rowCelltestData = getSheetTestData(i, j);

				linkedHashMap.put(columnName, rowCelltestData);	
				
			}
			
			list.add(linkedHashMap);

		}
		
		return list;
	}

}
