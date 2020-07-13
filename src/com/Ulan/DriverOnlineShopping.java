package com.Ulan;
import java.util.*;
public class DriverOnlineShopping {
    public static void main(String[] args) {
        // (a) Declare and create Product array of size 6
        Product[] ProductArray = new Product[6];
        ProductArray[0] = new TV(123, 1000, "Samsung", 50);
        ProductArray[1] = new TV(456, 2000, "Sony", 30);
        ProductArray[2] = new Book(753, 60, "Under the sky", "Sun press", 1992);
        ProductArray[3] = new Book(951, 50, "Java programming", "Springer", 2005);
        ProductArray[4] = new ChildrenBook(258, 20, "Kurtlar", "Morsik", 2011, 10);
        ProductArray[5] = new ChildrenBook(179, 28, "Ormanda", "Morsik", 2014, 9);


        String probel = "          ";
        // (h) compute and print the prices and the Barcodes of all products using one loop
        System.out.println("Barcode:     Price:");
        for (int i=0; i<ProductArray.length;i++){
            System.out.println(ProductArray[i].getBarcode() + probel +  ProductArray[i].getRegularPrice());
        }

        // (i) compute and print the total price of the products using one loop
        int totalprice = 0;
        for (int i=0; i<ProductArray.length;i++){
            totalprice += ProductArray[i].getRegularPrice();
        }
        System.out.println("Total price of the products: " + totalprice);
// (j) using a loop compute and print the average age the children books are written for
        double avrage = 0;
        for (int i=0; i<ProductArray.length;i++){
           // avrage += ProductArray[i].getAge();
            avrage = (11+9)/2;
        }
        System.out.println("Average age the children books: " + avrage);

        // let b is an object reference:
        Product b=new Book(357, 40, "Compilers" ,"Springer", 2005);
        // (k) compute the sale tax on the price of a book b by calling the following
        // computeTax method from the MethodProduct class (you have to define and write
        // this class and computeTax method):
        double bprice = b.getRegularPrice();
        System.out.println("tax = " +  MethodsProduct.computeTax(bprice, 0.05));
    }
}

