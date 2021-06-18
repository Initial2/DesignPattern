package simplefactory.improve;



/**
 * @author initial
 * @CreateTime 2021/6/18:20:24
 */
public class SimpleFactory {
    
    /**
     * 根据传入的披萨类型，定做对应的披萨
     * @return Pizza 返回定做的Pizza
     */
    public static Pizza createPizza(String type){
        if ("greek".equals(type)) {
           return new GreekPizza();
        } else if ("cheese".equals(type)) {
            return new CheesePizza();
        } else if ("pepper".equals(type)) {
            return new PepperPizza();
        }else {
            return null;
        }
        
    }
    
}
