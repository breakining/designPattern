package cn.ghw.factory.pojo;

/**
 * @Author: ghwei
 * @Date: 2019/5/6 22:50
 * @Description:
 */
public class Cat implements Animal{

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
