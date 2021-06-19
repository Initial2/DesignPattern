package prototype.shallowcopy;

/**
 * @author initial
 * @CreateTime 2021/6/19:16:35
 */
public class Sheep implements Cloneable {
    private int age;
    private String name;
    private String colors;
    private Sheep friend ;
    public Sheep(int age, String name, String colors) {
        this.age = age;
        this.name = name;
        this.colors = colors;
    }
    
    public Sheep getFriend() {
        return friend;
    }
    
    public void setFriend(Sheep friend) {
        this.friend = friend;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getColors() {
        return colors;
    }
    
    public void setColors(String colors) {
        this.colors = colors;
    }
    
    @Override
    public String toString() {
        return "Sheep{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", colors='" + colors + '}';
    }
    
    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        return (Sheep) super.clone();
    }
}
