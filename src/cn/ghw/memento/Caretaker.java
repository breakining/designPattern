package cn.ghw.memento;

/**
 * @Author: ghwei
 * @Date: 2019/5/19 19:33
 * @Description:
 */
public class Caretaker {
    private PersonMemento personMemento;

    public PersonMemento getPersonMemento() {
        return personMemento;
    }

    public Caretaker setPersonMemento(PersonMemento personMemento) {
        this.personMemento = personMemento;
        return this;
    }
}
