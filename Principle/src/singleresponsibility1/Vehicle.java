package singleresponsibility1;

import org.junit.jupiter.api.Test;

/**
 * @author initial
 * @CreateTime 2021/6/10:14:37
 */
public class Vehicle {
    public void run(String vehicle){
        System.out.println(vehicle+"在公路上跑");
    }
}

class VehicleTest{
    @Test
    public  void testVehicle(){
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("飞机");
        vehicle.run("轮船");
    }
}