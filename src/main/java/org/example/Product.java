package org.example;

// erişim_belirteci class class_ismi
public class Product {
    // Attribute
    // Method

    // Access Modifier => Erişim Belirleyici
    // public => tüm dış noktalardan erişime açık
    // private => sadece class içinden erişilebilir
    // ...
    public String name;
    public double unitPrice;

    // void => geriye değer dönmeyem method türü
    // double
    public void applyDiscount(double priceToSubstract)
    {
        unitPrice = unitPrice - priceToSubstract;
        System.out.println(name + " ürününe " + priceToSubstract + "₺ kadar indirim yapılmıştır.");
    }
}
