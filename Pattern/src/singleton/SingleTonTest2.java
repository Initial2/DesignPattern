package singleton;

import org.junit.jupiter.api.Test;

/**
 * @author initial
 * @CreateTime 2021/6/18:16:50
 */
public class SingleTonTest2 {
    
    @Test
    public void test() {
        SingleTon2 instance = SingleTon2.getInstance();
        SingleTon2 instance1 = SingleTon2.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance);
        System.out.println(instance1);
    }
    
}


class SingleTon2 {
    
    //1. 私有化构造器
    public SingleTon2() {
    }
    
    //2. 创建一个私有静态常量
    private static final  SingleTon2 singleTon2;
    
    //3. 在静态代码块中给该对象创建出来
    static {
        singleTon2 = new SingleTon2();
    }
    
    //4. 提供一个公共的getInstance方法，获取对象
    public static SingleTon2 getInstance() {
        return singleTon2;
    }
}