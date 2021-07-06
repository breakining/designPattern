package cn.ghw.module;

/**
 * @Author: ghwei
 * @Date: 2019/5/8 22:49
 * @Description:
 */
public abstract class GetTime {

    public long getTime() {
        long startTime = System.currentTimeMillis();
        code();
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    protected abstract void code();
}
