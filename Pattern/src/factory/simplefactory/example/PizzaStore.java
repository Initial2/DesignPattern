package factory.simplefactory.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author initial
 * @CreateTime 2021/6/18:20:14
 */
public class PizzaStore {
    
    public void orderPizza(){
        //根据用户订购的种类，制作相关披萨
        do {
            String orderType = getType();
            Pizza pizza;
            if ("greek".equals(orderType)) {
                pizza = new GreekPizza();
            } else if ("cheese".equals(orderType)) {
                pizza = new CheesePizza();
            } else {
                break;
            }
            //输出pizza 制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        
        } while (true);
    }
    
    
    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader string = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            return string.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
    
}
