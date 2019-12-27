package com.company;

public class Book {
    public String author;
    public String title;
    public int yearOfPub;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearOfPub(int yearOfPub) {
        this.yearOfPub = yearOfPub;
    }

    public int getYearOfPub() {
        return yearOfPub;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Book(){
        this.author = "";
        this.title = "";
        this.yearOfPub = 0;
    }

    public Book(String author, String title, int yearOfPub){
        this.author = author;
        this.title = title;
        this.yearOfPub = yearOfPub;
    }

    @Override
    public String toString() {
        return "Информация по данной книге:\n" + "\tАвтор - " + author + "\n\tНазвание - " + title + "\n\tГод издания - " + yearOfPub;
    }
}
