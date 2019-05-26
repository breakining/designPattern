package cn.ghw.dutyChain;

/**
 * @Author: ghwei
 * @Date: 2019/5/26 11:17
 * @Description:
 */
public class CarHeadHandler extends Handler {

    @Override
    public void productCar() {
        System.out.println("生产车头");
        if(null != super.carHandler){
            super.carHandler.productCar();
        }
    }
}
