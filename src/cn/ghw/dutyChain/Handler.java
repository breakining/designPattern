package cn.ghw.dutyChain;

/**
 * @Author: ghwei
 * @Date: 2019/5/26 11:13
 * @Description:
 */
public abstract class Handler {

    protected Handler carHandler;

    public Handler setNextHandler(Handler carHandler) {
        this.carHandler = carHandler;
        return carHandler;
    }

    public abstract void productCar();

}
