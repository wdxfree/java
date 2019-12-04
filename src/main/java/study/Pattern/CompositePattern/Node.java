package study.Pattern.CompositePattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Node extends Tree  {
    private ArrayList arrayList=new ArrayList();
    private String name;
    private String description;

    public void add(Tree tree){
        arrayList.add(tree);
    }

    public void remove(Tree tree){
        arrayList.remove(tree);
    }


    public Tree getChild(int i){
        return (Tree)arrayList.get(i);
    }

    public void print(){
        Iterator iterator=arrayList.iterator();
        while (iterator.hasNext()){
            Tree next = (Tree) iterator.next();
            
        }
    }

}
