package cn.ghw.creation.factory.method;

import cn.ghw.creation.factory.pojo.Animal;
import cn.ghw.creation.factory.pojo.Cat;

/**
 * @Author: ghwei
 * @Date: 2019/5/6 23:12
 * @Description:
 */
public class CatFactory implements Factory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
