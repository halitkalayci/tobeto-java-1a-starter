package org.example;

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


    }
}