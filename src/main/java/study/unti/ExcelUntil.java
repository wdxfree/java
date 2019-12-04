package study.unti;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author xudawei
 * @description Excel工具类
 */

public class ExcelUntil {

    /**
     *
     * @param titleNames  excel标题
     * @param data   存入excel的数据
     * @return  返回HSSFWorkbook
     */

    public static HSSFWorkbook getExcel(List<String> titleNames,List<? extends Object> data){
        HSSFWorkbook hssfWorkbook =new HSSFWorkbook();
        HSSFSheet hssfSheet =null;
        HSSFRow row=null;
        int cellCount=0;
        int rowCount=0;


        //创建第一行


        cellCount=0;

        for(Object object:data){
            if(rowCount%60000==0){
                hssfSheet =hssfWorkbook.createSheet(String.valueOf(rowCount/60000));
                row =hssfSheet.createRow(rowCount);
                for(String titleName: titleNames){
                    HSSFCell hssfCell =row.createCell(cellCount);
                    hssfCell.setCellValue(titleName);
                    cellCount++;
                }

            }
            rowCount++;
            row =hssfSheet.createRow(rowCount);
            //采用反射的方式获取类的属性
            Class clazz = object.getClass();
            Field[] fields =clazz.getDeclaredFields();
            for(Field field : fields ){
                try {
                    field.setAccessible(true);
                    HSSFCell hssfCell =row.createCell(cellCount);
                    Object o = field.get(object);
                    if(o!=null){

                        hssfCell.setCellValue(o.toString());
                    }else{
                        hssfCell.setCellValue("");
                    }

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                cellCount++;
            }

        }
        return  hssfWorkbook;

    }


    public static void main(String[] args) {
        List<String> titleNames =new ArrayList<>();
        titleNames.add("姓名");
        titleNames.add(null);
        List<Test> tests=new ArrayList<>();
        tests.add(new Test("测试",null));
        HSSFWorkbook excel = ExcelUntil.getExcel(titleNames, tests);

        File file = new File("D:/test.xls");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("不存在");
        }

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            excel.write(fileOutputStream);

            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
