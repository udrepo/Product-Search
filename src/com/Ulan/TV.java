package com.Ulan;

public class TV extends Product {

    private String typeTV;
    private double screenSize;

    public TV(int barcode, double regularPrice, String typeTV, double screenSize) {
        super(barcode, regularPrice);
        this.typeTV = typeTV;
        this.screenSize = screenSize;
    }

    public double computeSalePrice(double regularPrice){
        return regularPrice*1.2;
    }


    public String getTypeTV(){
        return typeTV;
    }

    public void setTitle(String typeTV){
        this.typeTV = typeTV;
    }

    public double getScreenSize(){
        return screenSize;
    }

    public void setScreenSize(double screenSize){
        this.screenSize = screenSize;
    }
}
