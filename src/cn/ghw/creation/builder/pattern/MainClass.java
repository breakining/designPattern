package cn.ghw.builder.pattern;

/**
 * @Author: ghwei
 * @Date: 2019/5/26 22:02
 * @Description:
 */
public class MainClass {

    public static void main(String[] args) {
        System.out.println("Welcome to Andy.Chen Blog!" + "\n"
                + "Decorator Patterns." + "\n");

        Person mPerson = new Person("Andy");

        Sandal mSandal = new Sandal();
        Jeans mJeans = new Jeans();
        Pelisse mShirt = new Pelisse();

        mShirt.decoratorObj(mPerson);
        mJeans.decoratorObj(mShirt);
        mSandal.decoratorObj(mJeans);
        mSandal.show();
    }
}
