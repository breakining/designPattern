package cn.ghw.proxy;

/**
 * @Author: ghwei
 * @Date: 2019/5/27 22:44
 * @Description:
 */
public class MainClass {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
//        realSubject.sailBook();

        ProxySubject proxySubject = new ProxySubject();
        proxySubject.setRealSubject(realSubject);
        proxySubject.sailBook();
    }
}
