package cn.ghw.abstactFactiory;

/**
 * @Author: ghwei
 * @Date: 2019/5/14 23:16
 * @Description:
 */
public class MuAnimalFactory implements AnimalFactory {
    @Override
    public Animal getCat() {
        return new MuCat();
    }

    @Override
    public Animal getDog() {
        return new MuDog();
    }
}
