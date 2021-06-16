package dependence.inversion;

import org.junit.jupiter.api.Test;

/**
 * @author initial
 * @CreateTime 2021/6/16:16:11
 */
public class Person1 {
    
    public void receiver(Email email){
        System.out.println(email.getMessage());
    }
    
}


class Email {
    public String getMessage(){
        return "这是一条邮件消息";
    };
}


class Person1Test{
    @Test
    public void test1(){
        Person1 person1 = new Person1();
        person1.receiver(new Email());
    }
}