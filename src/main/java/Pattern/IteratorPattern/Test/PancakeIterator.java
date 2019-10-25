package Pattern.IteratorPattern.Test;

import java.util.ArrayList;
import java.util.Iterator;


public class PancakeIterator implements Iterator {
    private Iterator arrayList;


    public PancakeIterator(ArrayList arrayList){
        this.arrayList=arrayList.iterator();
    }

    public boolean hasNext() {
        return true;
    }

    public Object next() {
        return null;
    }
}
