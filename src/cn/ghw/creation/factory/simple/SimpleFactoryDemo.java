package cn.ghw.creation.factory.simple;

import cn.ghw.creation.factory.pojo.Cat;
import cn.ghw.creation.factory.pojo.Dog;

/**
 * @Author: ghwei
 * @Date: 2019/5/6 23:01
 * @Description:
 */
public class SimpleFactoryDemo {

    public static void main(String[] args) {
        SimpleAnimalFactory simpleAnimalFactory = new SimpleAnimalFactory();
        simpleAnimalFactory.createAnimal("dog").eat();
        simpleAnimalFactory.createAnimal("cat").eat();

        Cat c = simpleAnimalFactory.createCat();
        c.eat();
        Dog d = simpleAnimalFactory.createDog();
        d.eat();
    }
}
