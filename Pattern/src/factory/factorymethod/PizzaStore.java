package factory.factorymethod;

/**
 * @author initial
 * @CreateTime 2021/6/19:13:40
 */
public class PizzaStore {
    public static void main(String[] args) {
    
        String loc = "bj";
        if (loc.equals("bj")) {
            //创建北京口味的各种Pizza
            OrderBJPizza orderBJPizza = new OrderBJPizza();
            orderBJPizza.orderPizza();
        } else {
            //创建伦敦口味的各种Pizza
            OrderLDPizza orderLDPizza = new OrderLDPizza();
            orderLDPizza.orderPizza();
        }
        
    }
}
