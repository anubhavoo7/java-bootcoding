package com.bootcoding.java;

public class Mug {

    double dimensions;
    String Brand;
    String color;
    String Type;

    public void print(){
        System.out.println("Dimension: "+dimensions+"mm");

        System.out.println("Brand: "+Brand);
        System.out.println("color: "+color);
        System.out.println("Type: "+Type);
    }

    public static void main(String[] args) {
        Mug b1=new Mug();
        b1.dimensions= 15;
        b1.Brand="godraje";
        b1.color="Red";
        b1.Type="coffee";
        b1.print();
    }
}
