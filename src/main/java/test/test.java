package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
    public static void main(String[] args) {
        String[] names = new String[10];
        double[][] sroce = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.println("输入第" + (i + 1) + "学生的姓名");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                String name = bufferedReader.readLine();
                names[i] = name;

                for (int j = 0; j < 3; j++) {
                    switch (j) {
                        case 0:
                            System.out.println("请输入英语成绩");
                            break;
                        case 1:
                            System.out.println("请输入数学成绩");
                            break;
                        case 2:
                            System.out.println("请输入语文成绩");
                            break;
                        default:
                            break;
                    }
                    bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                    sroce[i][j] = Double.parseDouble(bufferedReader.readLine());


                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("请输入要排序的科目，1.英语，2 数学，3，英语");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int num = Integer.parseInt(bufferedReader.readLine());
            num=num-1;

            /*进行排序*/
            double a =0;

            for(int m=0 ;m<10;m++){
                for (int n=0;n<(10-m-1);n++){
                    if(sroce[n][num]>sroce[n+1][num]){
                        //调换分数1
                        a =sroce[n][num];
                        sroce[n][num]=sroce[n+1][num];
                        sroce[n+1][num]=a;

                        //为保证下标一直，调换一维数组
                        String name = names[n];
                        names[n]=names[n+1];
                        names[n+1]=name;

                    }
                }
            }
            for(String name :names){
                System.out.println(name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}