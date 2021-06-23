package decorator;

/**
 * @author initial
 * @CreateTime 2021/6/23:20:02
 */
public   class Decorator extends Drink {
    
    private Drink drink;
    
    public Decorator(Drink drink) {
        this.drink = drink;
    }
    
    
    @Override
    public int cost() {
        return super.getPrice() + drink.cost();
    }
}
