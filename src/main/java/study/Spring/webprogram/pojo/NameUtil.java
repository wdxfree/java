package study.Spring.webprogram.pojo;

public class NameUtil {
    private String name;

    public String getName() {
        return name;
    }

    public NameUtil() {
        this.name=null;
    }

    public NameUtil(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NameUtil{" +
                "name='" + name + '\'' +
                '}';
    }
}
