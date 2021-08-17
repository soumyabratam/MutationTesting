package org.vodqa;

public class Matchmaker {
    enum Gender {
        MALE, FEMALE;
    }

    public boolean isEligibleForMarriage(int age, Gender gender) {
        if (gender == Gender.FEMALE) {
            return age >= 18;
        } else
            return age >= 21;
    }
}

