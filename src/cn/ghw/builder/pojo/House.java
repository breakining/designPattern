package cn.ghw.builder.pojo;

/**
 * @Author: ghwei
 * @Date: 2019/5/19 11:32
 * @Description: house 实体类
 */
public class House {
    private String door;
    private String wall;
    private String housetop;

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getHousetop() {
        return housetop;
    }

    public void setHousetop(String housetop) {
        this.housetop = housetop;
    }

    @Override
    public String toString() {
        return "House{" +
                "door='" + door + '\'' +
                ", wall='" + wall + '\'' +
                ", housetop='" + housetop + '\'' +
                '}';
    }
}
