package bridge;

/**
 * @author initial
 * @CreateTime 2021/6/22:19:57
 */
public class XiaoMi  implements Phone{
    @Override
    public void start() {
        System.out.println("小米手机开机");
    }
    
    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
    
    @Override
    public void shutdown() {
        System.out.println("小米手机关机");
    }
}
