package adapter.classadapter;

/**
 * @author initial
 * @CreateTime 2021/6/22:16:33
 */
public class VoltageAdapter  extends Voltage220V implements IVoltage5V{
    @Override
    public int outPut5V() {
        //转换电压操作
        int dest = outPut220V() / 44;
        System.out.println("当前电压为:"+dest+"伏");
        return dest;
    }
}
