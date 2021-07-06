package cn.ghw.builder.simple;

import cn.ghw.builder.pojo.House;

/**
 * @Author: ghwei
 * @Date: 2019/5/19 11:42
 * @Description:
 */
public class MainCalss {

    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        HouseBuilder pingFangHouseBuilder = new PingFangHouseBuilder();
        pingFangHouseBuilder.mixDoor();
        pingFangHouseBuilder.mixWall();
        pingFangHouseBuilder.mixHousetop();
        House house = pingFangHouseBuilder.getHouse();
        System.out.println(house);
    }

    public static void test2() {
        PingFangHouseBuilder pingFangHouseBuilder = new PingFangHouseBuilder();
        HouseDirector houseDirector = new HouseDirector(pingFangHouseBuilder);
        houseDirector.mixHouse();
        House house = pingFangHouseBuilder.getHouse();
        System.out.println(house);
    }
}
