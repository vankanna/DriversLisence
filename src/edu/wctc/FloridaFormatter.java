package edu.wctc;

public class FloridaFormatter implements DriversLicenseFormatter {
    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {
        //SSSS-FFF-YY-DDD-N
        return String.format("%s-%s-%s-%03d-0",
                driversLicense.getSoundexCode(),
                driversLicense.getFirstNameMiddleInitial(),
                driversLicense.getBirthYear(),
                driversLicense.getBirthMonthDayGender());
    }
}
