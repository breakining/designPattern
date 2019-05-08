package cn.ghw.factory.standard;

import cn.ghw.factory.pojo.Animal;

/**
 * @Author: ghwei
 * @Date: 2019/5/6 23:13
 * @Description:
 */
public class FactoryDemo {
    public static void main(String[] args) {
        Factory f = new DogFactory();
        Animal animal = f.createAnimal();
        animal.eat();

        f= new CatFactory();
        animal = f.createAnimal();
        animal.eat();

    }
}
