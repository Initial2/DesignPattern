package factory.absfactory;

/**
 * @author initial
 * @CreateTime 2021/6/18:20:12
 */
public class BJCheesePizza  extends Pizza {
    
    @Override
    public void prepare() {
        this.name = "奶酪披萨";
        System.out.println("正在为北京奶酪披萨准备材料");
    }
}

