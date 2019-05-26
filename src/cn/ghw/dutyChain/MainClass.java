package cn.ghw.dutyChain;

/**
 * @Author: ghwei
 * @Date: 2019/5/26 11:25
 * @Description:
 */
public class MainClass {
    public static void main(String[] args) {
        Handler carHeadHandler = new CarHeadHandler();
        Handler carBodyHandler = new CarBodyHandler();
        Handler carTailHandler = new CarTailHandler();

        carHeadHandler.setNextHandler(carBodyHandler);
        carBodyHandler.setNextHandler(carTailHandler);

        carHeadHandler.productCar();

        System.out.println("-----------------------");

        carHeadHandler.setNextHandler(carBodyHandler).setNextHandler(carTailHandler);
        carHeadHandler.productCar();
    }
}
