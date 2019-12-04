package study.Pattern.CompositePattern;


import java.util.Iterator;
import java.util.Stack;

/*
* 在看书的时候看的有些模糊，尝试着实现以下，加深以下印象。
* */
public class CompositeIterator {
    Stack stack = new Stack();

    public CompositeIterator(Iterable iterable){
        stack.push(iterable);
    }

    public Object next(){
        if (hasNext()){
            Iterator iterator =(Iterator)stack.peek();
            Tree tree =(Tree)iterator.next();
            if (tree instanceof Node){

            }
        }

        return null;

    }


    public boolean hasNext(){
        if(stack.empty()){
            return  false;
        }
        else {
            Iterator iterator = (Iterator) stack.peek();
            if(!iterator.hasNext()){
                stack.pop();
            }
            else {
                return true;
            }
            return false;//默认返回false

        }
    }
}
