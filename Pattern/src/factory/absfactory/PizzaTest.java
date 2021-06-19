package factory.absfactory;

/**
 * @author initial
 * @CreateTime 2021/6/19:14:34
 */
public class PizzaTest {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza(new LDFactory());
    }
}
