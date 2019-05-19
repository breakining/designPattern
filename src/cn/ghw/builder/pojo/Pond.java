package cn.ghw.builder.pojo;

/**
 * @Author: ghwei
 * @Date: 2019/5/19 12:08
 * @Description:池塘
 */
public class Pond {
    private String water;
    private String flower;
    private String fish;

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getFlower() {
        return flower;
    }

    public void setFlower(String flower) {
        this.flower = flower;
    }

    public String getFish() {
        return fish;
    }

    public void setFish(String fish) {
        this.fish = fish;
    }

    @Override
    public String toString() {
        return "Pond{" +
                "water='" + water + '\'' +
                ", flower='" + flower + '\'' +
                ", fish='" + fish + '\'' +
                '}';
    }
}
