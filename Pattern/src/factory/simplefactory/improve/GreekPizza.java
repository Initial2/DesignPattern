package factory.simplefactory.improve;

/**
 * @author initial
 * @CreateTime 2021/6/18:20:14
 */
public class GreekPizza  extends Pizza {
    @Override
    public void prepare() {
        this.name = "Greek";
        System.out.println("正在为希腊披萨准备材料");
    }
}

