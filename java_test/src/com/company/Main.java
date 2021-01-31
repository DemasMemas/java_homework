package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
        for (double i = 0; i < n; i++){
            Factorial fact = new Factorial();
            result += (Math.pow(-1, i) * Math.pow(x, 2 * i)) / fact.getFactorial(i);
        }
        System.out.println(result);
    }
}

class Factorial{
    Factorial(){
    }
    double getFactorial(double fact_limit){
        double fact_limit_result = 1;
        for (int i = 1; i < fact_limit + 1; i++){
            fact_limit_result *= i;
        }
        return fact_limit_result;
    }
}