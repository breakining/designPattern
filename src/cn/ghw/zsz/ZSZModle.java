package cn.ghw.zsz;

/**
 * @Author: ghwei
 * @Date: 2019/5/3 15:12
 * @Description:装饰者模式
 */
interface Animal{

    void eat();
}

class Tiger implements Animal{

    @Override
    public void eat() {
        System.out.println("老虎吃狼1");
    }
}

class TiggerSuper implements Animal {
    Animal animal;
    public  TiggerSuper(Animal animal){
        this.animal = animal;
    }
    @Override
    public void eat() {
        System.out.println("老虎吃狼2");
        animal.eat();
    }
}

public class ZSZModle {
    public static void main(String[] args) {
        TiggerSuper tiggerSuper = new TiggerSuper(new Tiger());
        tiggerSuper.eat();
    }
}
