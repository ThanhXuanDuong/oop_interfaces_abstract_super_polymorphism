package de.neuefische.smartphone;

import lombok.AllArgsConstructor;

import java.util.Objects;


@AllArgsConstructor

public abstract class Contact {
    protected String name;

    public Contact() {
    }

    protected String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                '}';
    }
}
