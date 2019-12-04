package study.io;

import java.io.*;

public class testReader {
    public static void main(String[] args) throws FileNotFoundException {

        String  test="This is apple";

        File file =new File("D:\\test.txt");
        if(file.exists()==false){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        byte[] bytes = test.getBytes();
        OutputStream outputStream = new FileOutputStream(file);
        try {
            outputStream.write(bytes);
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
