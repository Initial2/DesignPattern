package decorator;

/**
 * @author initial
 * @CreateTime 2021/6/23:20:03
 */
public class Milk  extends  Decorator{
    
    public Milk(Drink drink) {
        super(drink);
        this.setDescription("牛奶");
        this.setPrice(3);
    }
    
    
  
    
    
    
    
}
