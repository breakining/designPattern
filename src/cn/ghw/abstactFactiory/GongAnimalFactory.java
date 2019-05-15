package cn.ghw.abstactFactiory;

/**
 * @Author: ghwei
 * @Date: 2019/5/14 23:12
 * @Description:
 */
public class GongAnimalFactory implements AnimalFactory {

    @Override
    public Animal getCat() {
        return new GongCat();
    }

    @Override
    public Animal getDog() {
        return new GongDog();
    }
}
