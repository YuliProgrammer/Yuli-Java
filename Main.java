package com.protect;

import java.util.Scanner;

//10. Написать пример для демонстрации модификатра доступа `protected`.

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String name;
        int age;

        System.out.print("Введите имя вашего кота: ");
        name = in.next();
        System.out.print("Введите возраст : ");
        age = in.nextInt();
        System.out.println();

        Cats myCat = new Cats(name, age);
        myCat.WriteInfo();
    }
}
