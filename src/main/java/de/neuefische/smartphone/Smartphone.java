package de.neuefische.smartphone;

import java.util.Arrays;
import java.util.Objects;

public class Smartphone implements Radio, GPS {
    private String model;
    private String brand;
    private Contact[] contacts;

    public Smartphone() {
    }

    public Smartphone(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return Objects.equals(model, that.model) && Objects.equals(brand, that.brand) && Arrays.equals(contacts, that.contacts);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(model, brand);
        result = 31 * result + Arrays.hashCode(contacts);
        return result;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", contacts=" + Arrays.toString(contacts) +
                '}';
    }


    public Contact[] addContact(Contact newContact){
        contacts=Arrays.copyOf(contacts,contacts.length+1);
        contacts[contacts.length-1]=newContact;
        return contacts;
    }

    public Contact getContact(int index){
        return contacts[index];
    }

    public Contact[] getContactByName(String name){
        Contact[] result= new Contact[10];
        int j=0;
        for (int i=0; i< contacts.length;i++) {
            if (contacts[i].name.equals(name)){
                result[j]=contacts[i];
                j++;
            }
        }
        return result;
    }

    public Contact[] removeContactByName(String name){
        Contact[] newList= new Contact[contacts.length];
        int j=0;
        for (int i=0; i< contacts.length;i++) {
            if (!contacts[i].name.equals(name)){
                newList[j]=contacts[i];
                j++;
            }
        }
        contacts=newList;
        return contacts;
    }


}
