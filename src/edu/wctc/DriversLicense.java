package edu.wctc;

import java.sql.Driver;

public class DriversLicense {
    private String soundexCode;
    private int firstNameMiddleInitial;
    private int birthYear;
    private int birthMonthDayGender;
    private int overflow;

    DriversLicense() {

    }

    public String getSoundexCode() {
        return soundexCode;
    }

    public void setSoundexCode(String soundexCode) {
        this.soundexCode = soundexCode;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getFirstNameMiddleInitial() {
        return firstNameMiddleInitial;
    }

    public void setFirstNameMiddleInitial(int firstNameMiddleInitial) {
        this.firstNameMiddleInitial = firstNameMiddleInitial;
    }

    public int getBirthMonthDayGender() {
        return birthMonthDayGender;
    }

    public void setBirthMonthDayGender(int birthMonthDayGender) {
        this.birthMonthDayGender = birthMonthDayGender;
    }

    public int getOverflow() {
        return overflow;
    }

    public void setOverflow(int overflow) {
        this.overflow = overflow;
    }
}
