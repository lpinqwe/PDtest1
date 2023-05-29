package org.example;
import static java.lang.Math.abs;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public class Q3 {
    List<Integer> list = new ArrayList<>();

    public void FillArr() {
        for (int i = 0; i < 100000000; i++) {
            list.add(i);
        }
    }

    public boolean perebor(int numb) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)==numb) {
                return true;
            }
        }
        return false;
    }

    public static int binarySearch1(List<Integer> values, int valueToFind, int l, int r) {
        if (l == r) {
            return (values.get(l) == valueToFind) ? l : -1;
        }

        int m = l + (r - l) / 2;

        if (valueToFind > values.get(m)) {
            return binarySearch1(values, valueToFind, m + 1, r);
        } else if (values.get(m) > valueToFind) {
            return binarySearch1(values, valueToFind, l, m - 1);
        }
        return m;
    }
    //cos(x^5)+x^4-345.3*x-23=0
    static double f(float x) {
        double f;
        f = Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23;
        return f;
    }

    static void getN() {
        float a, b, x = 0, c, esp = 0.001f;
        a = 0;
        b = 1;
        while (abs(a - b) > esp) {
            c = (a + b) / 2;
            if (f(a) * f(c) <= 0) {
                b = c;
            } else {
                a=c;
                x=(a+b)/2;
            }
        }
        System.out.println("x= "+x+" f(x)= "+f(x));
    }
}

