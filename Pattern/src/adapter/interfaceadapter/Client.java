package adapter.interfaceadapter;

import org.junit.jupiter.api.Test;

/**
 * @author initial
 * @CreateTime 2021/6/22:17:27
 */
public class Client {
    
    @Test
    public void testClient(){
        new AbsAdapter(){
            @Override
            public void methods1() {
                System.out.println("重写方法1");
            }
        };
        
    }
}
