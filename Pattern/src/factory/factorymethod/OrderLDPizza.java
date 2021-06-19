package factory.factorymethod;

/**
 * @author initial
 * @CreateTime 2021/6/19:13:37
 */
public class OrderLDPizza extends OrderPizza{
    
    @Override
    Pizza createPizza(String orderType) {
    
        Pizza pizza = null;
        if("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new LDPepperPizza();
        }
        
        
        
        return pizza;
    }
    
    
}
