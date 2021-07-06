package cn.ghw.builder.complex;

import cn.ghw.builder.pojo.House;
import cn.ghw.builder.pojo.Park;
import cn.ghw.builder.simple.HouseDirector;
import cn.ghw.builder.simple.PingFangHouseBuilder;

/**
 * @Author: ghwei
 * @Date: 2019/5/19 12:18
 * @Description:
 */
public class MainClass {

    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        PingFangHouseBuilder pingFangHouseBuilder = new PingFangHouseBuilder();
        HouseDirector houseDirector = new HouseDirector(pingFangHouseBuilder);
        houseDirector.mixHouse();
        House house = pingFangHouseBuilder.getHouse();

        ParkBuilder bigPakBuilder = new BigPakBuilder();
        PartDirector partDirector = new PartDirector(bigPakBuilder);
        partDirector.makePark(house, "小山", null);
        Park park = bigPakBuilder.getPark();
        System.out.println(park);
    }
}
