package decorator;

import org.junit.jupiter.api.Test;

/**
 * @author initial
 * @CreateTime 2021/6/23:20:06
 */
public class CoffeeBar {
    
    @Test
    public void testDecor(){
        Drink longBlack = new LongBlack();
        
        longBlack = new Milk(longBlack);
        longBlack = new Milk(longBlack);
        
         longBlack.cost();
        System.out.println("order 加入一份牛奶 描述 = " + longBlack.getDescription());
        
        
    }
}
