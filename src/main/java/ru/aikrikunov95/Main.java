package ru.aikrikunov95;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner systemIn = new Scanner(System.in);
        String input = systemIn.nextLine();
        Calc calc = new Calc();
        String result = calc.run(input);
        System.out.println(result);
    }
}