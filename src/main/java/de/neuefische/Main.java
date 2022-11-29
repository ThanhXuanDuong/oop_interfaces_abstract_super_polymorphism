package de.neuefische;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Contact friend1 = new Friend("Tobi","0123456");
        System.out.println(friend1);

        Contact college1 = new BusinessContact("Bob","4562354","Apple");
        System.out.println(college1);

        Smartphone contactList=new Smartphone(new Contact[]{new Friend("Tobi","0123456"),
                new Friend("Max","0157334"),
                new BusinessContact("Bob","4562354","Apple")});
        //Add contact
        contactList.addContact(new Friend("Bob","0245677"));
        System.out.println(contactList);

        //Get contact
        System.out.println(contactList.getContact(2).toString());

        //Get contact by name
        System.out.println(Arrays.toString(contactList.getContactByName("Bob")));

        //Remove contact by name
        System.out.println(Arrays.toString(contactList.removeContactByName("Max")));

    }


}