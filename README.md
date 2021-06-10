# 设计模式概述

**<font color='green'>设计模式的目的：</font>**

- 编写软件过程中，程序员面临着来自 耦合性，内聚性以及可维护性，可扩展性，重用性，灵活性 等多方面的挑战，设计模式是为了让程序(软件)，具有更好的：
    1. 代码重用性 (即：相同功能的代码，不用多次编写)
    2. 可读性 (即：编程规范性, 便于其他程序员的阅读和理解)
    3. 可扩展性 (即：当需要增加新的功能时，非常的方便，称为可维护)
    4. 可靠性 (即：当我们增加新的功能后，对原来的功能没有影响)
    5. 使程序呈现高内聚，低耦合的特性



**<font color='green'>设计模式七大原则：</font>**

- **设计模式原则，其实就是程序员在编程时，应当遵守的原则，也是各种设计模 式的基础**  即：设计模式为什么这样设计的依据

- 设计模式常用的七大原则有:

    1. <font color='red'>单一职责原则</font>
    2. <font color='red'> 接口隔离原则 </font>
    3. <font color='red'>依赖倒转(倒置)</font>
    4. <font color='red'>里氏替换原则 </font>
    5. <font color='red'>开闭原则 </font>
    6. <font color='red'> 迪米特法则 </font>
    7. <font color='red'>合成复用原则</font>



# 单一职责原则

**<font color='green'>基本介绍:</font>**

- 对类来说的，<font color='red'>即一个类应该只负责一项职责</font>。

-  例如：JDBC中的DAO类。  一个UserDAO只对应数据库中User这个表。 **如果让这个UserDAO即可以对User表进行操作，还可以对其他表进行操作，那么他就违反了单一职责原则。 当我们去修改对User表的相关操作时，可能会影响到对其他表的操作**。

   这个时候我们就需要对这个类进行分解。 使它满足单一职责原则。

   


**举例：**

```java
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

```



**运行结果：**



![image-20210610144716749](Picture/image-20210610144716749.png)

很显然，这个Vehicle类违反了单一职责原则。 因为不管是汽车，飞机，轮船都可以在公路上跑是不对的。不同的交通工具应该有不同的运行方式。

**改进1：**

```java
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

```



**运行结果：**

- ![image-20210610144935192](README.assets/image-20210610144935192.png)



这种改进方法就完全遵守了单一职责原则，每个类都只负责一件事。 但是他也有弊端。

1.  我们本来的类只有一个方法，但是经过分解，现在变成了3个类3个方法。 代码量显著增加。
2. 这种分解造成了代码的臃肿。



**改进2：**

```java
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
```



![image-20210610145640063](README.assets/image-20210610145640063.png)





这种改进方法并没有在类的基础上遵守单一职责原则， 但是在方法的层面上，仍然遵守。

一个方法对应一种交通工具。 这样做的好处就是我们不用区建那么多的类。 只需要把当前类中的方法给分解成几个方法即可。

但是需要注意的是，只有逻辑足够简单，才可以在代码级别违反单一职责原则；只有类中方法数量足够少，可以在方法级别保持单一职责原则。



**总结：**

- 降低类的复杂度，一个类只负责一项职责。 
-  提高类的可读性，可维护性 
- 降低变更引起的风险 
- 通常情况下，我们应当遵守单一职责原则，<font color='red'>只有逻辑足够简单，才可以在代码级别违反单一职责原则</font>；<font color='red'>只有类中方法数量足够少，可以在方法级别保持单一职责原则</font>



# 接口隔离原则(Interface Segregation Principle)



**基本介绍：**

- <font color='red'>客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖 应该建立在最小的接口上</font>

**举例说明：**

![image-20210610190628508](README.assets/image-20210610190628508.png)



```java

public class B implements Interface1{
    
    @Override
    public void method1() {
    
    }
    
    @Override
    public void method2() {
    
    }
    
    @Override
    public void method3() {
    
    }
    
    @Override
    public void method4() {
    
    }
    
    @Override
    public void method5() {
    
    }
}

public class D  implements Interface1{
    @Override
    public void method1() {
    
    }
    
    @Override
    public void method2() {
    
    }
    
    @Override
    public void method3() {
    
    }
    
    @Override
    public void method4() {
    
    }
    
    @Override
    public void method5() {
    
    }
}


public class A {
    public void method1(Interface1 interface1){
    
    }
    public void method2(Interface1 interface1){
    
    }
    public void method3(Interface1 interface1){
    
    }
}

public class C {
    public void method1(Interface1 interface1){
    
    }
    public void method4(Interface1 interface1){
    
    }
    public void method5(Interface1 interface1){
    
    }
}
public class InterfaceTest {
    public static void main(String[] args) {
    
        A a = new A();
        a.method1(new B());
        a.method2(new B());
        a.method3(new B());
    
        C c = new C();
        c.method1(new D());
        c.method4(new D());
        c.method5(new D());
    }
}

```



A类所依赖的B这个类，他是接口interface1的实现类，实现了interface1的全部方法。 但是A这个类，只用到了interface1中的1，2，3这三个方法。

C这个类也相同。C类所依赖的D这个类，他也是接口interface1的实现类，实现了interface1的全部方法。 但是C这个类，只用到了interface1中的1，4，5这三个方法。

很显然，A和C这两个类并没有用到接口中的所有方法。但是因为接口中有这5个方法，所以B和D实现类就必须实现所有方法。

这样就违背了接口隔离原则，B和D被迫实现了根本没有必要实现得方法。



**解决方案：**

- 对当前接口interface1进行分解。

  ![image-20210610191621847](README.assets/image-20210610191621847.png)

将interface1，拆分成3个接口。 这样一来，B这个实现类只需要实现interface1和2即可满足所有要求。 D只需要实现interface1和3即可满足所有要求。

B和D都不需要去实现多余的方法。 这样一来就满足了接口隔离原则。

即： A对于B的依赖建立在最小的接口上。 C与D同理。



```java
public class B  implements Interface1,Interface2{
    @Override
    public void method1() {
    
    }
    
    @Override
    public void method2() {
    
    }
    
    @Override
    public void method3() {
    
    }
}


public class D implements Interface1,Interface3{
    @Override
    public void method1() {
    
    }
    
    @Override
    public void method4() {
    
    }
    
    @Override
    public void method5() {
    
    }
}

public class A {
    public void method1(Interface1 interface1){
    
    }
    public void method2(Interface2 interface1){
    
    }
    public void method3(Interface2 interface1){
    
    }
}

public class C {
    public void method1(Interface1 interface1){
    
    }
    public void method4(Interface3 interface2){
    
    }
    public void method5(Interface3 interface2){
    
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        
        A a = new A();
        a.method1(new B());
        a.method2(new B());
        a.method3(new B());
        
       C c = new C();
        c.method1(new D());
        c.method4(new D());
        c.method5(new D());
    }
}

```



