package edu.wctc;

import java.time.DateTimeException;
import java.time.LocalDate;

public class MonthDayGenderUtility {
    final private int MOD_MALE = 0;
    final private int MOD_FEMALE = 500;
    final private char CODE_MALE = 'M';
    final private char CODE_FEMALE = 'F';

    public int encodeMonthDayGender( int year, int month, int day, char gender) throws InvalidBirthdayException, UnknownGenderCodeException {
        if (gender == CODE_FEMALE || gender == CODE_MALE) {
            if(isDateValid(year, month, day)) {
                return (month - 1) * 40 + day + (gender == CODE_FEMALE ? MOD_FEMALE : MOD_MALE);
            } else {
                throw new InvalidBirthdayException(year, month, day);
            }
        } else {
            throw new UnknownGenderCodeException(gender);
        }
    }

    public static boolean isDateValid(int year, int month, int day) {
        boolean dateIsValid = true;
        try {
            LocalDate.of(year, month, day);
        } catch (DateTimeException e) {
            dateIsValid = false;
        }
        return dateIsValid;
    }

}
