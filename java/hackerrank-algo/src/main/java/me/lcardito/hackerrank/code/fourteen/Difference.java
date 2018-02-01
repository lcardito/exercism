package me.lcardito.hackerrank.code.fourteen;

public class Difference {
    private int[] elements;
    public  int   maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        for(int i = 0; i < elements.length - 2; i++) {
            int current = elements[i];
            for(int j = i; j < elements.length; j++) {
                int next = elements[j];

                int abs = Math.abs(current - next);
                maximumDifference = abs > maximumDifference ? abs : maximumDifference;
                abs = Math.abs(next - current);
                maximumDifference = abs > maximumDifference ? abs : maximumDifference;
            }
        }
    }
}

