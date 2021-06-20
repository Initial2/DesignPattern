package builder;

/**
 * @author initial
 * @CreateTime 2021/6/20:17:31
 */
public  abstract class HouseBuilder  extends House{
    protected House house =  new House();
    
    abstract void buildBasic();
    abstract void buildWalls();
    abstract void buildRoofed();
    public House buildHouse(){
        return house;
    }
}
