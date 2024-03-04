package Vyach.lesson2;

import java.util.Scanner;
public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите операцию: ");
        char op = scanner.nextLine().charAt(0);
        System.out.print("Введите второе число: ");
        int b = Integer.parseInt(scanner.nextLine());
          switch (op) {
              case '+' : {
                  System.out.println(a + " + " +  b + " = " + plus(a, b));
              } break;
              case '-' : {
                  System.out.println(a + " - " +  b + " = " + minus(a, b));
              }break;
              case '*' : {
                  System.out.println(a + " * " +  b + " = " + multiply(a, b));
              }break;
              case '/' : {
                  System.out.println(a + " / " +  b + " = " + divide(a, b));
              }break;
              default: {
                  System.out.println("Не корректная операция: ");
              }break;
          }

    }
    public static int plus(int a, int b) { return a + b;
    }
    public static int minus(int a, int b){
        return a - b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static double divide(double a, double b){
        if (b!=0) {
            return a/b;
        }
        else {
            return -1;
        }

    }


}
