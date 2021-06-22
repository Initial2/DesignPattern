package bridge;

/**
 * @author initial
 * @CreateTime 2021/6/22:19:59
 */
public class FoldedPhone  extends  Style{
    
    public FoldedPhone(Phone phone) {
        super(phone);
    }
    
    @Override
    public void start() {
        super.start();
        System.out.println("折叠样式手机");
    }
    
    @Override
    public void call() {
        super.call();
        System.out.println("折叠样式手机");
    }
    
    @Override
    public void shutdown() {
        super.shutdown();
        System.out.println("折叠样式手机");
    }
}
