package org.example;

public class Main {
    public static void main(String[] args) throws Exception {

        Q3 lists = new Q3();
        lists.FillArr();
        long start = System.nanoTime();

        lists.perebor(1);

        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Прошло времени, нс: " + elapsed);
        start = System.nanoTime();
        lists.binarySearch1(lists.list, 1, 0, lists.list.size());

        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("Прошло времени, нс: " + elapsed);
    }
}