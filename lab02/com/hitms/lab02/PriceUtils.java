package com.hitms.lab02;

/**
 * Helper methods for working with a list of item prices.
 */
public final class PriceUtils {

    /** Sample item prices (in rupees) used by the demo. */
    private static final double[] SAMPLE_PRICES = {1200.0, 450.5, 349.5};

    /** Not meant to be instantiated. */
    private PriceUtils() {
    }

    /**
     * Adds up a list of item prices.
     *
     * @param prices the item prices
     * @return the sum of all the prices
     */
    public static double total(final double[] prices) {
        double runningTotal = 0;
        for (double price : prices) {
            runningTotal += price; // add each price to the running total
        }
        return runningTotal;
    }

    /**
     * Works out the mean of a list of item prices.
     *
     * @param prices the item prices
     * @return the average price
     */
    public static double average(final double[] prices) {
        return total(prices) / prices.length;
    }

    /**
     * Demonstrates the price helpers.
     *
     * @param args command line arguments (unused)
     */
    public static void main(final String[] args) {
        System.out.println("Total price  : " + total(SAMPLE_PRICES));
        System.out.println("Average price: " + average(SAMPLE_PRICES));
    }
}
