package Pattern.AdapterPattern;

import java.util.Iterator;

//客户端需要ClassAdapter 的post方法
public class ClassClient {
    public static void main(String[] args) {
        ClassTarget classTarget=new ClassAdapter();

    }
}
