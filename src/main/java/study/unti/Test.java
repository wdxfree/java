package study.unti;

/**
 * @Author
 */
public class Test {
    private String name;
    private Integer number;


    @Override
    public String toString() {

        return "Test{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Test(String name, Integer number) {
        this.name = name;
        this.number = number;
    }
}
