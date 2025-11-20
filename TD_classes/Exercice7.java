package TD_classes;

public class Exercice7 {
    public static final class Email{
        private final String value;
        public Email(String v){
            if(v==null || !v.contains("@"))
                throw new IllegalArgumentException("chaine doit etre non null et contient un @!");
            else
                this.value=v;
        } 
        public String getValue(){return this.value;}
        public String toString() {
            return "Email: "+value;
        } 
    }
    public static void main (String args[]){
        Email e=new Email("aaaaa@gmail.com");
        System.out.println(e.toString());
    }
}
