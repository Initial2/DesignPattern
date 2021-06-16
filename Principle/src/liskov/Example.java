package liskov;

import org.junit.jupiter.api.Test;

/**
 * @author initial
 * @CreateTime 2021/6/16:17:39
 */
public class Example {
    @Test
    public void test(){
        A a = new A();
        a.sayHello();
    }
}


class A{
    public void method(){
        System.out.println("A,B类共有的方法");
    }
    public void sayHello(){
        System.out.println("A say hello");
    }
}

class B extends A{
    @Override
    public void sayHello(){
        System.out.println("B say hello");
    }
}