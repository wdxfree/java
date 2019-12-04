package study.Pattern.CompositePattern;


//创建一个Tree 抽象类，node和leaf 都实现Tree
public abstract class Tree {


    public void remove(){
        throw new UnsupportedOperationException();
    }

    public Tree getChild(int i){
        throw new UnsupportedOperationException();
    }



}
