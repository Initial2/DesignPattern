package prototype.example;

import org.junit.jupiter.api.Test;

/**
 * @author initial
 * @CreateTime 2021/6/19:16:36
 */
public class SheepTest {
    @Test
    public void test(){
        Sheep sheep1 = new Sheep(5, "tom", "white");
        
        //最原始的拷贝方式。  手动创建新的对象，属性值和源对象属性值相同
        Sheep sheep2 = new Sheep(sheep1.getAge(), sheep1.getName(), sheep1.getColors());
        Sheep sheep3 = new Sheep(sheep1.getAge(), sheep1.getName(), sheep1.getColors());
        Sheep sheep4 = new Sheep(sheep1.getAge(), sheep1.getName(), sheep1.getColors());
        Sheep sheep5 = new Sheep(sheep1.getAge(), sheep1.getName(), sheep1.getColors());
    
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
        
    }
}
