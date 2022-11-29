package de.neuefische;

public class Main {
    public static void main(String[] args) {
        Citizen bioStudent1=new BiologyStudent();
        Citizen computerStudent1=new ComputerScienceStudent();
        Citizen[] students={bioStudent1,computerStudent1};
        System.out.println(students[1].getAddress());
        System.out.println(computerStudent1.getIdentityCardNumber());


    }
}