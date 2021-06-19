package prototype.deepcopy;

import java.io.*;
import java.util.ArrayList;


/**
 * @author initial
 * @CreateTime 2021/6/19:16:35
 */
public class Sheep implements Cloneable, Serializable {
    private int age;
    private String name;
    private String colors;
    private ArrayList<String> friendList;
    
    private static final long serialVersionUID = 1231521512L;
    
    
    public ArrayList<String> getFriendList() {
        return friendList;
    }
    
    
    public void setFriendList(ArrayList<String> friendList) {
        this.friendList = friendList;
    }
    
    public Sheep(int age, String name, String colors) {
        this.age = age;
        this.name = name;
        this.colors = colors;
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
    
    //方法1. 通过重写clone()方法来实现深拷贝
    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        //1. 首先把他的基本数据类型拷贝
        Sheep sheep = (Sheep) super.clone();
        
        //2. 针对于它的引用数据类型每一个都单独处理
        sheep.friendList = (ArrayList<String>) friendList.clone();
        
        return sheep;
    }
    
    
    public Sheep deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bos = new ByteArrayOutputStream();
            //让oos把对象写出到bos这个字节数组中
            oos = new ObjectOutputStream(bos);
            
            oos.writeObject(this);
            
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
           return  (Sheep)ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (bos != null) {
                    bos.close();
                }
                if (oos != null) {
                    oos.close();
                }
    
                if (bis != null) {
                    bis.close();
                }
                if (ois != null) {
                    
                    
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        
    }
}
