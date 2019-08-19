package cn.ghw.abstactFactiory;


/**
 * @Author: ghwei
 * @Date: 2019/5/14 23:23
 * @Description:
 */
public class TestClass {
    public static void main(String[] args) {
        AnimalFactory af = new GongAnimalFactory();
        Animal cat = af.getCat();
        cat.eat();
        Animal dog = af.getDog();
        dog.eat();

        AnimalFactory af2 = new MuAnimalFactory();
        cat = af2.getCat();
        cat.eat();
        dog = af2.getDog();
        dog.eat();
    }
}
