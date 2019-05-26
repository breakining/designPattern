package cn.ghw.dutyChain;

/**
 * @Author: ghwei
 * @Date: 2019/5/26 11:22
 * @Description:
 */
public class CarTailHandler extends Handler {
    @Override
    public void productCar() {
        System.out.println("生产车尾");
        if(null != super.carHandler){
            super.carHandler.productCar();
        }
    }
}
