package cn.ghw.observer;


import cn.ghw.builder.GenericBuilder;

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

//        Person person = GenericBuilder.of(Person::new)
//                .with(Person::setAge, 12)
//                .with(Person::setName, "老宋头")
//                .with(Person::addObserver, new MyObserver())
//                .build();
        System.out.println(person);
    }
}
