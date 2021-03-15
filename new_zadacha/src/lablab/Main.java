package lablab;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            boolean flag = true;
            int[] simpleNumbers = new int[n];
            if (n == 2) {
                System.out.println("1 1");
            } else {
                if (n > 2){
                    simpleNumbers[0] = 1;
                    simpleNumbers[1] = 2;
                    for (int i = 3; i<n; i++){
                        flag = true;
                        for (int j = 2; j < i;j++){
                            if (i % j == 0){
                                flag = false;
                                break;
                            }
                        }
                        if (flag){
                            simpleNumbers[i] = i;
                        }
                    }
                    for (int i = 0; i<n;i++){
                        for (int j = 0; j<n;j++){
                            if (simpleNumbers[i] + simpleNumbers[j] == n){
                                System.out.println(simpleNumbers[i] + " " + simpleNumbers[j]);
                                simpleNumbers[i] = 0;
                                simpleNumbers[j] = 0;
                            }
                        }
                    }
                } else System.out.println("Введенное число < 2");
            }

        } catch (InputMismatchException exception){
            System.out.println("Вы ввели не число");
        }
    }
}
