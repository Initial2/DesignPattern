package builder;

/**
 * @author initial
 * @CreateTime 2021/6/20:17:38
 */
public class HouseDirctor {

    private HouseBuilder houseBuilder;
    
    
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    
    public House buildHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.buildRoofed();
        
        return houseBuilder.buildHouse();
    }
    
}
