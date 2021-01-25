package com.crm.poi;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.HorizontalAlignment;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class CreateExcelTest {
    public static void main(String[] args) throws Exception{
        //1.创建一个HSSFWorkbook对象,对应一个excel文件
        HSSFWorkbook wb=new HSSFWorkbook();
        //2.使用wb创建HSSFSheet对象,对应一个页
        HSSFSheet sheet=wb.createSheet("学生列表");
        //3.创建一个HSSFCellStyle对象,对应样式
        HSSFCellStyle style=wb.createCellStyle();
        style.setAlignment(HorizontalAlignment.CENTER);//居中
        //4.表头信息,行编号从0,0表示第一行
        HSSFRow row=sheet.createRow(0);
        //5.取列,列对应3列,列从0
        HSSFCell cell=row.createCell(0);
        cell.setCellValue("学号");
        cell=row.createCell(1);
        cell.setCellValue("姓名");
        cell=row.createCell(2);
        cell.setCellValue("年龄");
        //6.使用sheet创建10个HSSFRow对象,对应10行
        for(int i=1;i<=10;i++){
            //第一列
            row=sheet.createRow(i);
            cell=row.createCell(0);
            cell.setCellStyle(style);
            cell.setCellValue(100+i);

            //第二列
            cell=row.createCell(1);
            cell.setCellValue("tom"+i);

            //第三列
            cell=row.createCell(2);
            cell.setCellValue(20+i);
        }

        //使用IO流做输出,先指定输出位置
        OutputStream os=new FileOutputStream("d:\\student.xls");
        wb.write(os);
        os.close();
        wb.close();
        System.out.println("finish");
    }
}
