package cn.ghw.observer;

/**
 * @Author: ghwei
 * @Date: 2019/6/2 11:27
 * @Description:
 */
public class MainClass {
    public static void main(String[] args) {
        Person person = new Person();
        person.addObserver(new MyObserver());
        person.setAge(12);
        person.setName("老宋头");
    }
}
