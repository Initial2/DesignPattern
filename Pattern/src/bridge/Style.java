package bridge;

/**
 * @author initial
 * @CreateTime 2021/6/22:19:57
 */
public abstract class Style {
    
    private final Phone phone;
    
    public Style(Phone phone) {
        this.phone = phone;
    }
    
    
    protected void start(){
        this.phone.start();
    }
    protected void call(){
        this.phone.call();
    }
    protected void shutdown(){
        this.phone.shutdown();
    }
}
