package cn.ghw.creation.factory.abstact.factory;

import cn.ghw.creation.factory.abstact.cpu.Cpu;
import cn.ghw.creation.factory.abstact.screen.Screen;

/**
 * @Author: ghwei
 * @Date: 2019/5/14 23:10
 * @Description: 抽象工厂方法模式的工厂顶层接口
 */
public interface MobileFactory {

    /**
     * 得到手机屏幕
     * @return
     */
    Screen getScreen();

    /**
     * 得到cpu
     * @return
     */
    Cpu getCpu();
}
