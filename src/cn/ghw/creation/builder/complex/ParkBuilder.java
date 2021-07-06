package cn.ghw.builder.complex;

import cn.ghw.builder.pojo.House;
import cn.ghw.builder.pojo.Park;
import cn.ghw.builder.pojo.Pond;

/**
 * @Author: ghwei
 * @Date: 2019/5/19 12:12
 * @Description:
 */
public interface ParkBuilder {
    void makeHouse(House house);

    void makeHill(String hill);

    void makePond(Pond pond);

    public Park getPark();
}
