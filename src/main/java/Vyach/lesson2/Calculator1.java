package Vyach.lesson2;

import java.util.Scanner;

public class Calculator1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        double a = Double.parseDouble(scanner.nextLine());
        char op = scanner.nextLine().charAt(0);
        System.out.print("Введите второе число: ");
        double b = Double.parseDouble(scanner.nextLine());
            switch (op) {
                    case '+' : {System.out.println(a + " + " + b + " = " + plus(a, b));  break;}
                    case '-' : {System.out.println(a + " - " + b + " = " + minus(a, b)); break;}
                    case '*' : {System.out.println(a + " * " + b + " = " + multiply(a, b)); break;}
                    case '/' : {System.out.println(a + "/" + b + " = " + divide(a, b)); break;}
                    default: {System.out.println("Некорректный ввод. Повторите попытку.");}
            }
        scanner.close();
    }
    public static double plus(double a, double b) {return a + b;}
    public static double minus(double a, double b) {return a - b;}
    public static double multiply(double a, double b) {return a * b;}
    public static double divide(double a, double b) {
        if (b != 0) {
             return a / b;
        } else {
             return -1;
    }

}

}

