package de.neuefische;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BiologyStudent implements Citizen{

    @Override
    public String getAddress() {
        return "Address biology student";
    }

    @Override
    public int getIdentityCardNumber() {
        return 1;
    }
}
