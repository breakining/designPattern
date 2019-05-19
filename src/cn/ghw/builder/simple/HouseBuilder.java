package cn.ghw.builder.simple;

import cn.ghw.builder.pojo.House;

/**
 * @Author: ghwei
 * @Date: 2019/5/19 11:34
 * @Description:
 */
public interface HouseBuilder {
    void mixDoor();
    void mixWall();
    void mixHousetop();
    House getHouse();
}
