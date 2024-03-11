package com.example.myjavaproject.assignment2.question2;

public class Product {
    public static double VAT = 0.1;
    private int quantity;
    private double price;
    private double discount;

    public Product() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public double payment(String type, int quantity, double price, int loyalYear){
        double payment = 0;
        if (type.equals("A")){
            payment = quantity * price * (1 + VAT);
        }
        if (type.equals("B")){
            double discount = loyalYear * 0.05;
            if (discount > 0.5){
                discount = 0.5;
            }
            payment = quantity * price * (1-discount) * (1 + VAT);
        }
        if (type.equals("C")){
            payment = quantity * price * 0.5 * (1 + VAT);
        }
        return payment;
    }
}
