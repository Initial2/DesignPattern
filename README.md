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

接口 Interface1对于类A和类C来说都不是最小接口，这样就违背了接口隔离原则，B和D被迫实现了根本没有必要实现得方法。



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





# 依赖倒转原则(Dependence Inversion Principle)

**基本介绍：**

- 高层模块不应该依赖低层模块，二者都应该依赖其抽象。
- 抽象不应该依赖细节，细节应该依赖抽象
  - <font color='red'>接口(抽象类)不应该依赖它的实现类，它的实现类应该依赖接口(抽象类)</font>
- 依赖倒转(倒置)的中心思想是面向接口编

**在java中，<font color='red'>抽象 指的是接口或抽象类</font>，<font color='red'>细节就是具体的实现类</font>**

​	![img](README.assets/Dependency_inversion.png)

**举例说明：**

- 假如有一个Person类，他有接收消息的功能。

  <font color='green'>方式1：</font>

  ```java
  
  class Email {
      public String getMessage(){
          return "这是一条邮件消息";
      };
  }
  
  public class Person1 {   
      public void receiver(Email email){
          System.out.println(email.getMessage());
      }
      
  }
  
  class Person1Test{
      @Test
      public void test1(){
          Person1 person1 = new Person1();
          person1.receiver(new Email());
      }
  }
  ```

  这种方法比较简单，能够最先想到。  但是他有一些缺点。  如果我们获取的对象是 微信，短信等等，则需要新增类，同时Person1也要增加相应的接收方法



​	<font color='green'>方法2：</font>

解决思路：引入一个抽象的接口IReceiver, 表示接收者, 让Person类与接口IReceiver发生依赖

因为Email, WeiXin 等等属于接收的范围，他们各自实现IReceiver 接口就ok, 这样我们就符合依赖倒转原则

```java
interface IReceiver{
    String getMessage();
}

class Email1 implements IReceiver{   
    @Override
    public String getMessage() {
        return "这是一条邮件信息";
    }
}

class WeiChat implements IReceiver{
    @Override
    public String getMessage() {
        return "这是一条微信信息";
    }
}


public class Person2 {   
    //这里我们是对接口的依赖
    public void getMessage(IReceiver iReceiver){
        System.out.println(iReceiver.getMessage());
    }    
}

class Person2Test{
    @Test
    public void test(){
        Person2 person2 = new Person2();
        person2.getMessage(new Email1());
        person2.getMessage(new WeiChat());
    }
}
```

此方法，当我们想要添加新的发送消息工具时，根本不需要修改Person类。 只需要添加IReceiver接口的实现类即可。 

然后将实现类的对象作为参数传递给Person类`getMessage()`方法即可。 



### 依赖关系传递的三种方式

1. **接口传递** 

2. **构造方法传递** 

3. **setter方式传递**

   

**接口传递：**

```java
//方式1： 接口传递
interface TV{
    void play();
}

interface OpenAndClose{
    void opened(TV tv);
}

class Open implements OpenAndClose{
    //通过在接口中给我传入一个接口，来实现对接口的依赖。 
    @Override
    public void opened(TV tv) {
       tv.play();
    }
}


class Haier implements TV{
    //海尔电视实现了TV接口。 所以它有打开方法
    @Override
    public void play() {
        System.out.println("海尔电视打开");
    }
}

public class DependencyPass {
    @Test
    public void testDependency(){
        Haier haier = new Haier();
        Open open = new Open();
        open.opened(haier);
    }

}
```



**构造方法传递：**

```java
interface TV2{
    void play();
}

interface OpenAndClose2{
    void open();
}

class Open2 implements OpenAndClose2{
    TV2 tv;
    //通过构造方法来传入一个接口，实现对接口的依赖
    public Open2(TV2 tv2){
        this.tv = tv2;
    }
    
    @Override
    public void open() {
        this.tv.play();
    }
    
}

class SkyWorth implements TV2{
    @Override
    public void play() {
        System.out.println("创维电视打开");
    }
}

public class DependencyPass2 {
    @Test
    public void test(){
        SkyWorth skyWorth = new SkyWorth();
        Open2 open2 = new Open2(skyWorth);
        open2.open();
    }
}

```

 

**setter方式传递：**

 与构造器传递方式类似，通过setter方法。

