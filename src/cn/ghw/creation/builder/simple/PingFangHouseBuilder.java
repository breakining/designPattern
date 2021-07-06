package cn.ghw.builder.simple;

import cn.ghw.builder.pojo.House;

/**
 * @Author: ghwei
 * @Date: 2019/5/19 11:38
 * @Description:
 */
public class PingFangHouseBuilder implements HouseBuilder {

    private House house = new House();

    @Override
    public void mixDoor() {
        house.setDoor("平房--修门");
    }

    @Override
    public void mixWall() {
        house.setWall("平房--修墙");
    }

    @Override
    public void mixHousetop() {
        house.setHousetop("平房--修屋顶");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
