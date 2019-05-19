package cn.ghw.builder.complex;

import cn.ghw.builder.pojo.House;
import cn.ghw.builder.pojo.Pond;

/**
 * @Author: ghwei
 * @Date: 2019/5/19 12:19
 * @Description:
 */
public class PartDirector {
    private ParkBuilder parkBuilder;
    public PartDirector(ParkBuilder parkBuilder){
        this.parkBuilder = parkBuilder;
    }
    public void makePark(House house,String hill,Pond pond){
        parkBuilder.makeHill(hill);
        parkBuilder.makeHouse(house);
        parkBuilder.makePond(pond);
    }
}
