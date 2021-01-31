package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double alpha, betha, znamenat, chislit, result;
        int x, n, factor;
        System.out.println("Первая задача");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число Альфа: ");
        alpha = Math.toRadians(in.nextDouble());
        System.out.print("Введите число Бета: ");
        betha = Math.toRadians(in.nextDouble());
        chislit = Math.sin(alpha) + Math.cos((2 * betha) - alpha);
        znamenat = Math.cos(alpha) - Math.sin((2 * betha) - alpha);
        System.out.printf("Ответ: %.3f", chislit / znamenat);
        System.out.println("Вторая задача");
        /* (-1 ** n * x ** 2n) / !n*/
        result = 0;
        System.out.print("Введите число операций: ");
        n = in.nextInt();
        System.out.print("Введите X: ");
        x = in.nextInt();
        for (int i = 1; i < n + 1; i++){
            Factorial fact = new Factorial();
            result += (Math.pow(-1, i) * Math.pow(x, 2 * i)) / fact.getFactorial(i);
        }
        System.out.println(result);
    }
}

class Factorial{
    int fact_limit;
    Factorial(){
    }
    int getFactorial(int fact_limit){
        int fact_limit_result = 1;
        for (int i = 1; i < fact_limit + 1; i++){
            fact_limit_result *= i;
        }
        return fact_limit_result;
    }
}