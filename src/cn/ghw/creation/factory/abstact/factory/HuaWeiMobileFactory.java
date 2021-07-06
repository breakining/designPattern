package cn.ghw.creation.factory.abstact.factory;

import cn.ghw.creation.factory.abstact.cpu.Cpu;
import cn.ghw.creation.factory.abstact.cpu.HuaWeiCpu;
import cn.ghw.creation.factory.abstact.screen.HuaWeiScreen;
import cn.ghw.creation.factory.abstact.screen.Screen;

/**
 * @Author: ghwei
 * @Date: 2019/5/14 23:16
 * @Description: 华为手机制造工厂
 */
public class HuaWeiMobileFactory implements MobileFactory {
    @Override
    public Screen getScreen() {
        return new HuaWeiScreen();
    }

    @Override
    public Cpu getCpu() {
        return new HuaWeiCpu();
    }
}
