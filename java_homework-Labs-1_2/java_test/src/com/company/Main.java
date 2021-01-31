package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            programs();
        } catch (InputMismatchException e){
            System.out.println("Неверный ввод");
        }

    }
    static void programs(){
        double alpha, betha, znamenat, chislit, result, x, n;
        System.out.println("Первая задача");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число Альфа: ");
        alpha = Math.toRadians(in.nextDouble());
        System.out.print("Введите число Бета: ");
        betha = Math.toRadians(in.nextDouble());
        chislit = Math.sin(alpha) + Math.cos((2 * betha) - alpha);
        znamenat = Math.cos(alpha) - Math.sin((2 * betha) - alpha);
        System.out.printf("Ответ: %.3f \n", chislit / znamenat);
        System.out.println("Вторая задача");
        /* (-1 ** n * x ** 2n) / !n*/
        result = 0;
        System.out.print("Введите число операций: ");
        n = in.nextDouble();
        System.out.print("Введите X: ");
        x = in.nextDouble();
        for (int i = 0; i < n; i++){
            result += (Math.pow(-1, i) * Math.pow(x, 2 * i)) / Factorial.getFactorial(i);
        }
        System.out.println(result);
    }
}

