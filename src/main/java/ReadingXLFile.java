import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class ReadingXLFile {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        Path path = Paths.get("/Users/Subash/desktop","family.xlsx");
        Workbook workbook = new XSSFWorkbook(path.toFile());
        Sheet sheet = workbook.getSheet("Names");
        Iterator<Row> rowIterator = sheet.rowIterator();
        while (rowIterator.hasNext()){
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()){
                Cell cell = cellIterator.next();
                if(cell.getCellType()== CellType.STRING){
                    System.out.println(cell.getStringCellValue());
                }
                if(cell.getCellType()== CellType.NUMERIC){
                    System.out.println(cell.getNumericCellValue());
                }
            }


        }


    }
}
