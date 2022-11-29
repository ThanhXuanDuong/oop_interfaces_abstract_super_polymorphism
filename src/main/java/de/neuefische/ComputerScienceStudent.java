package de.neuefische;

public class ComputerScienceStudent implements Citizen{

    @Override
    public String getAddress() {
        return "Address computer student";
    }

    @Override
    public int getIdentityCardNumber() {
        return 2;
    }
}
