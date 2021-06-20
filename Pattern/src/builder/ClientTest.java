package builder;

import org.junit.jupiter.api.Test;

/**
 * @author initial
 * @CreateTime 2021/6/20:17:39
 */
public class ClientTest {
    @Test
    public void testClient(){
        CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        HouseDirctor houseDirctor = new HouseDirctor();
        houseDirctor.setHouseBuilder(commonHouseBuilder);
    
        House house = houseDirctor.buildHouse();
        
    
    }
}
