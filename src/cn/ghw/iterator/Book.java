package cn.ghw.iterator;

/**
 * @Author: ghwei
 * @Date: 2019/5/19 21:04
 * @Description:
 */
public class Book {
    private String ISBN;
    private String name;
    private Double price;

    public Book(String ISBN, String name, Double price) {
        this.ISBN = ISBN;
        this.name = name;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
