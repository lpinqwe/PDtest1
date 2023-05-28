package org.example;

import java.util.ArrayList;
import java.util.List;

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
}

