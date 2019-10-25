package Pattern.TemplateMethod;

public class TestMain {
    public static void main(String[] args) {
        AbstractClass abstractClass =new ChildClass();
        abstractClass.process();
    }
}
