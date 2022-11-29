package de.neuefische;

public class Friend extends Contact{
    protected String telefonNumber;

    public Friend() {
        super();
    }

    public Friend(String name, String telefonNumber) {
        super(name);
        this.telefonNumber = telefonNumber;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "telefonNumber=" + telefonNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
