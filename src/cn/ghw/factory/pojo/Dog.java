package cn.ghw.factory.pojo;

/**
 * @Author: ghwei
 * @Date: 2019/5/6 22:53
 * @Description:
 */
public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}
