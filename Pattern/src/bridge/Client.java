package bridge;

import org.junit.jupiter.api.Test;

/**
 * @author initial
 * @CreateTime 2021/6/22:20:01
 */
public class Client {
    @Test
    public void testClient(){
        Style foldedPhone = new FoldedPhone(new XiaoMi());
        
        foldedPhone.start();
        foldedPhone.call();
        foldedPhone.shutdown();
    }
}
