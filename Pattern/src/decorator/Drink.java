package decorator;

/**
 * @author initial
 * @CreateTime 2021/6/23:19:59
 */
public abstract class Drink {
    private String description;
    private int price;
    
    
    public abstract int cost();
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
}
