package cn.ghw;

/**
 * @Author: ghwei
 * @Date: 2019/8/21 10:54
 * @Description:
 */
public enum Test1 {
    toDoMail("a", 1), chartMail("b", 2), reportMail("c", 3);

    private String tempAddr;
    private int tempAdds;

    //创建构造方法

    private Test1(String tempAddr, int tempAdds) {
        this.tempAddr = tempAddr;
        this.tempAdds = tempAdds;
    }

    public String getTempAddr() {
        return this.tempAddr;
    }

    public int getTempAdds() {
        return this.tempAdds;
    }
}
