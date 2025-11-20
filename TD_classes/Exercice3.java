package TD_classes;

public class Exercice3 {
    public static class User{
        private String username;
        private String email;
        public User(String u,String e){
            this.username=u;
            this.email=e;
        }
        public String toString(){
            return "Username: "+username+" ,Email: "+email;
        }
    }
    public static void main(String args[]){
        User u1=new User("Aissam","Aissam@gmail.com");
        User u2=new User("Mohamed","Mohamed@gmail.com");
        System.out.println(u1.toString());
        System.out.println(u2.toString());
        u2=u1;
        System.out.println(u1==u2);
        //True
    }
}
