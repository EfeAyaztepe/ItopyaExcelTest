package Excel;

import Pages.ProductPage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class WriteExcelFile {

    private static String[] columns = {"Email", "Password", "Search_Name", "ProductName_ProductPage", "ProductPrice_ProductPage", "ProductName_CartPage", "ProductPrice_CartPage"};
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product("testerrr20@gmail.com", "Testtest123321", "rival 3"));
    }




        public static void writeExcel(int cellNum1, String item1, int cellNum2, String item2) throws IOException {


        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Product"); //Create Sheet

        Row headerRow = sheet.createRow(0); //Create Row

        for (int i = 0; i < columns.length; i++) { //Create Cells
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
        }


        int rowNum = 1;
        for (Product product : products) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(product.getEmail());

            row.createCell(1).setCellValue(product.getPassword());

            row.createCell(2).setCellValue(product.getSearchName());

            row.createCell(cellNum1).setCellValue(item1);

            row.createCell(cellNum2).setCellValue(item2);


            for (int i = 0; i < columns.length; i++) {
                sheet.autoSizeColumn(i);
            }
        }

            // Write the output to a file
            FileOutputStream fileOut = new FileOutputStream("src/test/java/Excel/Product.xlsx");
            workbook.write(fileOut);
            fileOut.close();

            // Closing the workbook
            workbook.close();



    }


}