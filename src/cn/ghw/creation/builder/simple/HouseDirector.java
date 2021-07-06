package cn.ghw.builder.simple;

/**
 * @Author: ghwei
 * @Date: 2019/5/19 11:46
 * @Description:
 */
public class HouseDirector {
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void mixHouse() {
        houseBuilder.mixHousetop();
        houseBuilder.mixWall();
        houseBuilder.mixDoor();
    }
}
