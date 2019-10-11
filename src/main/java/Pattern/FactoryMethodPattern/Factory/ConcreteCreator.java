package Pattern.FactoryMethodPattern.Factory;

//具体工厂类
public class ConcreteCreator extends Creator {

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }

    @Override
    public void anOperation() {

    }
}
