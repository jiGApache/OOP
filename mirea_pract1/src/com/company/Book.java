package com.company;

public class Book {
    private String name;
    private String author;
    private int dateOfPubl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getDateOfPubl() {
        return dateOfPubl;
    }

    public void setDateOfPubl(int dateOfPubl) {
        this.dateOfPubl = dateOfPubl;
    }

    public Book(String name, String author, int dateOfPubl) {
        this.name = name;
        this.author = author;
        this.dateOfPubl = dateOfPubl;
    }

    @Override
    public String toString() {
        return "The work of toString function:   " +
                "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", dateOfPubl=" + dateOfPubl +
                '}';
    }

    public void calcDuration(){
        System.out.println(name +" was written "+ (2019-dateOfPubl) +" years ago");
    }
}
