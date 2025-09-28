package at.fhj.msd;

public class ValidMail {

    public static boolean isValid(String email){
        return email.startsWith("@")&& email.endsWith(".com"); 
    }
}