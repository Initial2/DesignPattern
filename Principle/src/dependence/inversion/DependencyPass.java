package dependence.inversion;

import org.junit.jupiter.api.Test;

/**
 *
 * 依赖传递的三种方式
 * @author initial
 * @CreateTime 2021/6/16:16:29
 */
public class DependencyPass {
    @Test
    public void testDependency(){
        Haier haier = new Haier();
        Open open = new Open();
        open.opened(haier);
    }

}

//方式1： 接口传递

interface TV{
    void play();
}

interface OpenAndClose{
    void opened(TV tv);
}

class Open implements OpenAndClose{
    @Override
    public void opened(TV tv) {
       tv.play();
    }
}

class Haier implements TV{
    @Override
    public void play() {
        System.out.println("海尔电视打开");
    }
}