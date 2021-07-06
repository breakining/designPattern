package cn.ghw.creation.factory.statics;

import cn.ghw.creation.factory.pojo.Animal;
import cn.ghw.creation.factory.pojo.Cat;
import cn.ghw.creation.factory.pojo.Dog;

/**
 * @Author: ghwei
 * @Date: 2019/5/6 22:56
 * @Description: 静态工厂模式下的工厂
 */
public class AnimalStaticFactory {
    /**
     * 私有化无参构造，为了不让外部去通过new实例化
     */
    private AnimalStaticFactory() {
    }

    public static Animal createAnimal(String type) {
        if ("dog".equals(type)) {
            return new Dog();
        } else if ("cat".equals(type)) {
            return new Cat();
        } else {
            return null;
        }
    }

    public static Dog createDog() {
        return new Dog();
    }

    public static Cat createCat() {
        return new Cat();
    }
}
