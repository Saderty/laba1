package com.saderty;

public class NumUtils {
    private static int NUM_OF_ACCURACY = 10;

    /*
    n : initial number;
    s1 : initial degree;
    s2 : final degree;
     */
    static String calc(double n, int s1, int s2) {
        String[] n_array = String.valueOf(n).split("\\.");

        double[] ns1_array = {0, 0};
        for (int i = 0; i < n_array[0].length(); i++) {
            ns1_array[0] += Double.parseDouble(String.valueOf(n_array[0].charAt(i))) * Math.pow(s1, n_array[0].length() - 1 - i);
        }
        for (int i = 0; i < n_array[1].length(); i++) {
            ns1_array[1] += Double.parseDouble(String.valueOf(n_array[1].charAt(i))) * Math.pow(s1, -(i + 1));
        }

        StringBuilder ns2_0 = new StringBuilder();
        int ns1_0_i = (int) ns1_array[0];
        while (ns1_0_i > 0) {
            ns2_0.append(ns1_0_i % s2);
            ns1_0_i /= s2;
        }
        ns2_0.reverse();

        double ns1_1_d = ns1_array[1];
        StringBuilder ns2_1 = new StringBuilder();
        for (int i = 0; i < NUM_OF_ACCURACY; i++) {
            ns2_1.append(String.valueOf(ns1_1_d * s2).charAt(0));
            ns1_1_d = Double.parseDouble("0" + String.valueOf(ns1_1_d * s2).substring(1));
        }

        return ns2_0 + "." + ns2_1;
    }
}
