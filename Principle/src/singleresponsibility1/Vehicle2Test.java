package singleresponsibility1;

import org.junit.jupiter.api.Test;

/**
 * @author initial
 * @CreateTime 2021/6/10:14:42
 */
public class Vehicle2Test {
    @Test
    public void testVehicle() {
        RoadVehicle roadVehicle = new RoadVehicle();
        AirVehicle airVehicle = new AirVehicle();
        WaterVehicle waterVehicle = new WaterVehicle();
        roadVehicle.runRoad("汽车");
        airVehicle.runAir("飞机");
        waterVehicle.runWater("轮船");
    }
}


class RoadVehicle {
    public void runRoad(String vehicle) {
        System.out.println(vehicle + "在公路上跑");
        
    }
}

class AirVehicle {
    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天上上飞");
        
    }
}

class WaterVehicle {
    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水上跑");
        
    }
}


