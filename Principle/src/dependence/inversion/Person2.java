package dependence.inversion;


import org.junit.jupiter.api.Test;

interface IReceiver{
    String getMessage();
}

class Email1 implements IReceiver{
    
    @Override
    public String getMessage() {
        return "这是一条邮件信息";
    }
}

class WeiChat implements IReceiver{
    @Override
    public String getMessage() {
        return "这是一条微信信息";
    }
}


/**
 * @author initial
 * @CreateTime 2021/6/16:16:21
 */
public class Person2 {
    
    public void getMessage(IReceiver iReceiver){
        System.out.println(iReceiver.getMessage());
    }
    
}


class Person2Test{
    @Test
    public void test(){
        Person2 person2 = new Person2();
        person2.getMessage(new Email1());
        person2.getMessage(new WeiChat());
    }
}