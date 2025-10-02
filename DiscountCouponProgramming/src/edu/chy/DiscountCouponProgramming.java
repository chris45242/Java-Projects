package edu.chy;

// author: Chris Young

import java.text.NumberFormat;
import java.util.Scanner;

public class DiscountCouponProgramming {

    public static void main(String[] args) {
	// write your code here

        //initialize variables
        float GroceryCost = 0;
        double CouponPercent = 0;

        // Input Scanner and Number formatter
        Scanner in = new Scanner (System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();

        // Read the cost of groceries
        System.out.print("Please enter the cost of your groceries: ");
        GroceryCost = in.nextFloat();

        // Compute the money spent and coupon percent given;
        if (GroceryCost < 10)
        {
            CouponPercent = 0;
        }
        // if money spent between $10 and $50, then coupon percent is 5.
        if (GroceryCost >= 10 && GroceryCost <= 50)
        {
            CouponPercent = .05;
        }
        // if money spent between $50 and $75, then coupon percent is 10.
        if (GroceryCost >= 50 && GroceryCost <= 75)
        {
            CouponPercent = .10;
        }
        // if money spent between $75 and $125, then coupon percent is 15.
        if (GroceryCost >= 75 && GroceryCost <= 125)
        {
            CouponPercent = .15;
        }
        // if money spent between $125 and $200, then coupon percent is 18.
        if (GroceryCost >= 125 && GroceryCost <= 200)
        {
            CouponPercent = .18;
        }
        // if money spent more than $200, then coupon percent is 20.
        if (GroceryCost > 200)
        {
            CouponPercent = .20;
        }

        // Calculations for Please pay
        double Discount = GroceryCost * CouponPercent;
        double MoneySpent = GroceryCost - Discount;

        // Prints the amount paid after the discount is applied
        System.out.printf("You earned a discount coupon of: %s (%s of your purchase)", currency.format(Discount), percent.format(CouponPercent));
        System.out.printf("%nPlease pay: %s.", currency.format(MoneySpent));
        System.out.printf(" Thank you for shopping with us!");


    }
}
