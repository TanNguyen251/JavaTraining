package com.company;

class Book {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void print(){
        System.out.println ("Book Title: " + title + ", Author: " + author + ", price: " + price);
    }

}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Book book1 = new Book("HellowWorld!", "Tan Nguyen", 25);
        book1.print();
    }
}
