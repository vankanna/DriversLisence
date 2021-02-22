package edu.wctc;

public interface DriversLicenseFormatter {
    String formatLicenseNumber(DriversLicense driversLicense) throws MissingNameException;
}
