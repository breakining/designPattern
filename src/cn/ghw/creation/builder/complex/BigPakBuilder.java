package cn.ghw.builder.complex;

import cn.ghw.builder.pojo.House;
import cn.ghw.builder.pojo.Park;
import cn.ghw.builder.pojo.Pond;

/**
 * @Author: ghwei
 * @Date: 2019/5/19 12:14
 * @Description:
 */
public class BigPakBuilder implements ParkBuilder {
    private Park park = new Park();

    @Override
    public void makeHouse(House house) {
        park.setHouse(house);
    }

    @Override
    public void makeHill(String hill) {
        park.setHill(hill);
    }

    @Override
    public void makePond(Pond pond) {
        park.setPond(pond);
    }

    @Override
    public Park getPark() {
        return park;
    }
}
