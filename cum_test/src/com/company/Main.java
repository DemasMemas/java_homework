package com.company;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "";
        Note note = new Note("Prapor", "Prapor good");
        System.out.println("Welcome to the Prapor Bot zone");
        System.out.println("Чтобы получить список команд бота напишите Прапор Помощь");
        System.out.println("Чтобы создать заметку напишите Прапор Заметка_Название заметки_Текст заметки");
        String regex = "^[Пп]рапор .*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        char firstLetter = '0';
        int temp_id = 0;
        while (true){
            try{
                input = in.nextLine();
                pattern = Pattern.compile(regex);
                matcher = pattern.matcher(input);
                if (matcher.find()){
                    firstLetter = input.toUpperCase().toCharArray()[7];
                    if (firstLetter == 'I'){
                        note.getId();
                        continue;
                    }
                    if (firstLetter == 'П'){
                        note.botHelp();
                        continue;
                    }
                    if (firstLetter == 'У'){
                        if (input.split(" ").length >= 3){
                            temp_id = Integer.parseInt(input.split(" ")[2]);
                            note.deleteNote(temp_id);
                            System.out.println("Заметка успешно удалена");
                            continue;
                        }
                    }
                    if (firstLetter == 'И'){
                        if (input.split(" ").length >= 3){
                            temp_id = Integer.parseInt(input.split(" ")[2]);
                            note.getInfo(temp_id);
                            continue;
                        }
                    }
                    if (firstLetter == 'З'){
                        if (input.split("_").length == 3){
                            String[] noteSplitted = input.split("_");
                            note = new Note(noteSplitted[1], noteSplitted[2]);
                            continue;
                        }
                    }
                    System.out.println("Команда не распознана");
                }
            } catch(InputMismatchException ex){
                System.out.println("Вы ввели что-то не то. Попробуйте еще раз");
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Вы не ввели команду до конца");
            } catch (NullPointerException ex){
                System.out.println("Вы пытаетесь совершить действие с уже удаленной заметкой");
            }
        }

    }
}
