package cn.ghw.creation.factory.abstact.factory;

import cn.ghw.creation.factory.abstact.cpu.Cpu;
import cn.ghw.creation.factory.abstact.cpu.MiCpu;
import cn.ghw.creation.factory.abstact.screen.MiScreen;
import cn.ghw.creation.factory.abstact.screen.Screen;

/**
 * @Author: ghwei
 * @Date: 2019/5/14 23:12
 * @Description: 小米手机制造工厂
 */
public class MiMobileFactory implements MobileFactory {

    @Override
    public Screen getScreen() {
        return new MiScreen();
    }

    @Override
    public Cpu getCpu() {
        return new MiCpu();
    }
}
