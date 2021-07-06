package cn.ghw.dutyChain;

/**
 * @Author: ghwei
 * @Date: 2019/5/26 11:21
 * @Description:
 */
public class CarBodyHandler extends Handler {
    @Override
    public void productCar() {
        System.out.println("生产车身");
        if (null != super.carHandler) {
            super.carHandler.productCar();
        }
    }
}
