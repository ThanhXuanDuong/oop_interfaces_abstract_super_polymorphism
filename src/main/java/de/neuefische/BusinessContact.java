package de.neuefische;

import java.util.Objects;

public class BusinessContact extends Friend{
    private String companyName;

    public BusinessContact(String name, String telefonNumber, String companyName) {
        super(name, telefonNumber);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BusinessContact that = (BusinessContact) o;
        return Objects.equals(companyName, that.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), companyName);
    }

    @Override
    public String toString() {
        return "BusinessContact{" +
                "companyName='" + companyName + '\'' +
                ", telefonNumber='" + telefonNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
