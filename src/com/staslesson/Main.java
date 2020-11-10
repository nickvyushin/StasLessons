package com.staslesson;

public class Main {

    public static void main(String[] args) {
        MyList myList = new MyList(10);
        myList.add(0);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.print();
        System.out.println("Size = " + myList.size());
        System.out.println("IndexOf = " + myList.indexOf(7));
        System.out.println("Is Empty = " + myList.isEmpty());
        System.out.println("Contains = " + myList.contains(8));
        System.out.println("Contains = " + myList.contains(3));


    }
}



