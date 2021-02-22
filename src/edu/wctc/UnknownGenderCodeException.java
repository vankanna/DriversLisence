package edu.wctc;

public class UnknownGenderCodeException extends Exception {
    public UnknownGenderCodeException(char genderCode) {
        super("Given gender code is not known - " + genderCode);
    }
}