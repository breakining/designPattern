package cn.ghw.zsz;

/**
 * @Author: ghwei
 * @Date: 2019/5/3 13:26
 * @Description:
 */
public class Fruit {

    public Fruit(String name){
        System.out.println("我想吃水果:" + name);
    }
}

class Apple extends Fruit{
    public Apple(String name){
        super(name);
        System.out.println("我想吃苹果");
    }
}

class Test{
    public static void main(String[] args) {
        Apple apple = new Apple("梨");
        System.out.println(apple.hashCode());
    }
}