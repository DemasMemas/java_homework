package lablab;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input work mode. 0 - decoding, 1 - encoding");
		int workMode = in.nextInt();
		if (workMode == 1) encoding();
		else decoding();
    }
    static void encoding(){
		String[][] adfgvx = {
				{"", "A", "D", "F", "G", "V", "X"},
				{"A", "A", "B", "C", "D", "E", "F"},
				{"D", "G", "H", "I", "J", "K", "L"},
				{"F", "M", "N", "O", "P", "Q", "R"},
				{"G", "S", "T", "U", "V", "W", "X"},
				{"V", "Y", "Z", "1", "2", "3", "4"},
				{"X", "5", "6", "7", "8", "9", "0"}};
		String checkString = "QWERTYUIOPASDFGHJKLZXCVBNM1234567890";
		String answerString = "";
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine().toUpperCase();
		for (int i = 0; i<inputString.length();i++){
			if (checkString.contains(inputString.substring(i, i+1))){
				for (int j = 1; j<7;j++){
					for (int g = 1;g<7;g++){
						if (inputString.substring(i, i+1).equals(adfgvx[j][g])){
							answerString += adfgvx[j][0] + adfgvx[0][g];
						}
					}
				}
			} else {
				answerString += inputString.substring(i, i+1);
			}
		}
		System.out.print(answerString + "\n");
	}
	static void decoding() {
    	try {
			String[][] adfgvx = {
					{"A", "B", "C", "D", "E", "F"},
					{"G", "H", "I", "J", "K", "L"},
					{"M", "N", "O", "P", "Q", "R"},
					{"S", "T", "U", "V", "W", "X"},
					{"Y", "Z", "1", "2", "3", "4"},
					{"5", "6", "7", "8", "9", "0"}};
			String checkString = "ADFGVX";
			String answerString = "";
			Scanner in = new Scanner(System.in);
			int raw = 0;
			int col = 0;
			String inputString = in.nextLine().toUpperCase();
			if (inputString.length() < 2) return;
			for (int i = 0; i<inputString.length();i+=1){
				if (checkString.contains(inputString.substring(i, i+1))){
					switch (inputString.substring(i, i+1)){
						case "A" -> {
							raw = 0;
						}
						case "D" -> {
							raw = 1;
						}
						case "F" -> {
							raw = 2;
						}
						case "G" -> {
							raw = 3;
						}
						case "V" -> {
							raw = 4;
						}
						case "X" -> {
							raw = 5;
						}
					}
					if (checkString.contains(inputString.substring(i+1, i+2))) {
						switch (inputString.substring(i + 1, i + 2)) {
							case "A" -> {
								col = 0;
							}
							case "D" -> {
								col = 1;
							}
							case "F" -> {
								col = 2;
							}
							case "G" -> {
								col = 3;
							}
							case "V" -> {
								col = 4;
							}
							case "X" -> {
								col = 5;
							}
						}
					}
					i++;
					answerString += adfgvx[raw][col];
				} else {
					answerString += inputString.substring(i, i+1);
				}
			}
			System.out.print(answerString + "\n");
		} catch (StringIndexOutOfBoundsException ex){
			System.out.println("Вы ввели неправильно закодированные данные");
		}

	}
}
