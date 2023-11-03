package org.example.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println("Merhaba");

        // Lambda Expresssion
        // Java 8
        // (parametre) -> { }
        // Fonksiyon içerisinde başka bir aksiyon çalıştırmak, göndermek için kullanılır.
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach((x) -> { System.out.println(x); });

        //Generic
        List<String> names = new ArrayList<>();
        names.add("Halit");
        names.forEach((x)->{ System.out.println(x); });

        // STREAM API
        // Java 8
        // Koleksiyonlar (list,arrayList)
        // for döngüsü, işlem, yeni listeye ekleme
        List<Integer> newList = new ArrayList<>();
        for (Integer number:numbers) {
            newList.add(number*number);
        }
        System.out.println(newList);
        // ******* Lambda Expression *********
        List<Integer> newList2 = new ArrayList<>();
        numbers.forEach((number) -> {
            newList2.add(number * number);
        });
        System.out.println(newList2);
        // ******** Stream API **********
        List<Integer> newList3 = numbers
                .stream()
                .map((number) -> number*number)
                .toList();
        System.out.println(newList3);




        List<User> users = new ArrayList<>();
        users.add(new User(1,"Halit","Kalaycı",25)); // 1,2 - 1,3
        users.add(new User(2,"Engin","Demiroğ",30)); // 2-3
        users.add(new User(3,"İrem","Balcı",16));

        List<User> users2 = users
                .stream()
                .filter((user) -> user.getAge() > 18) // one line return keywordu gerekmez
                .toList();
        users2.forEach((user) -> System.out.println(user.getName()));

       User user = users
                .stream()
                .filter((u) -> u.getAge() > 18)
                .findFirst()
                //.orElse(new User());
                .orElseThrow(); // findFirst sonuç bulamazsa exception fırlatır
        System.out.println("Find First ile bulunan sonuç: " + user.getName());
        // ilgili filtre ile bir kayıta rastlayamabilir

        System.out.println("*********** SORTING **********");

        List<User> sortedUsers = users
                .stream()
                .sorted((user1,user2) -> Integer.compare(user1.getAge(),user2.getAge()))
                .toList();
        sortedUsers.forEach((u) -> System.out.println(u.getName()));
    }
}
