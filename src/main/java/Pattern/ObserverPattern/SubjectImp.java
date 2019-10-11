package Pattern.ObserverPattern;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.List;

//观察者模式  这是一个主题
public class SubjectImp implements Subject {

    private List<Observer> list;
    private String nameStr;



    public SubjectImp(String nameStr){
        this.nameStr=nameStr;
        list=new ArrayList<>();
    }

    public void add(Observer observer){
        list.add(observer);
    }

    public void remove(Observer observer){
        list.remove(observer);
    }

    @Override
    public void notifyupdate(Object object) {
        if(list.size()>0){
           for(int i=0;i<list.size();i++){
               list.get(i).update(object);
           }
        }
    }


}
