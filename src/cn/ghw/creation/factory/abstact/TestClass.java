package cn.ghw.creation.factory.abstact;


import cn.ghw.creation.factory.abstact.cpu.Cpu;
import cn.ghw.creation.factory.abstact.factory.MiMobileFactory;
import cn.ghw.creation.factory.abstact.factory.MobileFactory;
import cn.ghw.creation.factory.abstact.factory.HuaWeiMobileFactory;
import cn.ghw.creation.factory.abstact.screen.Screen;

/**
 * @Author: ghwei
 * @Date: 2019/5/14 23:23
 * @Description: 测试类
 */
public class TestClass {
    public static void main(String[] args) {
        MobileFactory miMobileFactory = new MiMobileFactory();
        Cpu miCpu = miMobileFactory.getCpu();
        miCpu.calculation();
        Screen miScreen = miMobileFactory.getScreen();
        miScreen.shine();


        MobileFactory huaWeiMobileFactory = new HuaWeiMobileFactory();
        Cpu huaWeiCpu = huaWeiMobileFactory.getCpu();
        huaWeiCpu.calculation();
        Screen huaWeiScreen = huaWeiMobileFactory.getScreen();
        huaWeiScreen.shine();
    }
}
