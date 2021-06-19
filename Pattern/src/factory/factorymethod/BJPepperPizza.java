package factory.factorymethod;

/**
 * @author initial
 * @CreateTime 2021/6/18:20:14
 */
public class BJPepperPizza  extends Pizza {
    @Override
    public void prepare() {
        this.name = "Pepper";
        System.out.println("正在为北京胡椒披萨准备材料");
    }
}

