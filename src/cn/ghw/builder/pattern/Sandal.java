package cn.ghw.builder.pattern;

/**
 * @Author: ghwei
 * @Date: 2019/5/26 22:01
 * @Description:
 */
public class Sandal extends Decorator{
    @Override
    public void show(){
        System.out.println("穿凉鞋");
        super.show();
    }

}
