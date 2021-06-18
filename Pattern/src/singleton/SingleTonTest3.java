package singleton;

/**
 * @author initial
 * @CreateTime 2021/6/18:17:06
 */
public class SingleTonTest3 {


}

class SingleTon3{
    
    //1. 创建静态变量
    private static SingleTon3 instance;
    
    //2. 私有化构造器
    private SingleTon3(){}
    
    //3. 提供一个public方法，用于获取实例.
    public static SingleTon3 getInstance(){
        if (instance == null){
            instance = new SingleTon3();
        }
        return instance;
    }
    
}