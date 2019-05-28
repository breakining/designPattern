package cn.ghw.proxy;

/**
 * @Author: ghwei
 * @Date: 2019/5/27 22:39
 * @Description:
 */
public class RealSubject implements Subject {
    @Override
    public void sailBook() {
        System.out.println("卖书");
    }
}
