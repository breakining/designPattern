package cn.ghw.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: ghwei
 * @Date: 2019/6/2 11:24
 * @Description:
 */
public class MyObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        //如果对象发生变化就会调用此方法
        System.out.println("如果对象发生变化就会调用此方法");
    }
}
