package decorator;

/**
 * @author initial
 * @CreateTime 2021/6/23:20:06
 */
public class Chocolate extends Decorator{
    
    public Chocolate(Drink drink) {
        super(drink);
        this.setDescription("巧克力");
        this.setPrice(2);
    }
    
    
}
