package singleresponsibility1;

import org.junit.jupiter.api.Test;

/**
 * @author initial
 * @CreateTime 2021/6/10:14:51
 */
public class Vehicle3Test {
    @Test
    public  void testVehicle(){
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runRoad("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");
    }
    
}

class Vehicle2{
    public void runRoad(String vehicle) {
        System.out.println(vehicle + "在公路上跑");
    }
    
    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天上上飞");
    }
    
    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水上跑");
    }
}