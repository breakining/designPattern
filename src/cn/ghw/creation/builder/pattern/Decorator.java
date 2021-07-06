package cn.ghw.builder.pattern;

/**
 * @Author: ghwei
 * @Date: 2019/5/26 21:57
 * @Description:
 */
public class Decorator implements Component {
    private Component component;

    public Decorator() {
        System.out.println(this.hashCode());
    }

    public void decoratorObj(Component component) {
        this.component = component;
    }

    @Override
    public void show() {
        component.show();
    }
}
