package decorator;

/**
 * @author initial
 * @CreateTime 2021/6/23:20:00
 */
public class LongBlack extends Coffee{
    
    public LongBlack() {
        this.setDescription("美式咖啡");
        this.setPrice(5);
    }
    
    @Override
    public int cost() {
        return this.getPrice();
    }
    
    
}
