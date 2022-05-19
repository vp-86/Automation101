package utility;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelOps {

    public String[][] Read_xls(String fPath, String fSheet ) throws IOException {

        String [][] xDT;

        File fs = new File(fPath);
        FileInputStream fis = new FileInputStream(fs);

        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet ws = wb.getSheet(fSheet);

        int fRows = ws.getLastRowNum() + 1;
        int fCols = ws.getRow(0).getLastCellNum();

        xDT = new String[fRows][fCols];

        for(int i=0;i<fRows;i++){

            for (int j=0; j<fCols; j++){

                HSSFCell v_Cell = ws.getRow(i).getCell(j);

                String value = "-";

                if (v_Cell != null){

                    value = Cell_String(v_Cell);
                }
                xDT[i][j] = value;
            }
        }
        wb.close();
        fs = null;
        return xDT;
    }

    public String Cell_String(HSSFCell iCell){

        //int type = iCell.getCellType();
        Object result;
        switch (iCell.getCellType()) {

            case STRING:
                result = iCell.getStringCellValue();
                break;

            case NUMERIC:
                result = iCell.getNumericCellValue();
                break;

            case BOOLEAN:
                result = iCell.getBooleanCellValue();
                break;

            case BLANK:
                result = "";
                break;

            case FORMULA:
                throw new RuntimeException("We can't evaluate formulas in Java");

            case ERROR: // 5
                throw new RuntimeException("This cell has an error");

            default:
                throw new RuntimeException("We don't support this cell type: "
                        + iCell.getCellType());

        }

        return result.toString();

    }


    public void writeXL2(String fPath, String fSheet, String[][] xData) throws Exception{

        File outFile = new File(fPath);
        @SuppressWarnings("resource")
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet osheet = wb.createSheet(fSheet);
        int xR_TS = xData.length;
        int xC_TS = xData[0].length;
        for (int myrow = 0; myrow < xR_TS; myrow++) {
            HSSFRow row = osheet.createRow(myrow);
            for (int mycol = 0; mycol < xC_TS; mycol++) {
                HSSFCell cell = row.createCell(mycol);
                cell.setCellType(CellType.STRING);
                cell.setCellValue(xData[myrow][mycol]);
            }
            FileOutputStream fOut = new FileOutputStream(outFile);
            wb.write(fOut);
            fOut.flush();
            fOut.close();
        }
    }
}
