package me.lcardito.hackerrank.code.thirteen;

public class MyBook extends Book {
    private final int price;

    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    @Override
    void display() {
        System.out.printf("Title: %s\nAuthor: %s\nPrice: %d", title, author, price);
    }
}
