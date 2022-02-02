package org.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.helper.DataUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	
	public String getData(String path, String sheetName,int rowNum,int cellNum) throws IOException {
		String data=null;
		File file =new File(path);
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);		
		Cell cell = row.getCell(cellNum);
		int type = cell.getCellType();
		if (type==1) {
			 data = cell.getStringCellValue();
			 }
		if (type==0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat=new SimpleDateFormat("DD-MMM-YY");
				data = dateFormat.format(dateCellValue);
				
			}else {
				double d = cell.getNumericCellValue();
				long l=(long)d;
				 data = String.valueOf(l);
			}
			
		}return data;
		
	}
	
	public void updatedata(String path, String sheetName,int rowNo,int cellNo,String oldDate,String newDate) throws IOException {
		
		File file=new File(path);
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		String stringCellValue = cell.getStringCellValue();
		if (stringCellValue.equals(oldDate)) {
			cell.setCellValue(newDate);
			
		}
		FileOutputStream O=new FileOutputStream(file);
		workbook.write(O);
		
		
	}
	
	public void writeData(String path, String sheetName,int rowNo,int cellNo,String data) throws IOException {
		
		File file=new File(path);
		Workbook workbook= new XSSFWorkbook();
		Sheet sheet = workbook.createSheet(sheetName);
		Row row = sheet.createRow(rowNo);
		Cell cell = row.createCell(cellNo);
		cell.setCellValue(data);
		FileOutputStream o= new FileOutputStream(file);
		workbook.write(o);
	}
	
	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	public static void loadUrl(String url) {
		driver.get(url);
		
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
		
	}
	
	public void type(WebElement element,String data) {
		
		element.sendKeys(data);
	}
	
	public  void click(WebElement element) {
		element.click();
		
	}
	public String getText(WebElement element) {
		String data = element.getText();
		return data;
	}
	
	public WebElement findElementById(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;
		
	}
	public WebElement findElementByName(String attributeValue) {
		WebElement element = driver.findElement(By.name(attributeValue));
		return element;
		
	}
	public WebElement findElementByClass(String attributeValue) {
		WebElement element = driver.findElement(By.className(attributeValue));
		return element;
		
	}
	public WebElement findElementByxpath(String attributeValue) {
		WebElement element = driver.findElement(By.xpath(attributeValue));
		return element;
		
	}
	
	public  String getAttribute(WebElement element,String attributeName) {
		String data = element.getAttribute(attributeName);
		return data;
	}
	
	public   String getAttribute(WebElement element) {
		String data = element.getAttribute("value");
		return data;
	}
	
	public void selectByText(WebElement element,String text) {
		
		Select select= new Select(element);
		select.selectByVisibleText(text);
	}
	
public void selectByAttribute(WebElement element,String value) {
		
		Select select= new Select(element);
		select.selectByValue(value);
	}
	
public void selectByIndex(WebElement element,int index) {
	
	Select select= new Select(element);
	select.deselectByIndex(index);
}
	
public void sleep(long sec) throws InterruptedException {
	Thread.sleep(sec);
}
	public void alertOk() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void alertCancel() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
	}
	
	public void alertValue(String value) {
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(value);
		alert.accept();
	}
	
	
	public static void closeAllWindows() {
		driver.close();
		
	}
	
	
	
	
	
	
	
	

}
