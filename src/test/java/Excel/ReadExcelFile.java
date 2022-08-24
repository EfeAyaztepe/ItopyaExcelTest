package Excel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ReadExcelFile {
 static public String read(int row,int cell) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook("src/test/java/Excel/Product.xlsx");
        XSSFSheet sheet = workbook.getSheet("Product");
        String value = sheet.getRow(row).getCell(cell).getStringCellValue();
        return value;
    }
}
