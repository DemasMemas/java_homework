package lab3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите первое число массива: ");
            int n_1 = in.nextInt();
            System.out.print("Введите второе число массива: ");
            int n_2 = in.nextInt();
            int nums[] = new int[(n_2 - n_1) + 1];
            int count = 0;
            for (int i = n_1; i < n_2 + 1; i++) {
                nums[count] = i;
                count++;
            }
            int sortedNums[] = new int[nums.length];
            count = 0;
            for (int i = 1; i < 7; i++) {
                int[] sortedNumsTemp = sortedCounts(i, nums);
                for (int num : sortedNumsTemp) {
                    if (num != 0) {
                        sortedNums[count] = num;
                        count++;
                    } else {
                        break;
                    }
                }
            }

            for (int num : sortedNums) {
                System.out.println(num);
            }
        } catch (InputMismatchException e){
            System.out.println("Вы ввели неверное число или не число вовсе");
        }
    }

    static int[] sortedCounts(int n, int numa[]){
        int sortedNums[] = new int[numa.length];
        int sortedCount = 0;
        for (int num : numa) {
            int count = 0;
            for (int j = 1; j < num; j++) {
                if (num % j == 0){
                    count += 1;
                }
            }
            if (count == n){
                sortedNums[sortedCount] = num;
                sortedCount++;
            }
        }
        return sortedNums;
    }
}
