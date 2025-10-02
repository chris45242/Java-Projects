package edu.chy;

// author: Chris Young

import java.text.NumberFormat;
import java.util.Scanner;

public class BookSaleProgramming {

    public static void main(String[] args) {
	// write your code here

        // initializing the variables
        double tax = 0;
        double totalBookPrice = 0;
        float shippingCharge = 0;
        float numberOfBooks = 0;
        double PriceofOrder = 0;

        // Read the total book price and the number of books
        Scanner in = new Scanner (System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.printf("Total price of books: ");
        totalBookPrice = in.nextFloat();
        System.out.printf("Number of books: ");
        numberOfBooks = in.nextInt();

        // newline
        System.out.printf("%n");

        // constants
        final double TAX_RATE = 0.075; // 7.5% of 1
        final float SHIPPING_CHARGE = 2;

        // computing the tax
        tax = TAX_RATE * totalBookPrice;

        // computing the shipping charge
        shippingCharge = SHIPPING_CHARGE * numberOfBooks;

        // computing the total price of the order
        PriceofOrder = totalBookPrice + tax + shippingCharge;

        // Prints the total price of the books, the amount of tax, the amount of shipping,
        // and the total amount due for the order.
        System.out.printf("%-15s%8s%n","Total Price:",currency.format(totalBookPrice));
        System.out.printf("%-15s%8s%n","Tax:",currency.format(tax));
        System.out.printf("%-15s%8s%n","Shipping:",currency.format(shippingCharge));
        System.out.printf("%-15s%8s%n","Amount due:",currency.format(totalBookPrice + tax + shippingCharge));
    }
}
