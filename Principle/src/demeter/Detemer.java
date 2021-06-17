package demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author initial
 * @CreateTime 2021/6/17:14:47
 */
public class Detemer {
}


//学校总部员工类
class Employee1 {
    private String id;
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }
}


//学院的员工类
class CollegeEmployee1 {
    private String id;
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }
}


//管理学院员工的管理类
class CollegeManager1 {
    
    //返回学院的所有员工
    public List<CollegeEmployee1> getAllEmployee() {
        List<CollegeEmployee1> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) { //这里我们增加了10个员工到 list
            CollegeEmployee1 emp = new CollegeEmployee1();
            emp.setId("学院员工id= " + i);
            list.add(emp);
        }
        return list;
    }
    
    //把打印员工的具体实现方法，封装到CollegeManager类中。 不要对外暴露
    public void printAllEmployees(){
        //获取到学院员工
        List<CollegeEmployee1> list1 = this.getAllEmployee();
        System.out.println("------------学院员工------------");
        for (CollegeEmployee1 e : list1) {
            System.out.println(e.getId());
        }
    }
}


class SchoolManager1 {
    //返回学校总部的员工
    public List<Employee1> getAllEmployee() {
        List<Employee1> list = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) { //这里我们增加了5个员工到 list
            Employee1 emp = new Employee1();
            emp.setId("学校总部员工id= " + i);
            list.add(emp);
        }
        return list;
    }
    
    //该方法完成输出学校总部和学院员工信息(id)
    void printAllEmployee(CollegeManager1 sub) {
        
        //我们只需要在这里调用打印所有学院员工的方法即可。 把具体实现的方法封装到CollegeManager中
        sub.printAllEmployees();
        
        //获取到学校总部员工
        List<Employee1> list2 = this.getAllEmployee();
        System.out.println("------------学校总部员工------------");
        for (Employee1 e : list2) {
            System.out.println(e.getId());
        }
    }
}


