package Homework;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Написать простой класс Телефонный Справочник (с помощью HashMap), который
 * хранит в себе список фамилий и телефонных номеров.
 * В этот телефонный справочник с помощью метода add() можно добавлять записи, а
 * с помощью метода get() искать номер телефона по фамилии.
 * Следует учесть, что под одной фамилией может быть несколько телефонов (в
 * случае однофамильцев),
 * тогда при запросе такой фамилии должны выводиться все телефоны.
 *** 
 * Желательно не добавлять лишний функционал (дополнительные поля (имя,
 * отчество, адрес),
 * взаимодействие с пользователем через консоль и т.д). Консоль использовать
 * только для вывода результатов проверки телефонного справочника.
 */
public class Program {
    public static void main(String[] args) {
        
        String[] phBk = {
                "123456 Иванов",
                "321456 Васильев",
                "234561 Петрова",
                "234432 Иванов",
                "657721 Иванов",
                "612321 Семенов",
                "555321 Сидоров",
                "777321 Сидоров",
                "135321 Васильев",
                "987321 Малов",
                "644421 Дроздов",
        };
        PhoneBook phoneBook = new PhoneBook();
        for (String record : phBk) {
            String[] recordParts = record.split(" ");
            int num = Integer.parseInt(recordParts[0]);
            String sn = recordParts[1];
            phoneBook.add(sn, num);            
        }
        // хотелось бы реализовать через ввод строки с помощью сканера, но он что то чудит с кириллицей
        phoneBook.get("Иванов");
        phoneBook.get("Сидоров");
        phoneBook.get("Васильев");
        phoneBook.get("Малов");
    }
}