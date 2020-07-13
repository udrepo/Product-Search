package com.Ulan;

public class Book extends Product{

    protected String title;
    protected String publisher;
    protected int yearPublished;

    public Book(int barcode, double regularPrice, String title, String publisher, int yearPublished) {
       super(barcode, regularPrice);
       this.title = title;
       this.publisher = publisher;
       this.yearPublished = yearPublished;
    }

    public double computeSalePrice(double regularPrice){
        return regularPrice*0.5;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getPublisher(){
        return publisher;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public int getyearPublished(){
        return yearPublished;
    }

    public void setTitle(int yearPublished){
        this.yearPublished = yearPublished;
    }
}
