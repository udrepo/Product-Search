package com.Ulan;

public abstract class Product {
    private int barcode;
    private double regularPrice;
    public Product(int barcode, double regularPrice) {
        this.barcode = barcode;
        this.regularPrice = regularPrice;
    }
    public int getBarcode() {
        return barcode;
    }
    public void setBarcode(int parcode) {
        this.barcode = barcode;
    }
    public double getRegularPrice() {
        return regularPrice;
    }
    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
}
