package cn.ghw.factory.standard;

import cn.ghw.factory.pojo.Animal;
import cn.ghw.factory.pojo.Dog;

/**
 * @Author: ghwei
 * @Date: 2019/5/6 23:09
 * @Description:
 */
public class DogFactory implements Factory{

    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
