package Pattern.DecoratorPattern;

//继承Component 同时保存着对一个Component实例的使用
public abstract class Decorator extends Component {

    Component component;
    public abstract double operator();
}
