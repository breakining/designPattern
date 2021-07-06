package cn.ghw.memento;

/**
 * @Author: ghwei
 * @Date: 2019/5/19 19:25
 * @Description:
 */
public class MainClass {
    public void test1() {
        Person person = new Person("lifeng", "男", 24);
        System.out.println(person.hashCode());
        //创建备忘录
        PersonMemento personMemento = person.setMemento();
        //更改person值
        person.setAge(23);
        System.out.println(person.hashCode());
        //恢复
        person = person.getMemento(personMemento);
        System.out.println(person.hashCode());
    }

    public void test2() {
        Person person = new Person("lifeng", "男", 24);
        System.out.println(person);
        //创建备忘录
        Caretaker caretaker = person.setCaretaker();
        //更改person值
        person.setAge(23);
        System.out.println(person);
        //恢复
        person = person.getMemento(caretaker);
        System.out.println(person);
    }
}
