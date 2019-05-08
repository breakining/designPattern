package cn.ghw.factory.standard;

import cn.ghw.factory.pojo.Animal;

/**
 * @Author: ghwei
 * @Date: 2019/5/6 23:07
 * @Description:
 */
public interface Factory {

    public abstract  Animal createAnimal();
}
