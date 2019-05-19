package cn.ghw.iterator;

import java.util.AbstractList;
import java.util.Iterator;

/**
 * @Author: ghwei
 * @Date: 2019/5/19 21:07
 * @Description:
 */
public class SelfList<E> extends AbstractList<E>{

    private E [] lists;

    // 纪录遍历的角标
    private int index;

    private transient E [] tempLists;

    @Override
    public Iterator<E> iterator(){
        return new Ite<E>();
    }

    @Override
    public int size() {
        return lists.length;
    }
    @Override
    public boolean add(E e){
        if(null == lists){
            lists  = (E [])new Object [1];
            lists[0] = e;
        }else{
            //创建一个细新的数组，将原先的数据放进去
            tempLists = (E [])new Object [lists.length + 1];
            for (int i = 0; i < lists.length; i++) {
                tempLists[i] = lists[i];
            }
            tempLists[lists.length] = e;
            //将新数组赋值
            lists = tempLists;
        }
        return true;
    }
    @Override
    public E get(int index) {
        return lists[index];
    }

    private class Ite<E> implements Iterator{

        @Override
        public boolean hasNext() {
            if(index >= lists.length){
                return false;
            }
            return true;
        }

        @Override
        public E next() {
            return (E) lists[index++];
        }
    }
}
