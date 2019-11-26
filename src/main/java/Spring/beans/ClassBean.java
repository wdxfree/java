package Spring.beans;

public class ClassBean {
    private String description;
    private int num;

    @Override
    public String toString() {
        return "ClassBean{" +
                "description='" + description + '\'' +
                ", num=" + num +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public ClassBean() {
        this.description="这是最初的声明,num默认为0";
        this.num=0;
    }


}
