package study.reflect;

/**
 * @Author
 */
public class TestClass<T> {
    private T gengeric;
    private String string;
    private Integer number;




    public TestClass() {
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "gengeric=" + gengeric +
                ", string='" + string + '\'' +
                ", number=" + number +
                '}';
    }

    public T getGengeric() {
        return gengeric;
    }

    public void setGengeric(T gengeric) {
        this.gengeric = gengeric;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
