package singleton;

/**
 * @author initial
 * @CreateTime 2021/6/18:17:32
 */
public class SingleTonTest6 {
}


class SingleTon6{
    
    //1. 创建静态变量
    private static volatile SingleTon6 instance;
    
    //2. 私有化构造器
    private SingleTon6(){}
    
    //3. 提供一个public方法，用于获取实例.
    public static SingleTon6 getInstance(){
        if (instance == null){
            synchronized (SingleTon6.class){
                if (instance == null ){
                    instance = new SingleTon6();
                }
            }
        }
        return instance;
    }
    
}