package edu.wctc;

public class WisconsinFormatter implements DriversLicenseFormatter {
    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) throws MissingNameException {
        //SSSS-FFFY-YDDD-NN

        return String.format("%s-%s%c-%c%03d-00",
                driversLicense.getSoundexCode(),
                driversLicense.getFirstNameMiddleInitial(),
                String.valueOf(driversLicense.getBirthYear()).charAt(0),
                String.valueOf(driversLicense.getBirthYear()).charAt(1),
                driversLicense.getBirthMonthDayGender());
    }
}
