package factory.absfactory;

/**
 * @author initial
 * @CreateTime 2021/6/19:14:30
 */
public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        } else if ("pepper".equals(orderType)){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}


