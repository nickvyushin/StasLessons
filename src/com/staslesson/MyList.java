package com.staslesson;

import java.util.List;

public class MyList {

    private int[] elements;
    //количество элементов в списке
    private int size;


    public MyList(int s) {
        elements = new int[s];
        size = 0;
    }

    // получить количество элементов в списке
    public int size() {
        return size;
    }

    //добавить элемент в конец списка
    public void add(int elem) {
        elements[size] = elem;
        size++;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println("i[" + i + "]" + " = " + elements[i]);
        }
    }

    //возвращает позицию элемента или -1, если не найден
    public int indexOf(int elem) {
        //идем по эелементам
        for (int i = 0; i < size; i++) {
            //ищем искомый элемент
            if (elem == elements[i]) {
                return i;
            }

        }
        return -1;
    }

    public boolean isEmpty() {
        //проверяем пустой ли список
        //возвращаем результат
        return size == 0;
    }

    public boolean contains(int elem) {
        for (int i = 0; i < size; i++) {
            if (elem == elements[i]) {
                return true;
            }
        }
        return false;
    }

    //возвратить элемент по индексу, если такого индекса нет то кинуть IndexOutOfBoundsException
    public int get(int i) {

    }
    //очищает текущий список
    public void clear() {

    }
}
