package cn.ghw.builder.pojo;

/**
 * @Author: ghwei
 * @Date: 2019/5/19 12:06
 * @Description:
 */
public class Park {
    private House house;
    private String hill;
    private Pond pond;

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public String getHill() {
        return hill;
    }

    public void setHill(String hill) {
        this.hill = hill;
    }

    public Pond getPond() {
        return pond;
    }

    public void setPond(Pond pond) {
        this.pond = pond;
    }

    @Override
    public String toString() {
        return "Park{" +
                "house=" + house +
                ", hill='" + hill + '\'' +
                ", pond=" + pond +
                '}';
    }
}
