package adapter.objectadapter;

/**
 * @author initial
 * @CreateTime 2021/6/22:16:33
 */
public class VoltageAdapter  implements IVoltage5V {
    
    private Voltage220V voltage220V;
    
    
    public void setVoltage220V(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }
    
    @Override
    public int outPut5V() {
        //转换电压操作
        int dest = voltage220V.outPut220V() / 44;
        System.out.println("当前电压为:"+dest+"伏");
        return dest;
    }
}
