package cn.ghw.iterator;

/**
 * @Author: ghwei
 * @Date: 2019/5/19 21:23
 * @Description:
 */
public class A<T> {

    private T[] arr;

    public A(int capacity){
        arr = (T[])new Object[capacity];
        System.out.println("End");
    }
}
