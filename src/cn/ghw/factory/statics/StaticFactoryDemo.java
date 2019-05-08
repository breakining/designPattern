package cn.ghw.factory.statics;

import cn.ghw.factory.pojo.Cat;
import cn.ghw.factory.pojo.Dog;

import java.util.Calendar;

/**
 * @Author: ghwei
 * @Date: 2019/5/6 23:01
 * @Description:
 */
public class StaticFactoryDemo {

    public static void main(String[] args) {
        StaticFactory.createAnimal("dog").eat();
        StaticFactory.createAnimal("cat").eat();
        // StaticFactory.createAnimal("horse").eat();

        Cat c = StaticFactory.createCat();
        c.eat();
        Dog d = StaticFactory.createDog();
        d.eat();
    }
}
