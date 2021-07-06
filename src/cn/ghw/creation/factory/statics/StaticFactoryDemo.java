package cn.ghw.creation.factory.statics;

import cn.ghw.creation.factory.pojo.Cat;
import cn.ghw.creation.factory.pojo.Dog;

/**
 * @Author: ghwei
 * @Date: 2019/5/6 23:01
 * @Description:
 */
public class StaticFactoryDemo {

    public static void main(String[] args) {
        AnimalStaticFactory.createAnimal("dog").eat();
        AnimalStaticFactory.createAnimal("cat").eat();

        Cat c = AnimalStaticFactory.createCat();
        c.eat();
        Dog d = AnimalStaticFactory.createDog();
        d.eat();
    }
}
