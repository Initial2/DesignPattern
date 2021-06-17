package ocp;

import org.junit.jupiter.api.Test;

/**
 * @author initial
 * @CreateTime 2021/6/17:13:52
 */
public class Ocp {
    @Test
    public void test(){
        GraphicEditor1 graphicEditor1 = new GraphicEditor1();
        graphicEditor1.draw(new Circle1());
        graphicEditor1.draw(new Triangle1());
        graphicEditor1.draw(new Rectangle1());
    }
    
    
}


abstract class Graphic{
    abstract void draw();
}


class Circle1 extends Graphic{
    @Override
    void draw() {
        System.out.println(" 绘制圆形 ");
    }
}

class Triangle1 extends Graphic{
    @Override
    void draw() {
        System.out.println(" 绘制三角形 ");
    }
}

class Rectangle1 extends Graphic{
    @Override
    void draw() {
        System.out.println(" 绘制矩形 ");
    }
}

class GraphicEditor1{
    public void draw(Graphic graphic){
        graphic.draw();
    }
}