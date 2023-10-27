package org.example;

// Built-in Packages
import java.util.Arrays;


// User Defined Packages
// Paketten sadece example'ı import eder
//import org.example.models.Example;
// All
// Paketteki tüm tanımlamaları import eder.
import org.example.inheritance.Animal;
import org.example.inheritance.Bird;
import org.example.inheritance.Dog;
import org.example.models.*;

// Dependencies => Projenin bağımlılıkları
import lombok.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Elimizdeki bir verinin programlama konseptleri kullanılarak
        // yönetilip ortaya bir ürün çıkarılması.

        // Best Practice => Bir konseptin kullanımının en doğru yolu

        // Değişkenler
        // RAM
        // veri_turu degisken_ismi = baslangic_degeri
        String name = "Halit"; // geçici hafıza name:Halit
        var age = 25; // variable // Bir tip belirtmek istemiyorum
        // compiler benim için otomatik yapsın.
        int days = 50;
        // değişken türünü Reference type

        System.out.println(name);
        // Mantıksal operatörler
        // == != > < >= <=
        Boolean isLoggedIn = false;
        Boolean value2 = true;
        Boolean value3 = true;
        System.out.println(isLoggedIn);

        // programın belli bir şartı yerine getirdiğinde
        // execute etmesini istediğim kodlar..
        // Bir if bloğundan bir karar çıkar
        if (isLoggedIn) // True ise
        {
            System.out.println("Giriş yapılmış..");
        } else if (value3) {
            System.out.println("3. if bloğu");
        }
        if (2 == 1 && value2) {
            System.out.println("2. if bloğu");
        } else // eğer if çalışmazsa
        {
            System.out.println("Giriş yapılmamış..");
        }


        // true || false => true
        // false || true => true
        // false || false => false

        // true && true => true
        // false && true => false
        // false && false => false

        // Main Scope


        String text = "Deneme";

        if (true) {
            // 59.satırdaki if'in scope'u (kapsamı, alanı, bloğu)
            String text1 = "Deneme";
            if (false) {
                System.out.println(text);
                System.out.println(text1);
                String text2 = "Merhaba";
            }
            System.out.println(text);
        }


        int age2 = 17;
        Boolean canRegister;
        if (age2 < 18) {
            canRegister = false;
        }else{
            canRegister = true;
        }

        if (canRegister) {
            System.out.println("Kayıt olabilir");
        } else {
            System.out.println("Kayıt olamaz.");
        }

        String[] nameArray = { "Halit","Melisa","Halil","Rıdvan" };
        // nameArray @abc

        String[] array2 = nameArray;
        // array2 @abc

        // @abc[0] = "Enes"
        array2[0] = "Enes";

        // iterasyon => tekrar

        // Stack, Heap

        // Primitive Type => boolean,integer,long,byte => Stack
        // a => 10, b=>true


        // Reference Type => class,interface,Array
        // Stack complex objeleri barındaramıyor.

        String[] array3 = Arrays.copyOf(nameArray, nameArray.length);
        System.out.println(nameArray);
        System.out.println(array3);

        array3[0]="Vedat";
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
        System.out.println("************");
        for (int i = 0; i < nameArray.length; i++) {
            System.out.println(nameArray[i]);
        }


        Integer[] numbers = {1,2,3,4};

        Integer[] copyNumbers = Arrays.copyOf(numbers, numbers.length);

        for(Integer number:numbers)
        {
            System.out.println(number);
        }
        // OOP

        // n adet instance => örnek
        Product instance1 = new Product();
        instance1.setName("Laptop");
        instance1.setUnitPrice(5000);
        instance1.applyDiscount(10);
        // instance
        Product instance2 = new Product();
        instance2.setName("Mouse");
        instance2.setUnitPrice(200);

        System.out.println("Ürün Adı: " +
                instance1.getName() +
                " Ürün fiyatı: " +
                instance1.getUnitPrice());


        // construct
        // constructor => yapıcı method
        Product product  = new Product();
        Product product1 = new Product("Deneme");
        Product product2 = new Product("Deneme 2", 500);
        System.out.println(product2.getName());

        // Packages
        // Import etmeden kullanılamaz. Çünkü farklı pakette.
        Example example = new Example();
        Sample sample = new Sample();


        // Inheritance => Kalıtım,Miras

        // SuperClass
        Animal animal = new Animal();

        // Subclasses
        Bird bird = new Bird();
        Dog dog = new Dog();


    }
}