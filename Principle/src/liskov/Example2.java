package liskov;

import org.junit.jupiter.api.Test;

/**
 * @author initial
 * @CreateTime 2021/6/16:17:52
 */
public class Example2 {
    @Test
    public void test(){
        A1 a1 = new A1();
        a1.sayHello();
        a1.method();
    
        B1 b1 = new B1();
        b1.sayHello();
        b1.method();
    }
}


class Base{
    public void method(){
        System.out.println("A,B共有的方法");
    }
}

class A1 extends Base{
    
    public void sayHello(){
        System.out.println("A1 say hello");
    }
}

class B1 extends Base {
    private A1 a1 = new A1();
    public void sayHello(){
        System.out.println("B1 say hello");
    }
    
    public void sayHello1(){
        a1.sayHello();
    }
}