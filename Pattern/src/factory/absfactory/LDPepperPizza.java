package factory.absfactory;

/**
 * @author initial
 * @CreateTime 2021/6/18:20:14
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        this.name = "Greek";
        System.out.println("正在为伦敦胡椒披萨准备材料");
    }
}

