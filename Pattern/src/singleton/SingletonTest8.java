package singleton;

import org.junit.jupiter.api.Test;

/**
 * @author initial
 * @CreateTime 2021/6/18:17:55
 */
public class SingletonTest8 {
    @Test
    public void testSingleton(){
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
    
        System.out.println(instance == instance1);
    }
}


enum Singleton{
    INSTANCE
}