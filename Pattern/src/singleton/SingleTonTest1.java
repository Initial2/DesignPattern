package singleton;

import org.junit.jupiter.api.Test;

/**
 * @author initial
 * @CreateTime 2021/6/18:16:37
 */
public class SingleTonTest1 {
    
    @Test
    public void testSingle(){
        SingleTon1 instance = SingleTon1.getInstance();
        SingleTon1 instance1 = SingleTon1.getInstance();
    
        System.out.println(instance == instance1);
    }
    
    
}


class SingleTon1{
    
    //1. 私有化构造器
    public SingleTon1(){};
    
    //2. 创建一个私有静态常量对象
    private static final SingleTon1  singleTon1 =  new SingleTon1();
    
    //3. 提供一个公共的getInstance方法，获取对象
    public static  SingleTon1 getInstance(){
        return singleTon1;
    }
}