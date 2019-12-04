package study.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Date;

/**
 * @Author  xudawei
 */
public class ReflectClass {

    public static void main(String[] args) {
        TestClass<Date> testClass = new TestClass();
        testClass.setString("test");
        testClass.setNumber(2);
        testClass.setGengeric(new Date());
        Class clazz=testClass.getClass();
        Class clazz_1 =TestClass.class;
        try {
            Class clazz_2 = Class.forName("study.reflect.TestClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }



        //获取类的属性
        Field[] fields=clazz.getDeclaredFields();

        for(Field field:fields){
            //启用或者禁用类的安全检查，设置为true的时候，表示反射对象在使用的时候，应该取消java语言的检查；设置为false则相反
            field.setAccessible(true);


            Class<?> type = field.getType();
            Type genericType = field.getGenericType();
            System.out.println("获取属性类型type+"+type);
            System.out.println("获取属性类型genericType+"+genericType);
            String name = field.getName();
            System.out.println("获取属性名"+name);
            try {
                Object o = field.get(testClass);
                System.out.println("获取对象的属性值"+o);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }


            try {
                Method method = clazz.getMethod("getNumber");
//                method.invoke( );
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
            Method[] methods =clazz.getDeclaredMethods();

        }


    }
}
