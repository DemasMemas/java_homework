package com.company;
import javax.management.ObjectName;
import java.util.*;

public class Note {
    static int id;
    private int numb;
    private String name, description;
    private Date date;
    static HashMap<Integer, Note> notes = new HashMap<>();
    static{
        id = 0;
    }
    public Note(String name, String description){
        this.numb = id++;
        this.date = new Date();
        this.name = name;
        this.description = description;
        notes.put(numb, Note.this);
        System.out.println("Заметка создана. ID - " + numb);
    }


    public void getInfo(int number){
        Note noteTemp = notes.get(number);
        System.out.println("Номер заметки: " + noteTemp.numb);
        System.out.println("Название заметки: " + noteTemp.name);
        System.out.println("Текст заметки: " + noteTemp.description);
        System.out.println("Дата создания заметки: " + noteTemp.date);
    }
    public void deleteNote(int number){
        notes.remove(number);
    }

    public void botHelp() {
        System.out.println("Список команд: ");
        System.out.println("Прапор ID - если вам зачем-то нужен Id последней заметки");
        System.out.println("Прапор Помощь - вызов этой же команды. Серьезно?");
        System.out.println("Прапор Удалить ID заметки - удаление заметки");
        System.out.println("Прапор Инфо ID заметки - вывод полной информации о заметке");
        System.out.println("Прапор Заметка_Название заметки_Текст заметки - создание новой заметки. " +
                "Обязательны _ перед названием и текстом");
    }

    public void getId(){
        System.out.println(numb);
    }
}
