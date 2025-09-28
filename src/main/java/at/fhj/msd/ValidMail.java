package at.fhj.msd;

public class ValidMail {

    public boolean isValid(String email){
        int atCounter=0;
        if (email==null||email.isBlank())
            throw new IllegalArgumentException();
        for(int i=0;i<email.length();i++){
            char ch= email.charAt(i);
            if (ch=='@')
            atCounter++;
        }
        // if(atCounter!=1|| email.startsWith("@")||email.endsWith("@")||!email.endsWith(".com"))
        //     return false;
        
        // return true;
        
        return atCounter==1 && !email.startsWith("@")&&!email.endsWith("@")&&email.endsWith(".at");

        
    }
}