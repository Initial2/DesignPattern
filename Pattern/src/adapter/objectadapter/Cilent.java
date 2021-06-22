package adapter.objectadapter;

import org.junit.jupiter.api.Test;

/**
 * @author initial
 * @CreateTime 2021/6/22:16:34
 */
public class Cilent {
    @Test
    public void test(){
        Phone phone = new Phone();
        VoltageAdapter voltageAdapter = new VoltageAdapter();
        voltageAdapter.setVoltage220V(new Voltage220V());
        phone.charge(voltageAdapter);
    }
}
