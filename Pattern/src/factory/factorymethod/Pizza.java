package factory.factorymethod;

/**
 * @author initial
 * @CreateTime 2021/6/18:20:09
 */
public abstract class Pizza {
    
    protected String name;
    
    public abstract void prepare();
    
    public void bake(){
        System.out.println("正在烘焙披萨");
    }
    public void cut(){
        System.out.println("正在切割披萨");
    }
    public void box(){
        System.out.println("正在打包披萨");
    }
    
}
