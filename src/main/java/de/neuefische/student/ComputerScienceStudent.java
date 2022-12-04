package de.neuefische.student;

import de.neuefische.student.Citizen;

public class ComputerScienceStudent implements Citizen {

    @Override
    public String getAddress() {
        return "Address computer student";
    }

    @Override
    public int getIdentityCardNumber() {
        return 2;
    }
}
