package cn.ghw.proxy.dynamics;

import java.lang.reflect.Proxy;

/**
 * @Author: ghwei
 * @Date: 2019/5/28 21:05
 * @Description:
 */
public class Mainclass {

    public static void main(String[] args) {
        MyHandler myHandler = new MyHandler();
        myHandler.setRealSubject(new RealSubject());
        Subject subject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(), RealSubject.class.getInterfaces(), myHandler);
        subject.sailBook();
    }
}
