package cn.ghw.memento;

/**
 * @Author: ghwei
 * @Date: 2019/5/19 19:11
 * @Description:
 */
public class PersonMemento {
    private String name;
    private String sex;
    private int age;

    public PersonMemento(String name, String sex, int age) {
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
}
