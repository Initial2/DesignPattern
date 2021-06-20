package builder;

/**
 * @author initial
 * @CreateTime 2021/6/20:17:34
 */
public class CommonHouseBuilder  extends  HouseBuilder{
    
    @Override
    public void buildBasic() {
        System.out.println("普通房子地基打5米");
        this.setBasic(5);
    }
    
    @Override
    public void buildWalls() {
        System.out.println("普通房子批墙2CM");
        this.setWall(2);
    }
    
    @Override
    public void buildRoofed() {
        System.out.println("普通房子房顶高4米");
        this.setHigh(4);
    }
    
}
