package com.crm.poi;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.io.InputStream;

public class ParseExcelTest {

    public static void main(String[] args) throws Exception{
        //找到目标文件
        InputStream is=new FileInputStream("d:\\student.xls");
        HSSFWorkbook wb=new HSSFWorkbook(is); //将文件读入工作薄
        //选择第1页
       HSSFSheet sheet= wb.getSheetAt(0);
       //行,单元格对象
        HSSFRow row=null;
        HSSFCell cell=null;
        //对每一行进行解析
        for(int i=0;i<=sheet.getLastRowNum();i++){
            row=sheet.getRow(i);
            for(int j=0;j<row.getLastCellNum();j++){
                cell=row.getCell(j);
                System.out.print(getCellValue(cell)+" ");
            }
            System.out.println();
        }
    }

    public static String getCellValue(HSSFCell cell){
        String ret="";
        switch (cell.getCellType()){
            case HSSFCell.CELL_TYPE_STRING:
                ret=cell.getStringCellValue();
                break;
            case HSSFCell.CELL_TYPE_BOOLEAN:
                ret=cell.getBooleanCellValue()+"";
                break;
            case HSSFCell.CELL_TYPE_NUMERIC:
                ret=cell.getNumericCellValue()+"";
                break;
            case HSSFCell.CELL_TYPE_FORMULA:
                ret=cell.getCellFormula();
                break;
            default:
                ret="";
        }
        return ret;
    }

}
