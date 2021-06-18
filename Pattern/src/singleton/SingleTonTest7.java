package singleton;

/**
 * @author initial
 * @CreateTime 2021/6/18:17:44
 */
public class SingleTonTest7 {
}


class SingleTon7{
    //1. 私有化构造器
    private SingleTon7(){}
    
    //2. 创建一个私有的静态内部类
    private static class SingleTonInstance{
        private static final  SingleTon7 instance = new SingleTon7();
    }
    
    //3. 设置一个public方法用于获取实例
    public static SingleTon7 getInstance(){
        return SingleTonInstance.instance;
    }
    
}