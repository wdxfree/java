package study.Pattern.AdapterPattern.Test;

import java.util.Enumeration;
import java.util.Iterator;

/*
* 作用 把Iterator 转换成为Enumeration,head first 设计模式练习,采用的对象适配器模式*/
public class Adapter implements Enumeration {

    Iterator iterator;

    //创建一个对象适配器把
    public Adapter(Iterator iterator){
        this.iterator=iterator;

    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
