package lablab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Команды:");
        System.out.println("С ID1 ID2 - сумма Вектора_ID1 с Вектором_ID2, возвращает массив трех чисел");
        System.out.println("Р ID1 ID2 - разность Вектора_ID1 с Вектором_ID2, возвращает массив трех чисел");
        System.out.println("Д ID1 - длина Вектора_ID1, возвращает double");
        System.out.println("СП ID1 ID2 - Скалярное произведение Вектора_ID1 с Вектором_ID2, возвращает double");
        System.out.println("ВП ID1 ID2 - Векторное произведение Вектора_ID1 с Вектором_ID2, " +
                "возвращает массив трех чисел");
        System.out.println("КОС ID1 ID2 - косинус угла между Вектором_ID1 и Вектором_ID2, возвращает double");
        System.out.println("РАНД N - случайные N векторов, возвращает массив");
        System.out.println("+ x y z - создать новый вектор с координатами x, y и z соответственно");
        System.out.println("И ID1 - Информация о Векторе_ID1, только выводит");
        System.out.println(" ");
        while (true){
            try {
                VectorCommander.getCommand(in.nextLine());
            } catch (NullPointerException e){
                System.out.println("Вы не ввели команду или указали несуществующий ID");
            } catch (InputMismatchException e){
                System.out.println("Вы ввели что-то не то");
            }
        }
    }
}
