package pertemuan7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 *
 */
public class ReadXls {

    public static void main(String[] args) throws IOException {
        //memanggil method readXls
        readFromXls("F://data.xls");
    }

    public static void readFromXls(String urlexcel) throws FileNotFoundException, IOException {
        HSSFWorkbook myexcel = new HSSFWorkbook(new FileInputStream(urlexcel));
        HSSFSheet myexcelSheet = myexcel.getSheet("training");
        FormulaEvaluator formulaEv = myexcel.getCreationHelper().createFormulaEvaluator();

        for (Row row : myexcelSheet) { //FOR EACH, setiap sheet tampilkan row
            for (Cell cell : row) {     //setiap row tampilkan cell
                switch (formulaEv.evaluateInCell(cell).getCellType()) { //menampilkan sesuai cell type
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t\t");
                        break;
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getStringCellValue() + "\t\t");
                        break;
                }
            }
            System.out.println("");
            myexcel.close();
        }
    }
}