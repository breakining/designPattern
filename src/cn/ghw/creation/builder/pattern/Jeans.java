package cn.ghw.builder.pattern;

/**
 * @Author: ghwei
 * @Date: 2019/5/26 21:59
 * @Description:
 */
public class Jeans extends Decorator {
    @Override
    public void show() {
        System.out.println("穿牛仔裤");
        super.show();
    }

}
