package lablab;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String mas = new Scanner(System.in).nextLine();
        String[] mas2 = mas.split(" ");
        for(String i : mas2)  {
            String[] splitArray = i.split("@");
            if (splitArray.length != 2 | i.split("")[0].equals("@")){
                continue;
            }
            String regex = ".*@.*";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(i);
            if (matcher.find()){
                regex = ".*@.*\\..{2,4}";
                pattern = Pattern.compile(regex);
                matcher = pattern.matcher(i);
                if(matcher.find()){
                    System.out.println("Электронная почта:");
                } else {
                    System.out.println("Локальная почта:");
                }
                System.out.println(i);
            }
        }

    }
}
