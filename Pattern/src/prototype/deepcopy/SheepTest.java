package prototype.deepcopy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;



/**
 * @author initial
 * @CreateTime 2021/6/19:16:46
 */
public class SheepTest {
    @Test
    public void testCopy() {
        Sheep sheep1 = new Sheep(5, "tom", "white");
        ArrayList<String> list = new ArrayList<>();
        list.add("jerry");
        list.add("Bob");
        list.add("Maria");
        
        sheep1.setFriendList(list);
        
        
        Sheep sheep2;
        Sheep sheep3;
    
        sheep2 = sheep1.deepClone();
        sheep3 = sheep1.deepClone();
    
        System.out.println(sheep1 + "\tfriend = "+ sheep1.getFriendList());
        System.out.println(sheep2+ "\tfriend = "+ sheep2.getFriendList());
        System.out.println(sheep3+ "\tfriend = "+ sheep3.getFriendList());
    
        System.out.println(sheep2.getFriendList() == sheep3.getFriendList());
    }
}
