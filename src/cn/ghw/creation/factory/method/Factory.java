package cn.ghw.creation.factory.method;

import cn.ghw.creation.factory.pojo.Animal;

/**
 * @Author: ghwei
 * @Date: 2019/5/6 23:07
 * @Description: 方法工厂模式顶层接口
 */
public interface Factory {

    /**
     * 获取动物
     * @return
     */
    Animal createAnimal();
}
