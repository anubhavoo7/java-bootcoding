package com.bootcoding.java;

public class spectacles {

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
        spectacles b1=new spectacles();
        b1.dimensions= 54;
        b1.Brand="crisaal";
        b1.color="Red";
        b1.Type="UV protection";
        b1.print();
    }
}
