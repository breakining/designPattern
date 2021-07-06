package cn.ghw.proxy.dynamics;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: ghwei
 * @Date: 2019/5/28 21:05
 * @Description:
 */
public class MyHandler implements InvocationHandler {
    private RealSubject realSubject;

    public void setRealSubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        Object result = null;
        this.deCount();
        try {
            result = method.invoke(realSubject, args);
        } catch (IllegalAccessException e) {
        } catch (InvocationTargetException e) {
        }
        this.send();
        return result;
    }

    private void send() {
        System.out.println("赠送");
    }

    private void deCount() {
        System.out.println("打折");
    }
}
