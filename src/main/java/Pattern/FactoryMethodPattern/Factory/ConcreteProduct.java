package Pattern.FactoryMethodPattern.Factory;

public class ConcreteProduct extends Product {

    public ConcreteProduct(){
        this.description="ConcreteProduct";
    }

    @Override
    public void test() {
        System.out.println("创建实例成功");
    }
}
