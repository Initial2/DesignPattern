package factory.factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author initial
 * @CreateTime 2021/6/19:13:36
 */
public abstract class OrderPizza {
    
    
    abstract Pizza createPizza(String type);
    
    public void orderPizza(){
        String type = getType();
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
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
