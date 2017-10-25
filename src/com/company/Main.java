package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Создадим массив из 10 ячеек");
        int[] box = new int[10];
        for (int i = 0; i < box.length; i++) {
            box[i] = (int) (Math.random() * 10);
            System.out.println("box[" + i + "]=" + box[i]);
        }
        for (int i = 0; i < 5; i++) {
            int t = box[i];
            box[i] = box[9-i];
            box[9-i] = t;
        }
        System.out.println("Отсортируем ячейки снизу вверх");
        for (int i = 0; i < box.length; i++) {
            System.out.println("box[" + i + "]=" + box[i]);
        }


    }
}
