package adapter.classadapter;

import org.junit.jupiter.api.Test;

/**
 * @author initial
 * @CreateTime 2021/6/22:16:34
 */
public class Cilent {
    @Test
    public void test(){
        Phone phone = new Phone();
        
        phone.charge(new VoltageAdapter());
    }
}
