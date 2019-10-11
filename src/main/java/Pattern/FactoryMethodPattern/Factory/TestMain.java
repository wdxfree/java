package Pattern.FactoryMethodPattern.Factory;

public class TestMain {
    public static void main(String[] args) {
        Creator creator =new ConcreteCreator();
        Product product =creator.factoryMethod();
        product.test();
    }
}
