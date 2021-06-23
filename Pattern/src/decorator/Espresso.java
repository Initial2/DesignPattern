package decorator;

/**
 * @author initial
 * @CreateTime 2021/6/23:20:01
 */
public class Espresso extends Coffee{
    
    public Espresso() {
        this.setDescription("意大利咖啡");
        this.setPrice(6);
    }
    
    @Override
    public int cost() {
        return this.getPrice();
    }
}
