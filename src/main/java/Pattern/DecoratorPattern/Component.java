package Pattern.DecoratorPattern;

//抽象组件，
public abstract class Component  {
    String description="Component";

    public String getDescription() {
        return description;
    }
    public abstract double operator();


}
