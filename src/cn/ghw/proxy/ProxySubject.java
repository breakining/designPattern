package cn.ghw.proxy;

import cn.ghw.proxy.dynamics.Subject;

/**
 * @Author: ghwei
 * @Date: 2019/5/27 22:40
 * @Description:
 */
public class ProxySubject implements Subject {
    private RealSubject realSubject;

    public void setRealSubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void sailBook() {
        this.deCount();
        realSubject.sailBook();
        this.send();
    }

    private void send() {
        System.out.println("赠送");
    }

    private void deCount() {
        System.out.println("打折");
    }
}
