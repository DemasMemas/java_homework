package lablab;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String alphabet_en = "qwertyuiopasdfghjklzxcvbnm";
        String alphabet_ru = "йцукенгшщзхъфывапролджэячсмитьбю";
        String inputwords = in.nextLine();
        String answer = "";
        for (int i = 0; i<inputwords.length();i++){
            if (alphabet_en.contains(inputwords.substring(i, i+1))){
                char[] j = inputwords.substring(i, i+1).toCharArray();
                answer += (char)(122 - ((int)j[0] - 97));
            }else{
                if (alphabet_ru.contains(inputwords.substring(i, i+1))){
                    char[] j = inputwords.substring(i, i+1).toCharArray();
                    answer += (char)(1103 - ((int)j[0] - 1072));
                } else { answer += inputwords.substring(i, i+1);
                }
            }
        }
        System.out.println(answer);
    }
}
