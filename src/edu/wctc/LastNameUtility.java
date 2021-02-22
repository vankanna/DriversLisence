package edu.wctc;

public class LastNameUtility {
    final private Soundex soundex = new Soundex();

    public static String encodeLastName(String lastname) throws MissingNameException {
        if(lastname == null || lastname.isEmpty()){
            throw new MissingNameException("Last Name");
        } else {
            return Soundex.createSoundex(lastname);
        }
    }
}
