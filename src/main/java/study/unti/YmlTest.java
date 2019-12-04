package study.unti;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;

/**
 * @Author
 */
@Component
@ConfigurationProperties(prefix = "yml")
public class YmlTest {
    private List<String> list;
    private Map<String,String> map;
    private String[] array;

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }



    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