```java 
interface TV3{
    void play();
}

interface OpenAndClose3{
    void open();
}

class Open3 implements OpenAndClose3{
    TV3 tv;
    
    //与第二种方式相比，把构造器换成了setter方法。 
    public void setTv(TV3  tv3){
        this.tv = tv3;
    }
    
    @Override
    public void open() {
        this.tv.play();
    }
    
}

class XiaoMI implements TV3{
    @Override
    public void play() {
        System.out.println("小米电视打开");
    }
}

public class DependencyPass3 {
    @Test
    public  void  testing(){
        XiaoMI xiaoMI = new XiaoMI();
        Open3 open3 = new Open3();
        open3.setTv(xiaoMI);
        open3.open();
    }
}
```



### 依赖倒转原则的注意事项和细节

- 低层模块尽量都要有抽象类或接口，或者两者都有，程序稳定性更好. 
  - 如果A类是一个子类，它的上一级最好有接口或者抽象类。 不要孤零零的放置一个类。 
- 变量的声明类型尽量是抽象类或接口, 这样我们的变量引用和实际对象间，就存在 一个缓冲层，利于程序扩展和优化 
  - 当我们想要添加新的功能时，不需要直接去修改对应的类，只需要提供新的接口(抽象类)得实现类作为参数传递给他即可。
- 继承时遵循里氏替换原则







# 里氏替换原则(Liskov Substitution Principle)

**OO中的继承性的思考和说明：**

-  继承包含这样一层含义：父类中凡是已经实现好的方法，实际上是在设定规范和契
  约，虽然它不强制要求所有的子类必须遵循这些契约，但是如果子类对这些已经实
  现的方法任意修改，就会对整个继承体系造成破坏。
- 继承在给程序设计带来便利的同时，也带来了弊端。如果一个类被其他的类所继承，
  则当这个类需要修改时，必须考虑到所有的子类，并且父类修改后，所有涉及到子
  类的功能都有可能产生故障

**基本介绍：**

- 里氏替换原则(Liskov Substitution Principle)在1988年，由麻省理工学院的以为姓里 的女士提出的。

- 该原则规定 在使用继承时，<font color='red'>在子类中可以扩展父类的功能，但是尽量不要重写父类的方法</font>。

- 如果有2个类 A和B， B类继承A类。 那么在所有用到A类对象的地方，都可以用B类对象来替换。 **这就是里氏替换原则的完美状态。**

  - 因为要求是在所有地方，所以如果想要达到此效果，B类就不能修改A类中的任何方法。

  例：

  ```java
  class A{
      public void sayHello(){
          System.out.println("hello");
      }
  }
  
  class B extends A{
  
  }
  
  public class Example {
      @Test
      public void test(){
          A a = new A();  
          a.sayHello();
          //如果使用B类对象来替换
          //A a = new B();
          // a.sayHello(); 所完成的效果是一样的。   
          //因为要求是在所有地方，所以如果想要达到此效果，B类就不能修改A类中的任何方法。
      }
  }
  
  
  ```

  

-  里氏替换原则告诉我们，继承实际上让两个类耦合性增强了，在适当的情况下，可以通过聚合，组合，依赖 来解决问题。

**举例说明：**

```java

class A{
    public void method(){
        System.out.println("A,B类共有的方法");
    }
    public void sayHello(){
        System.out.println("A say hello");
    }
}

//	B继承与A，并且重写了A类的sayHello( )方法。 由于没有重写method()方法， 所以B类和A类的method()是一样的
class B extends A{
    @Override
    public void sayHello(){
        System.out.println("B say hello");
    }
}
```



这样很现实并没有遵循里氏替换原则，所以我们要对其进行修改。

我们吧A和B中共有的单独抽出来放到一个新的基础类中，让A1,B1分别继承Base类。 这样A1和B1就不再是继承关系。 

```java
class Base{
    //把共有的方法单独抽出来
    public void method(){
        System.out.println("A,B共有的方法");
    }
}

class A1 extends Base{
    public void sayHello(){
        System.out.println("A1 say hello");
    }
}

class B1 extends Base{
    public void sayHello(){
        System.out.println("B1 say hello");
    }
}

```

经过这样的解耦，很显然A1和B1都遵循了里氏替换原则，因为他们都没有修改Base类中的方法。

UML图如下：

![image-20210616175746649](README.assets/image-20210616175746649.png)



如果想要在B1中访问A1的方法， 就可以通过使用组合关系，来访问A1的方法。

例：

```java
class B1 extends Base{
    //在B1中创建一个A1类对象的成员变量
    private A1 a1 = new A1();
    public void sayHello(){
        System.out.println("B1 say hello");
    }
    
    
    public void sayHello1(){
        //通过该对象即可使用A1类中的方法
        a1.sayHello();
    }
}
```

对应的UML图如下：
	![image-20210616181057234](README.assets/image-20210616181057234.png)





