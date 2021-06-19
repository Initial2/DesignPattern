package factory.simplefactory.improve;

/**
 * @author initial
 * @CreateTime 2021/6/18:20:30
 */
public class PepperPizza extends Pizza {
    
    @Override
    public void prepare() {
        this.name = "pepper";
        System.out.println("正在为胡椒披萨准备材料");
    }
}
