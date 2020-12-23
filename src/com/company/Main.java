package com.company;

public class Main {

    public static void main(String[] args) {
        List list = new List();
        list.add(3);
        list.add(1);
        list.show();
        list.remove(1);
        list.show();
        list.addAll(7,8,9);
        list.sortByQuickSort(list.getElements(), 0, list.getElements().length - 1);
        list.show();
    }
}
