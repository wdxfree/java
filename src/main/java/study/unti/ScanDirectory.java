package study.unti;

import java.io.*;

/**
 * @Author
 */
public class ScanDirectory {


    private  static int count =0;
    public static  int scan(int a,File file){

        if(file.listFiles()!=null){

            for(File file1 : file.listFiles()){
                scan(a,file);
            }

        }else {
            return 1;
        }
        return 0;
    }





    public static void main(String[] args) {
        FileOutputStream fileOutputStream=null;
        FileWriter fileWriter=null;
        File file3= new File("D:\\OneDrive\\1.txt");
        if(file3.exists()==false){
            try {
                file3.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            fileWriter=new FileWriter(file3);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        File file = new File("D:\\OneDrive\\");
        if(file.listFiles()!=null){
            for (File file1 : file.listFiles()){
                try {
                    fileWriter.write(file1.getName());
                    fileWriter.write("\r\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(file1);
                if(file1.listFiles()!=null){
                    for(File file2 : file1.listFiles()){
                        try {
                            fileWriter.write("    "+file2.getName());
                            fileWriter.write("\r\n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
