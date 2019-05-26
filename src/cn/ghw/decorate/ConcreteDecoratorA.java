package cn.ghw.decorate;

/**
 * @Author: ghwei
 * @Date: 2019/5/3 15:12
 * @Description:装饰者模式2
 */
interface Component {

    public void sampleOperation();

}

class ConcreteComponent implements Component {

    public ConcreteComponent(){
        System.out.println("ConcreteComponent构造方法");
    }

    @Override
    public void sampleOperation() {
        // 写相关的业务代码
        System.out.println("业务代码");
    }
}

class Decorator implements Component{
    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void sampleOperation() {
        System.out.println("傻逼");
        // 委派给构件
        component.sampleOperation();
    }
}

class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        // 写相关的业务代码
        System.out.println("业务代码1");
        super.sampleOperation();
        // 写相关的业务代码
        System.out.println("业务代码2");
    }
}

class Test2{
    public static void main(String[] args) {
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(new Decorator(new ConcreteComponent()));
        concreteDecoratorA.sampleOperation();
    }
}