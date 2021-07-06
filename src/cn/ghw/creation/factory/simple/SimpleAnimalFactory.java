package cn.ghw.creation.factory.simple;

import cn.ghw.creation.factory.pojo.Animal;
import cn.ghw.creation.factory.pojo.Cat;
import cn.ghw.creation.factory.pojo.Dog;

/**
 * @Author: ghwei
 * @Date: 2019/5/6 22:56
 * @Description: 简单工厂模式下的工厂
 */
public class SimpleAnimalFactory {

    public Animal createAnimal(String type) {
        if ("dog".equals(type)) {
            return new Dog();
        } else if ("cat".equals(type)) {
            return new Cat();
        } else {
            return null;
        }
    }

    public Dog createDog() {
        return new Dog();
    }

    public Cat createCat() {
        return new Cat();
    }
}
