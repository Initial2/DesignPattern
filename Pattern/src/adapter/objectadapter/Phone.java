package adapter.objectadapter;

/**
 * @author initial
 * @CreateTime 2021/6/22:16:34
 */
public class Phone {
    
    
    public void charge(IVoltage5V iVoltage5V){
        if (iVoltage5V.outPut5V() == 5){
            System.out.println("当前电压为5V，可以充电");
        }
    }
}
