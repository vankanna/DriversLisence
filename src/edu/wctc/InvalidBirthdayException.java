package edu.wctc;

public class InvalidBirthdayException extends Exception {
    public InvalidBirthdayException(int year, int month, int day) {
        super("Invalid birthday - year " + year + " - month " + month + " - day " + day);
    }
}