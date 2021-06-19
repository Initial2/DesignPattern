package factory.simplefactory.example;

/**
 * @author initial
 * @CreateTime 2021/6/18:20:12
 */
public class CheesePizza  extends Pizza{
    
    @Override
    public void prepare() {
        this.name = "奶酪披萨";
        System.out.println("正在为奶酪披萨准备材料");
    }
}

