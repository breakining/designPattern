package cn.ghw.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @Author: ghwei
 * @Date: 2019/5/19 21:49
 * @Description:
 */
public class MainClass {
    public static void main(String[] args) {
        List bookList = new SelfList<Book>();
        bookList.add(new Book("123","laosu",45.34));
        bookList.add(new Book("345","yutu",45.20));

        Iterator<Book> iterator = bookList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
