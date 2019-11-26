package Spring.usebean;

import Spring.beans.ClassBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "")
public class UseConfigurationBean {

    @Autowired@Qualifier(value = "createBeanClass")
    public ClassBean classBean;

    public void TestBean(){
        System.out.println(classBean.toString());
    }


}
