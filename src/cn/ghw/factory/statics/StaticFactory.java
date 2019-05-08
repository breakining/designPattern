package cn.ghw.factory.statics;

import cn.ghw.factory.pojo.Animal;
import cn.ghw.factory.pojo.Cat;
import cn.ghw.factory.pojo.Dog;

/**
 * @Author: ghwei
 * @Date: 2019/5/6 22:56
 * @Description:
 */
public class StaticFactory {
    private StaticFactory(){}

    public static Animal createAnimal(String type){
        if("dog".equals(type)){
            return new Dog();
        }else if("cat".equals(type)){
            return new Cat();
        }else{
            return null;
        }
    }

    public static Dog createDog(){
        return new Dog();
    }
    public static Cat createCat(){
        return new Cat();
    }
}
