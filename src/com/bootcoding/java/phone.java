package com.bootcoding.java;

public class phone {

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
        phone b1=new phone();
        b1.dimensions= 75.9;
        b1.Brand="Apple";
        b1.color="Red";
        b1.Type="14Pro";
        b1.print();
    }
}
