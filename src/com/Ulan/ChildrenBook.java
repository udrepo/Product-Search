package com.Ulan;

public class ChildrenBook extends  Book{

    private int age;

    public ChildrenBook(int barcode, double regularPrice, String title, String publisher, int yearPublished, int age) {
        super(barcode, regularPrice, title, publisher, yearPublished);
        this.age = age;
    }

    public double computeSalePrice(double regularPrice){
        return regularPrice*0.25;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

}
