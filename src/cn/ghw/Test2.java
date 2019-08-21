package cn.ghw;

/**
 * @Author: ghwei
 * @Date: 2019/8/21 11:01
 * @Description:
 */
public class Test2 {

    public static enum STATUS {

        YES("1", "通过"), NO("0", "不通过");

        private String key;

        private String value;

        //该枚举的构造方法

        private STATUS(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
