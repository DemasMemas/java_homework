package lablab;


import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("text.txt"))) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("text_formatted.txt"))) {
                String line;
                boolean longComm = false;
                while ((line = reader.readLine()) != null) {
                    Pattern pattern = Pattern.compile("//");
                    Matcher matcher = pattern.matcher(line);
                    StringBuilder line_formatted = new StringBuilder();
                    line_formatted.append(line);
                    if (longComm){
                        pattern = Pattern.compile("\\*/");
                        matcher = pattern.matcher(line);
                        if (matcher.find()){
                            longComm = false;
                            line_formatted.delete(0, line_formatted.length());
                        }
                    }
                    if (matcher.find()){
                        line_formatted.delete(matcher.start(), line_formatted.length());
                        if(line_formatted.length() != 0){
                            writer.write(String.valueOf(line_formatted.append("\r\n")));
                            continue;
                        }
                    } else {
                        pattern = Pattern.compile("/\\*");
                        matcher = pattern.matcher(line);
                        if (matcher.find()){
                            longComm = true;
                            line_formatted.delete(matcher.start(), line_formatted.length());
                            writer.write(String.valueOf(line_formatted.append("\r\n")));
                        }
                    }
                    if (!longComm) {
                        writer.write(String.valueOf(line_formatted.append("\r\n")));
                    }
                    line_formatted.delete(0, line_formatted.length());
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
