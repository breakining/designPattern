package cn.ghw.builder.pattern;

/**
 * @Author: ghwei
 * @Date: 2019/5/26 22:00
 * @Description:
 */
public class Pelisse extends Decorator {
    @Override
    public void show(){
        System.out.println("穿T-shirt");
        super.show();
    }
}
