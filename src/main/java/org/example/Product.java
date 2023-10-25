package org.example;

// erişim_belirteci class class_ismi
public class Product {
    // Attribute
    // Method

    // Access Modifier => Erişim Belirleyici
    // public => tüm dış noktalardan erişime açık
    // private => sadece class içinden erişilebilir
    // ...

    public Product(String name, double unitPrice)
    {
        // this => classın kendisi
        this.name = name;
        this.unitPrice = unitPrice;
    }
    public Product(String name)
    {
        this.name = name;
    }
    public Product()
    {
        System.out.println("Yeni bir ürün üretildi..");
    }

    // Attributelar
    private String name;
    private double unitPrice;


    // getter-setter
    // okuma-yazma

    // sadece getter'i olan attributelar => read-only
    // sadece setteri olan => write-only


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() < 3)
            return;
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // void => geriye değer dönmeyem method türü
    // double
    public void applyDiscount(double priceToSubstract)
    {
        unitPrice = unitPrice - priceToSubstract;
        System.out.println(name + " ürününe " + priceToSubstract + "₺ kadar indirim yapılmıştır.");
    }

    // Method Overloading => Aynı isime farklı imza ve scope'a sahip metotlar.

}
