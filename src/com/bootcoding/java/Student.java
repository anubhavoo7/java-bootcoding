package com.bootcoding.java;

import java.util.Random;

public class Student{
    int rollNo;
    int physicsMarks;
    int chemistryMarks;
    int mathsMarks;
    double avgMarks;
    double percentage;

    public void print(){
        System.out.println("Physics Marks: "+physicsMarks);
        System.out.println("Chemistry Marks: "+chemistryMarks);
        System.out.println("Maths Marks: "+mathsMarks);
        System.out.println("Average Marks: "+avgMarks);
        System.out.println("Percentage: "+percentage);
    }
    public void calculateAverage(){
        avgMarks=(physicsMarks+chemistryMarks+mathsMarks)/3;
    }
    public void calculatePercentage(){
        percentage=((physicsMarks+chemistryMarks+mathsMarks)/300.00)*100.00;
    }

    public static void main(String[] args) {

        Random random = new Random();

        for(int i=0;i<50;i++) {

            Student s1 = new Student();
            s1.physicsMarks = 10 + random.nextInt(90);
            s1.chemistryMarks = 10 + random.nextInt(90);
            s1.mathsMarks = 10 + random.nextInt(90);
            s1.calculateAverage();
            s1.calculatePercentage();
            s1.print();
        }

        }

    }



