package cn.ghw.memento;

/**
 * @Author: ghwei
 * @Date: 2019/5/19 19:08
 * @Description:备忘录模式
 */
public class Person {
    private String name;
    private String sex;
    private int age;

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //1或者2
    public PersonMemento setMemento(){
        return new PersonMemento(name,sex,age);
    }
    //1或者2
    public Caretaker setCaretaker(){
        return new Caretaker().setPersonMemento(new PersonMemento(name,sex,age));
    }
    //3或者4
    public Person getMemento(PersonMemento personMemento){
        this.name = personMemento.getName();
        this.sex = personMemento.getSex();
        this.age = personMemento.getAge();
        return this;
    }
    //3或者4
    public Person getMemento(Caretaker caretaker){
        this.name = caretaker.getPersonMemento().getName();
        this.sex = caretaker.getPersonMemento().getSex();
        this.age = caretaker.getPersonMemento().getAge();
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
