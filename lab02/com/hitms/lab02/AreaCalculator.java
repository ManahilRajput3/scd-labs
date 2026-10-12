package com.hitms.lab02;

/**
 * Calculates the area of simple shapes.
 */
public final class AreaCalculator {

    /** Length of the sample rectangle used by the demo. */
    private static final int SAMPLE_LENGTH = 8;

    /** Width of the sample rectangle used by the demo. */
    private static final int SAMPLE_WIDTH = 3;

    /** Not meant to be instantiated. */
    private AreaCalculator() {
    }

    /**
     * Returns the area of a rectangle.
     *
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     * @return length multiplied by width
     */
    public static int calculateArea(final int length, final int width) {
        final int area = length * width;
        return area;
    }

    /**
     * Demonstrates the renamed method.
     *
     * @param args command line arguments (unused)
     */
    public static void main(final String[] args) {
        System.out.println("Area of an 8 x 3 rectangle: "
            + calculateArea(SAMPLE_LENGTH, SAMPLE_WIDTH));
    }
}
