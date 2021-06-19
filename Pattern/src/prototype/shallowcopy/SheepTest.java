package prototype.shallowcopy;

import com.sun.source.tree.NewArrayTree;
import org.junit.jupiter.api.Test;

/**
 * @author initial
 * @CreateTime 2021/6/19:16:46
 */
public class SheepTest {
    @Test
    public void testCopy() {
        Sheep sheep1 = new Sheep(5, "tom", "white");
        sheep1.setFriend( new Sheep(4,"jerry","black"));
        
        
        Sheep sheep2 = null;
        Sheep sheep3 = null;
        Sheep sheep4 = null;
        Sheep sheep5 = null;
        try {
            sheep2 = sheep1.clone();
            sheep3 = sheep1.clone();
            sheep4 = sheep1.clone();
            sheep5 = sheep1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        
        System.out.println(sheep1 + "\tfriend = "+ sheep1.getFriend());
        System.out.println(sheep2+ "\tfriend = "+ sheep2.getFriend());
        System.out.println(sheep3+ "\tfriend = "+ sheep3.getFriend());
        System.out.println(sheep4+ "\tfriend = "+ sheep4.getFriend());
        System.out.println(sheep5+ "\tfriend = "+ sheep5.getFriend());
    
        System.out.println(sheep2.getFriend() == sheep3.getFriend());
    }
}
