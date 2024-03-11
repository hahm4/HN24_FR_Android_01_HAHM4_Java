package com.example.myjavaproject.assignment2.question2;

public class Main {
    public static double VAT = 0.1;

    public static void main(String[] args) {
        Customer customer = new Customer();
        Product product = new Product();
        product.setQuantity(10);
        product.setPrice(500);

        System.out.println("Customer Type: A");
        customer.setType("A");
        double bill = product.payment(customer.getType(),product.getQuantity(),product.getPrice(),0);
        System.out.println("Payment: " + bill);
        System.out.println("Revenue: " + (bill - bill * VAT));

        System.out.println("Customer Type: B");
        customer.setType("B");
        customer.setLoyalYear(3);
        bill = product.payment(customer.getType(),product.getQuantity(),product.getPrice(),customer.getLoyalYear());
        System.out.println("Payment: " + bill);
        System.out.println("Revenue: " + (bill - bill * VAT));

        System.out.println("Customer Type: C");
        customer.setType("C");
        bill = product.payment(customer.getType(),product.getQuantity(),product.getPrice(),0);
        System.out.println("Payment: " + bill);
        System.out.println("Revenue: " + (bill - bill * VAT));
    }
}
