package segregation1;

/**
 * @author initial
 * @CreateTime 2021/6/10:19:13
 */
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
